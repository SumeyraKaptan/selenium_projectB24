package com.cybertek.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailAutomate {
    public static String email () {
        String url = "https://temp-mail.org/en/";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(url);

        WebElement tempEmail = driver.findElement(By.cssSelector("input[id='mail']"));

        String email = tempEmail.getText();
        driver.quit();


        return email;


    }
}
