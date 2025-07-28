package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoId {

    WebDriver driver;

    @Test
    public void DemoTestId() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
        driver.manage().window().maximize();

        // Enter Email
        driver.findElement(By.id("log_email")).sendKeys("shirsasen199@gmail.com");

        // Enter Password
        driver.findElement(By.name("log_password")).sendKeys("shirsasen");

        // Click Remember Me checkbox
        driver.findElement(By.xpath("//input[@name='persist']")).click();

        // Small wait to ensure the login button is loaded
        Thread.sleep(2000); // Replace with WebDriverWait for better practice

        // Use a more reliable XPath or name locator for the login button
        WebElement loginButton = driver.findElement(By.name("log_submit"));
        loginButton.click();

        // Optional: wait to see the result
        Thread.sleep(3000);

        driver.quit();
    }
}
