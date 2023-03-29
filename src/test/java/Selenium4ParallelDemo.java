import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
 
public class Selenium4ParallelDemo extends BaseTest {
 
	/* Равносторонний треугольник*/
	 @Test
	    public void test1 () throws Throwable {
		 getDriver().findElement(By.name("vz")).click();
		 getDriver().findElement(By.name("vz")).sendKeys("1");
		 getDriver().findElement(By.name("vc")).click();
		 getDriver().findElement(By.name("vc")).click();
		 getDriver().findElement(By.name("vc")).clear();
		 getDriver().findElement(By.cssSelector("tr:nth-child(5) input")).click();
	    assertEquals(getDriver().findElement(By.cssSelector("h3")).getText(), ("Equilateral Triangle"));
	      }
	 
	/* Прямоугольный треугольник */
	    @Test
	    public void test2 () throws Throwable {
	    	getDriver().findElement(By.name("vc")).click();
	    	getDriver().findElement(By.name("vc")).clear();
	    	getDriver().findElement(By.name("vc")).sendKeys("90");
	    	getDriver().findElement(By.cssSelector("tr:nth-child(5) input")).click();
		    assertEquals(getDriver().findElement(By.cssSelector("h3")).getText(), ("Right Isosceles Triangle"));
	    }
	   

}