# Selenium Grid. Кросс-браузерное тестирование.

Порядок выполнения работы:

1. Скачаем Selenium Server.

2. Создадим на диске C папку seleniumgrid и скопируем в нее скачанный файл selenium_server_x.xx.x.jar.

3. Создадим новый Maven-проект для автоматизации тестирования в Eclipse.

4. Добавим в проект Maven библиотеку TestNG.

5. Создадим тестовый класс в TestNG.

6. Создадим testng.xml и распараллелим тесты.

7. В папке C:\seleniumgrid  создадим пакетный файл start1.bat, в который запишем:

cmd /C start java -jar selenium-server-4.8.1.jar hub  
cmd /C start java -jar selenium-server-4.8.1.jar node --max-sessions 4

8. Запустим start1.bat и откроем http://localhost:4444/grid/console.
![Selenium Grid_page_1](https://user-images.githubusercontent.com/127390983/228629169-7763c41a-7cff-4eb2-b35e-916ca5cf221e.jpg)


9. Можно рапределить браузеры по узлам, в start2.bat запишем:
 
cmd /C start java -jar selenium-server-4.8.1.jar hub  
cmd /C start java -jar selenium-server-4.8.1.jar node --max-sessions 4 --port 5555 --driver-implementation "chrome"  
cmd /C start java -jar selenium-server-4.8.1.jar node --max-sessions 4 --port 5556 --driver-implementation "firefox"

10. Запустим start2.bat и откроем http://localhost:4444/grid/console.
![Selenium Grid_page_1](https://user-images.githubusercontent.com/127390983/228631571-82216925-f4f8-4d96-8205-577c6900ee7e.jpg)


11. Добавим в pom.xml зависимость testng.

12. Запустим тесты в Eclipse.
![1](https://user-images.githubusercontent.com/127390983/228631267-0392ffc8-87b6-4fce-a250-84f9483a23a1.png)
