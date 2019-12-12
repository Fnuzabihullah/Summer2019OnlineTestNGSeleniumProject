package TestDay6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class BitrixLogin {

    public static void main(String[] args) {
        //getDriver()method returnes object
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://login1.nextbasecrm.com/?login=yes");
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk59@cybertekschool.com");
        //enter password
        //* matches any element
        //it's better to specify tag name, to avoid issues with finding element
       driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[starts-with(@value, 'Log')]")).click();
        driver.findElement(By.xpath("//input[starts-with(@value, 'Log')]")).click();
        
        driver. quit();
    }
}
