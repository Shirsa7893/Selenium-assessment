package com.Edgebrowser1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencart {

		

		   public static void main(String[] args) {
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://demo.opencart.com/");
		        driver.manage().window().maximize();
		        String URL = driver.getCurrentUrl();
		        System.out.println(URL);
		        String Title = driver.getTitle(); 
		        System.out.println(Title);
		        String pageSource = driver.getPageSource();
		        System.out.println(pageSource);
		    }
		}




