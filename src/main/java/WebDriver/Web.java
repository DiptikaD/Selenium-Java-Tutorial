package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Web {
    public static void main(String[] args) {
        // System property for EdgeDriver, can use any other browser driver here
        System.setProperty("webdriver.edge.driver", "C:/Users/DiptikaDevi/Downloads/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
    }
}
