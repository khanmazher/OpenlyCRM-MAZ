package com.OpenlyMAZ.stepDefinition;


import com.OpenlyMAZ.pages.BasePage;
import com.OpenlyMAZ.pages.EventsPage;
import com.OpenlyMAZ.pages.LoginPage;
import com.OpenlyMAZ.utilities.BrowserUtils;
import com.OpenlyMAZ.utilities.ConfigurationReader;
import com.OpenlyMAZ.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EventsPageStepsDefs extends BasePage {
    LoginPage loginPage=new LoginPage();

    //Select selectByValue = new Select(driver.findelement(By.name("TZ_FROM")));
    EventsPage eventsPage = new EventsPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Then("the user enters by using {string} and {string}")
    public void the_user_enters_by_using_and(String string, String string2) {

        loginPage.login(string, string2);

    }
    @Then("the user should be on the home page")
    public void the_user_should_be_on_the_home_page() {
        String expectedTitle = "Portal";
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    @When("the user should click the events button")
    public void the_user_should_click_the_events_button() {
        BrowserUtils.waitFor(2);
        eventsPage.Event.click();
    }
    @When("the user writes {string} as an event name")
    public void the_user_writes_as_an_event_name(String string) {
        BrowserUtils.waitFor(2);
        eventsPage.eventName.sendKeys(string);
    }

    @Then("the user clicks send button")
    public void the_user_clicks_send_button() {
        eventsPage.sendButton.click();
    }
    @Then("the user sees {string} as an event name on the page")
    public void the_user_sees_as_an_event_name_on_the_page(String string) {
        Assert.assertTrue("Message is NOT displayed",Driver.get().findElement(By.xpath("//*[text()='" + string + "']")).isDisplayed());

    }

}


/*
    @Then("the user select the start date")
    public void the_user_select_the_start_date() {
        eventsPage.dateFrom.click(); //select method required
    }

    @Then("the user selects the start time")
    public void the_user_selects_the_start_time() {
        eventsPage.timeFrom.click(); //select method required
    }

    @Then("the user selects the end date")
    public void the_user_selects_the_end_date() {
        eventsPage.dateTo.click(); //select method required
    }

    @Then("the user selects the end time")
    public void the_user_selects_the_end_time() {
        eventsPage.timeTo.click(); //select method required
    }

    @Then("the user selects the start time zone")
    public void the_user_selects_the_start_time_zone() {
        eventsPage.timezoneFrom.click(); //select method required



        //eventsPage.eventLocation.findElement(By.id("feed-cal-tz-fromcal_3Jcl"));
        Select timeZoneValue = new Select(driver.findelement(By.name())); //(driver.findelement(By.name("TZ_FROM")));
        timeZoneValue.selectByValue("Europe/Istanbul");
    }

    @Then("the user selects the end time zone")
    public void the_user_selects_the_end_time_zone() {
        eventsPage.timezoneTo.click(); //select method required
        Select selectByValue = new Select; //(driver.findelement(By.name("TZ_FROM")));
        selectByValue.selectByVisibleText("Europe/Istanbul");
    }

    @When("the user selects event location as Western meeting room")
    public void theUserSelectsEventLocationAsWesternMeetingRoom() {
        eventsPage.eventLocation.click();
        Select selectByDisplayName = new Select();
        selectByDisplayName.selectByVisibleText("West Meeting Room");

    }

    @When("User clicks on {string}")
    public void userClicksOn() {
        eventsPage.email.click();
    }

    @Then("User clicks on Employees and Departments")
    public void userClicksOnEmployeesAndDepartments() {
        eventsPage.departments.click();
    }

    @And("User selects persons, groups or departments from the available options")
    public void userSelectsPersonsGroupsOrDepartmentsFromTheAvailableOptions() {
        eventsPage.user1.click();//select method required
        eventsPage.user2.click();//select method required
        eventsPage.user3.click();//select method required
        eventsPage.user4.click();//select method required
    }

    @When("User clicks on more button")
    public void userClicksOnMoreButton() {
        eventsPage.moreButton.click();
    }

    @Then("user clicks on event accessibility and selects free")
    public void userClicksOnEventAccessibilityAndSelectsFree() {
        eventsPage.eventAccessibility.click(); //select method require
    }

    @Then("user clicks on repeat option and selects never")
    public void userClicksOnRepeatOptionAndSelectsNever() {
        eventsPage.repeatBox.click(); //select method required
    }

    @Then("the user clicks on event importance and selects normal")
    public void theUserClicksOnEventImportanceAndSelectsNormal() {
        eventsPage.eventImportance.click(); //select method required
    }

    @And("the user clicks send button")
    public void theUserClicksSendButton() {
        eventsPage.sendButton.click();
    }

}
*/