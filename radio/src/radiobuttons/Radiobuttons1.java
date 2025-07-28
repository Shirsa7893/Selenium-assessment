package radiobuttons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class Radiobuttons1 {
    WebDriver driver;
    @Test
    public void TestPopups() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Shirsa Sen\\\\spring-workspace14\\\\radio\\\\EdgeBrowserJars\\\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/");
        int radioBtnCount = driver.findElements(By.xpath("//input[@type='radio']")).size();
        System.out.println("Number Of Radio Buttons: " + radioBtnCount);
        driver.quit();
    }
}