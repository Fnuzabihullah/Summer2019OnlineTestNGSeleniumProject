package TestDay4;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class ReadAttributesTest {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        
    }
}
