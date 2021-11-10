package com.Group_10_Automation;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_01_VerifyHr_login {

        public static void main(String[] args) {
            String url = "https://login2.nextbasecrm.com/";
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.get(url);

            WebElement logInField = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
            logInField.sendKeys("helpdesk19@cybertekschool.com");
            WebElement passwordField = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            passwordField.sendKeys("UserUser");
            WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
            logInButton.click();

            String actualTitle = driver.getTitle();
            String expectedTitle = "(48) Portal";

            System.out.println(actualTitle.equals(expectedTitle)? "PASSED": "FAILED");





        }
    }


