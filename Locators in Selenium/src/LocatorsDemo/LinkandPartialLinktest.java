package LocatorsDemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LinkandPartialLinktest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\nitikran\\Documents\\LEARNING\\Selenium Examples\\Selenium Edge Browser Launch\\EdgeBrowserJars\\msedgedriver.exe" );
		driver =new EdgeDriver();
	}
	
	@Test
	public void  DemoTestID() throws Exception {
		
		driver.get("https://www.hollandandbarrett.com");
		driver.findElement(By.partialLinkText("Vitamins")).click();
		
		List<WebElement>allList=driver.findElements(By.tagName("a"));
		int cnt=allList.size();
		System.out.println(cnt);
		
		for(int i =0;i<cnt;i++) {
			System.out.println(allList.get(i).getText());
			String str=allList.get(i).getText();
			String str1="Vitamins";
			if(str==str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("//a[@aria-label='Vitamins & Supplements']")).click();
			}
		}
		
		
		
	
	}
	
}