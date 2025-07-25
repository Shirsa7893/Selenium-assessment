package com.Edgebrowser1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowserdemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Shirsa Sen\\spring-workspace9\\Selenium Edge Browser\\EdgeBrowserJars\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    //driver.manage().window().minimize();
   
   driver.get("https://demo.opencart.com/");
   driver.manage().window().maximize();
   
    driver.get("http://www.bing.com/");
    driver.manage().window().maximize();
    
    driver.get("https://www.freecrm.com/");
    driver.manage().window().maximize();
    
    	driver.get("http://www.half.ebay.com/");
    	 driver.manage().window().maximize();
    	   
    	


}

}
	

