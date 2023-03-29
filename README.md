# Selenium-Grid-TestNG

Порядок выполнения работы:

1. Скачаем Selenium Server.

2. Создадим на диске C папку seleniumgrid и скопируем в нее скачанный файл selenium_server_x.xx.x.jar.

3. Создадим новый Maven-проект для автоматизации тестирования в Eclipse.

4. Добавим в проект Maven библиотеку TestNG.

5. Создадим тестовый класс в TestNG.

6. Создадим testng.xml и распараллелим тесты.

7. В папке C:\seleniumgrid  создадим пакетный файл start.bat, в который запишем:

8. Запустим start.bat и откроем http://localhost:4444/grid/console.

9. Добавим в pom.xml зависимость testng.

10. Запустим тесты в Eclipse.
