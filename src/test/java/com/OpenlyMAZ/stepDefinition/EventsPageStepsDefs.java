package com.OpenlyMAZ.stepDefinition;


import com.OpenlyMAZ.pages.BasePage;
import com.OpenlyMAZ.pages.EventsPage;
import com.OpenlyMAZ.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventsPageStepsDefs extends BasePage {
    EventsPage eventsPage = new EventsPage();

    @When("the user should click the events button")
    public void theUserShouldClickTheEventsButton(){
        BrowserUtils.waitFor(2);
        eventsPage.Event.click();
    }

    @Then("the user adds Event name")
    public void theUserInputsEventName(){
        BrowserUtils.waitFor(2);
        Event
    }

}
