package TestDay1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumScript {

    public static void main(String[] args) {
        //we have to setup webdriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
        //we need to creat an object of appropriate class
        ChromeDriver driver = new ChromeDriver();
        //lets open the google.com
        driver.get("http://google.com");
        String actualResult =driver.getTitle();
        String expectedResult = "Google";
        if (actualResult.equals(expectedResult)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        driver.close();
    }
}
