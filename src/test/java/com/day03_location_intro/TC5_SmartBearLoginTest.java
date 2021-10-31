package com.day03_location_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_SmartBearLoginTest {
    public static void main(String[] args) {
        String appUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        String userName = "Tester";
        String password = "test";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(appUrl);

        //enter username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        //enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        //click login
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        //verify title is "Web Orders"
        //click logout link
        //quit browser


        driver.close();
    }
}
