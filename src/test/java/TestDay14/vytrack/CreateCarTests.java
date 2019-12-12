package TestDay14.vytrack;

import TestDay14.TestBase;
import com.pages.CreateCarPage;
import com.pages.LoginPage;
import com.pages.VehiclesPage;
import org.testng.annotations.Test;


public class CreateCarTests extends TestBase {

    @Test(description = "Create some random car")
    public void test1(){
        extentTest = extentReports.createTest("Create a new car");

        LoginPage loginPage = new LoginPage();
        VehiclesPage vehiclesPage = new VehiclesPage();
        CreateCarPage createCarPage = new CreateCarPage();

        loginPage.login("storemanager85", "UserUser123");
        loginPage.navigateTo("Fleet", "Vehicles");

        loginPage.waitUntilLoaderMaskDisappear();

        vehiclesPage.clickToCreateACar();

        loginPage.waitUntilLoaderMaskDisappear();

        createCarPage.licensePlateElement.sendKeys("Random");
        createCarPage.selectTags("Compact");
        createCarPage.selectFuelType("Diesel");

        loginPage.waitUntilLoaderMaskDisappear();
        createCarPage.saveAndCloseButtonElement.click();

        extentTest.pass("New car was created");
    }
}