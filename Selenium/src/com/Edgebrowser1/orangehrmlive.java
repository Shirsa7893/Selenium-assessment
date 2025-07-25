package com.Edgebrowser1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmlive {
	

	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        String URL = driver.getCurrentUrl();
	        System.out.println(URL);
	        String Title = driver.getTitle(); 
	        System.out.println(Title);
	        String pageSource = driver.getPageSource();
	        System.out.println(pageSource);
	    }
	}


