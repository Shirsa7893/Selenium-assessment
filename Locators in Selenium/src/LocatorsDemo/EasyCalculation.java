package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EasyCalculation {
	WebDriver driver;

    @Test
    public void DemoTestId() throws InterruptedException {
        driver = new ChromeDriver();
        
        driver.get("https://www.bing.com/search?pglt=43&q=easy+calculations&cvid=442ef200c1ef482a89d82ba81ada9c43&gs_lcrp=EgRlZGdlKgYIABBFGDkyBggAEEUYOTIGCAEQABhAMgYIAhAAGEAyBggDEAAYQDIGCAQQABhAMgYIBRAAGEAyBggGEAAYQDIGCAcQABhAMgYICBAAGEDSAQg3MzcwajBqMagCALACAA&FORM=ANNTA1&PC=W251&ntref=1");
        driver.manage().window().maximize();

        // Enter Email
       // driver.findElement(By.id("log_email")).sendKeys("shirsasen199@gmail.com");

        // Enter Password
        driver.findElement(By.xpath("//*[@id=\"sb_form_go\"]")).click();

        driver.findElement(By.name("go")).sendKeys("easy calculations");
        
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/main[1]/ol[1]/li[2]/h2[1]/a[1]")).click();
        
        
        driver.findElement(By.xpath("//button[@class='search_button']")).click();
        driver.findElement(By.name("<button class=\"search_button\"></button>")).sendKeys("Bangalore");
        

        // Click Remember Me checkbox

        // Small wait to ensure the login button is loaded
      //  Thread.sleep(2000); // Replace with WebDriverWait for better practice

        // Use a more reliable XPath or name locator for the login button
       // WebElement loginButton = driver.findElement(By.name("log_submit"));
       // loginButton.click();

        // Optional: wait to see the result
       // Thread.sleep(3000);
          
        // driver.quit();
    }
}


	
	


