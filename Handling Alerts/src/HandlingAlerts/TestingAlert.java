package HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestingAlert {

    @Test
    public void TestPopups() throws Exception {
        
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Shirsa Sen\\spring-workspace9\\Handling Alerts\\EdgeBrowserJars\\msedgedriver.exe");

       
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        
        driver.findElement(By.name("proceed")).click();

       
        Thread.sleep(5000);

        
        Alert alert = driver.switchTo().alert();

        
        String text = alert.getText();
        System.out.println("Alert Message: " + text);

        if (text.equals("Please enter a valid user name")) {
            System.out.println("Correct alert message");
        } else {
            System.out.println("Incorrect alert message");
        }

        
        alert.accept();

        
        driver.quit();
    }
}

