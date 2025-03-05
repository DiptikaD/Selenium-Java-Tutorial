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
Now we have communication between the code and the site.
Here is the Web.java so far:
```java
package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Web {
    public static void main(String[] args) {
        // System property for EdgeDriver, can use any other browser driver here
        System.setProperty("webdriver.edge.driver", "C:/Users/DiptikaDevi/Downloads/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        // Site to open in the driver
        driver.get("https://www.geeksforgeeks.org/");

        // logic
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
    }
}

```
Next steps are to account for exceptions
11. Wrap the site + logic in a try, catch with an InterruptedException
12. The JDK doesn't like the Exception, so we add at the end of the try block a Thread.sleep 
```java
try {
            driver.get("https://www.geeksforgeeks.org/");
            
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
```
13. Finally add a Finally with a driver.quit() to exit the browser

The entire code for Web.java:
```java
package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Web {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/Users/DiptikaDevi/Downloads/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        try {
            driver.get("https://www.geeksforgeeks.org/");
            
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

```