

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class openbrowser {

    public static void main(String[] args) {
        // Automatically download the appropriate WebDriver binary
        //WebDriverManager.chromedriver().setup();

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to a specific URL
        driver.get("https://www.example.com");

        // Perform actions on the web page...
        
        // Close the browser
        driver.quit();
    }
}
