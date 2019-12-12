package com;

import TestDay3.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTruck {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //Go to the login page
        driver.get("https://qa2.vytrack.com/user/login");
        //Enter valid credentials
        WebElement input1 = driver.findElement(By.name("_username"));
        WebElement input2 = driver.findElement(By.name("_password"));
        input1.sendKeys("storemanager230");
        input2.sendKeys("UserUser123");
       Thread.sleep(3000);
        //click login
        WebElement logInButton = driver.findElement(By.id("_submit"));

        logInButton.submit();
        BrowserUtils.wait(5);
        //verify login is successful
        String expectedMessage = "https://qa2.vytrack.com/";
        String actualMessage = driver.getCurrentUrl();
        if(actualMessage.equals(expectedMessage)){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }
        driver.close();
    }
    }

