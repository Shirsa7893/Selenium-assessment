package com.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "");//Only for Edge Browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        String Title = driver.getTitle(); //I Opened Browser
        System.out.println(Title);
        driver.quit();// Quit entire browser
    }
}


