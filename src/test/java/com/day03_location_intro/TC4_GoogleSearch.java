package com.day03_location_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        String url ="https://www.google.com";
        driver.get(url);
        //locate and type "apple" to google search

        driver.findElement(By.name("q")).sendKeys("apple");


        driver.quit();
    }
}
