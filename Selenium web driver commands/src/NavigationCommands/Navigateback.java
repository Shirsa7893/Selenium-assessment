package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateback {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        Thread.sleep(2000); // For demonstration purposes only

        
        driver.navigate().to("https://demo.opencart.com/");
        System.out.println("Navigated to OpenCart");
        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(2000);

        
        driver.navigate().to("http://www.bing.com");
        System.out.println("Navigated to Bing");
        System.out.println("URL: " + driver.getCurrentUrl());

        Thread.sleep(2000);

        
        driver.navigate().to("https://www.freecrm.com/");
        System.out.println("Navigated to FreeCRM");
        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(2000);

        
        driver.navigate().to("http://www.half.ebay.com");
        System.out.println("Navigated to Half eBay");
        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(2000);

        
        driver.navigate().back();
        System.out.println("After navigate().back(), Current URL: " + driver.getCurrentUrl());

        Thread.sleep(2000);

       
        driver.navigate().forward();
        System.out.println("After navigate().forward(), Current URL: " + driver.getCurrentUrl());

        Thread.sleep(2000);

       
        driver.navigate().refresh();
        System.out.println("Page refreshed");

        
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        
        driver.quit();
    }
}
