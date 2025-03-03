## Using Selenium with Java
1. Create a default Java/Maven project
2. Within src>main>java create WebDriver package and Web.java within it
3. Update the pom.xml in preparation for using Selenium
4. Download the appropriate browser's driver for what your machine will test [here](https://www.selenium.dev/downloads/)
5. Keep noted the directory.
6. In Web.java, import the following:
``` java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;```