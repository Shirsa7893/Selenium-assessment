package radiobuttons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class RadioButton {
    WebDriver driver;
    @Test
    public void TestPopups() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Shirsa Sen\\spring-workspace14\\radio\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/campaign/landing.php?");
        driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        Thread.sleep(3000);
        int radioBtnCount = driver.findElements(By.xpath("//input[@name='sex']")).size();
        System.out.println("Number Of Radio Buttons: " + radioBtnCount);
        driver.quit();
    }
}