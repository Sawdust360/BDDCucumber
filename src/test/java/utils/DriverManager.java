package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static WebDriver getDriver() {
        // This line automatically downloads the appropriate version of the Edge driver
        WebDriverManager.edgedriver().setup(); // Automatically downloads and sets up msedgedriver

        EdgeOptions options = new EdgeOptions();
        // You can configure options here, like running in headless mode
        // options.addArguments("headless");

        return new EdgeDriver(options);
    }
}
