package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Web {
    public static void main(String[] args) {
        // System property for EdgeDriver, can use any other browser driver here
        System.setProperty("webdriver.edge.driver", "C:/Users/DiptikaDevi/Downloads/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        try {
            // Site to open in the driver
            driver.get("https://www.geeksforgeeks.org/");

            // logic
            String pageTitle = driver.getTitle();
            System.out.println("Page Title: " + pageTitle);

            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
