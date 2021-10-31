package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {
        //1- set up browser driver
        WebDriverManager.chromedriver(). setup();

        //2-open browser
        WebDriver driver = new ChromeDriver();

        //navigate to tesla homepage
        driver.get("https://www.tesla.com");

        //navigate back. similar to clicking back button
        //on the browser
        driver.navigate().back();

        //pause the code. code will sleep/wait


        //navigate forward
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();

        //navigate to esty homepage
        driver.navigate().to("https://www.bestbuy.com");

        //print title of the page
        System.out.println("Current title: " + driver.getTitle());

        //close the browser
        driver.quit();



    }
}
