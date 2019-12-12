package TestDay12;

import TestDay3.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserFactory;
public class FramesPractice {
    private WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/frames");
    }
    @Test(description = "iFrame example")
    public void test1(){
        driver.findElement(By.linkText("iFrame")).click();
        //since element inside a frame, element is not visible for selenium
        //without switching to the frame
        //we can switch to frame based on id, name, index(starting from 0), web element
        driver.switchTo().frame("mce_0_ifr");
        //WITHOUT SWITCHING, WE CANNOT SEE INNER HTML DOCUMENT
        // which one to use? id, name, index, webelement?
        //1. id or name  <iframe id="mce_0_ifr" name="some_frame">
        //2. webelment driver.findElement(By.cssSelector("iframe[class='some_frame']"));
        //3. index [iframe1, iframe2, iframe3...]
        WebElement inputArea = driver.findElement(By.id("tinymce"));
        String expectedText= "Your content goes here.";
        String actualText = inputArea.getText();
        Assert.assertEquals(actualText, expectedText);
        BrowserUtils.wait(2);
        inputArea.clear();
        BrowserUtils.wait(2);
        inputArea.sendKeys("Java is fun!");
        //to exit from the frame
        driver.switchTo().defaultContent();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
