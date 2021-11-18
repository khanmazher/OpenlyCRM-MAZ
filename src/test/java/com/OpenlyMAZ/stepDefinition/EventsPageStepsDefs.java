package com.OpenlyMAZ.stepDefinition;


import com.OpenlyMAZ.pages.BasePage;
import com.OpenlyMAZ.pages.EventsPage;
import com.OpenlyMAZ.utilities.BrowserUtils;
import com.OpenlyMAZ.utilities.ConfigurationReader;
import com.OpenlyMAZ.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user selects the start time zone")
    public void the_user_selects_the_start_time_zone() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user selects the end time zone")
    public void the_user_selects_the_end_time_zone() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
