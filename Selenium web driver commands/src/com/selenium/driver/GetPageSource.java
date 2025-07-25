package com.selenium.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }
}


