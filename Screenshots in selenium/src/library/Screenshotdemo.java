package library; 

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import library.Reusability; 

public class Screenshotdemo {

    @Test
    public void Browser() throws Exception {
        
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://auth.hollandandbarrett.com/u/login");
        driver.manage().window().maximize();

        
        Reusability.capturedScreenShot(driver, "A. Launch Application - TakeScreenShot");

        
        driver.findElement(By.id("username")).sendKeys("shirsasen199@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Shirsa2002");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@name='action']")).click();

        Reusability.capturedScreenShot(driver, "B. Click Sign In Button - TakeScreenShot");
        
        
        driver.quit();
    }
}
