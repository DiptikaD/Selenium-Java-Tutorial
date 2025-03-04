## Using Selenium with Java
1. Create a default Java/Maven project
2. Within src>main>java create WebDriver package and Web.java within it
3. Update the pom.xml in preparation for using Selenium
4. Download the appropriate browser's driver for what your machine will test [here](https://www.selenium.dev/downloads/)
5. Keep noted the directory.
6. In Web.java, import the following:
``` java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
```
7. Within the class create a psvm and set the property in System for the driver directory
8. Create an instance of WebDriver using the imported Edge Driver
```java
        System.setProperty("webdriver.edge.driver", "C:/Users/DiptikaDevi/Downloads/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
```
9. Create a navigation to the site/app using driver.get()
10. Write the logic 