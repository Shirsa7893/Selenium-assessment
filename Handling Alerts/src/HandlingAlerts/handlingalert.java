package HandlingAlerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class handlingalert {
    WebDriver driver;
    @Test
    public void TestPopups() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Shirsa Sen\\spring-workspace9\\Handling Alerts\\EdgeBrowserJars\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //  Handle Simple Alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        //  Validate result text
        String resultString = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println("Result: " + resultString);
        Assert.assertEquals(resultString, "You successfully clicked an alert");
        //  Handle Confirm Alert (Cancel)
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.dismiss();  // Clicks Cancel
        
        driver.quit();
    }
}