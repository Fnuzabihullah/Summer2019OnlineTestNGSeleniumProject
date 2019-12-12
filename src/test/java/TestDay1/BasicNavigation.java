package TestDay1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        //we want to navigate, to the different page
        driver.navigate().to("http://amazon.com");
        //if I want to comeback, to the previous page
        driver.navigate().back();
        //if I want to know URL of current website
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //selenium cannot close browser automatically
        //for this, we use method close()
        driver.quit();
    }

}
