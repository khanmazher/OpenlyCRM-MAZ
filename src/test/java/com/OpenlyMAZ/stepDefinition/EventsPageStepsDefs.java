package com.OpenlyMAZ.stepDefinition;


import com.OpenlyMAZ.pages.BasePage;
import com.OpenlyMAZ.pages.EventsPage;
import com.OpenlyMAZ.utilities.BrowserUtils;
import com.OpenlyMAZ.utilities.ConfigurationReader;
import com.OpenlyMAZ.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class EventsPageStepsDefs extends BasePage {

    EventsPage eventsPage = new EventsPage();

    @When("the user should click the events button")
    public void theUserShouldClickTheEventsButton(){
        BrowserUtils.waitFor(2);
        eventsPage.Event.click();
    }

    @When("the user writes an event name")
    public void theUserWritesAnEventName() {
        BrowserUtils.waitFor(2);
        eventsPage.eventName.sendKeys("Product Presentation");
    }

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
        eventsPage.eventLocation.findElement(By.id("feed-cal-tz-fromcal_3Jcl"));
        Select.selectByValue("Europe/Istanbul");
    }

    @Then("the user selects the end time zone")
    public void the_user_selects_the_end_time_zone() {
        eventsPage.timezoneTo.click(); //select method required
    }

    @When("the user selects event location as Western meeting room")
    public void theUserSelectsEventLocationAsWesternMeetingRoom() {
        eventsPage.eventLocation.click(); //select method required

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
