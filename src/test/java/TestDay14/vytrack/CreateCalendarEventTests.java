package TestDay14.vytrack;
import TestDay14.TestBase;
import com.pages.CalendarEventsPage;
import com.pages.CreateCalendarEventPage;
import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateCalendarEventTests extends TestBase {


    @Test(description = "Verify owners name is equals to Stephan Haley (it works on qa1 storemenager85)")
    public void test1(){
        LoginPage loginPage = new LoginPage();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();

        //login as Stephan Haley (storemanager85)
        loginPage.login("storemanager85", "UserUser123");

        //go to calendar events page
        loginPage.navigateTo("Activities", "Calendar Events");

        //click on create calendar event button
        calendarEventsPage.waitUntilLoaderMaskDisappear();
        calendarEventsPage.clickToCreateCalendarEvent();

        calendarEventsPage.waitUntilLoaderMaskDisappear();
        String expectedOwner = "Stephan Haley";
        String actualOwner = createCalendarEventPage.owner.getText().trim();

        Assert.assertEquals(actualOwner, expectedOwner);


    }
}