package screenshots;

import java.io.File;
import org.apache.commons.io.FileUtils; // Required for copying the file
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {

    @Test
    public void Browser() throws Exception {
        // 1. Setup and launch the browser
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php");
        driver.manage().window().maximize();

        // 2. Cast the driver to the TakesScreenshot interface
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 3. Take the screenshot and store it as a file in memory
        File source = ts.getScreenshotAs(OutputType.FILE);

        // 4. Copy the in-memory file to a permanent location on the disk
        FileUtils.copyFile(source, new File("./ScreenShots/FacebookHomepage.png"));
        
        System.out.println("Captured ScreenShot");
        Thread.sleep(5000);

        // 5. Close the browser
        driver.quit();
    }
}
