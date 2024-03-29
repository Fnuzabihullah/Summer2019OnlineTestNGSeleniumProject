package TestDay11;

import TestDay3.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
public class ActionsClassHoverPractice {
    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/hovers");
    }
    @Test(description = "Verify first image")
    public void test1(){
        //create object of actions class to perform actions (drag and drop, context click, move to specific point, etc...)
        Actions action = new Actions(driver);
        WebElement image1 = driver.findElement(By.cssSelector(".figure:nth-of-type(1)"));
        //just to hover on element not click
        // build() is required when we have more than 1 action in a chain
        action.moveToElement(image1).perform();

        BrowserUtils.wait(3);
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
