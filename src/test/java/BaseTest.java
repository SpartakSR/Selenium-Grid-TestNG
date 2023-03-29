import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
 
public class BaseTest {
 
 
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public static String remote_url = "http://localhost:4444/";
    public static String baseURL = "https://www.calculator.net/triangle-calculator.html";
    public Capabilities capabilities;
 
    @Parameters({"browser"})
    @BeforeMethod
    public void setDriver(String browser) throws MalformedURLException {
         
        System.out.println("Test is running on "+ browser);
 
        if(browser.equals("firefox")) {
            capabilities = new FirefoxOptions();
        } else if (browser.equals("chrome")) {
            capabilities = new ChromeOptions();
        }
 
        driver.set(new RemoteWebDriver(new URL(remote_url), capabilities));
        driver.get().get(baseURL);
        driver.get().manage().window().setSize(new Dimension(1073, 1018));
        driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }
 
    public WebDriver getDriver() {
        return driver.get();
    }
 
    @AfterMethod
    public  void closeBrowser() {
        driver.get().quit();
        driver.remove();
    }
}