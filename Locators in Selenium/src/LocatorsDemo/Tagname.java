package LocatorsDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
    public static void main(String[] args) {

        // Initialize the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.hollandandbarrett.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Find all elements with the tag name "a" (hyperlinks) and store them in a list
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        

        // Print the total number of links found
        System.out.println(allLinks.size());

        // Loop through each element in the allLinks list
        for (WebElement ele : allLinks) {
            System.out.println(ele.isDisplayed());
            System.out.println(ele.isEnabled());
            System.out.println(ele.getAttribute("href"));
        }
        
        WebElement ele = allLinks.get(3);
        ele.click();
        
        // Note: A driver.quit(); call would typically be here to close the browser.
    }
}
