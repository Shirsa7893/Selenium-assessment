package com.EdgeBrowserText;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Shirsa Sen\\spring-workspace9\\Selenium Edge Browser\\EdgeBrowserJars\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.get("https://www.naukri.com/");
    //driver.manage().window().maximize();
    //driver.manage().window().minimize();
   Thread.sleep(2000);
    driver.close();
	}

}
