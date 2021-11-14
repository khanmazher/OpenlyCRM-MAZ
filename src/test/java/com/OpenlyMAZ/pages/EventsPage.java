package com.OpenlyMAZ.pages;

import com.OpenlyMAZ.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventsPage extends BasePage {

    public EventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement Event;

    @FindBy(id = "feed-cal-event-namecal_3Jcl")
    public WebElement EVENT_NAME;

    @FindBy(id = "feed-cal-event-fromcal_0Jcl")
    public WebElement DATE_FROM;

    @FindBy(id = "feed_cal_event_from_timecal_3Jcl")
    public WebElement TIME_FROM;

    @FindBy(id = "feed-cal-event-tocal_3Jcl")
    public WebElement DATE_TO;

    @FindBy(id = "feed_cal_event_to_timecal_3Jcl")
    public WebElement TIME_TO;

    @FindBy(id = "feed-cal-tz-switchcal_3Jcl")
    public WebElement Specifytimezone;

    @FindBy(id = "feed-cal-tz-fromcal_3Jcl")
    public WebElement TZ_FROM;

    @FindBy(id = "feed-cal-tz-tocal_3Jcl")
    public WebElement TZ_TO;

    @FindBy(id = "feed-cal-reminder-contcal_3Jcl")
    public WebElement EVENT_REMINDER;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement EVENT_REMINDER_COUNT;

    @FindBy(id = "event-remind_typecal_3Jcl")
    public WebElement EVENT_REMINDER_TYPE;

    @FindBy(id = "event-locationcal_3Jcl")
    public WebElement EVENT_LOCATION;
    //after this I should be able to select the location of the event from drop down list which I am unable to select.

    @FindBy(id = "event-locationcal_3Jcl")
    public WebElement EVENT_LOCATION;

    @FindBy(id = "feed-event-dest-add-link")
    public WebElement ; //here I need to add people to the event

    @FindBy(id = "feed-cal-additional-show")
    public WebElement ; //here hidden box will open

    @FindBy(id = "event-accessibilitycal_3Jcl")
    public WebElement EVENT_ACCESSIBILITY; //further need to select from drop down options

    @FindBy(id = "event-repeatcal_3Jcl")
    public WebElement EVENT_RRULE[FREQ];

    @FindBy(id = "event-importancecal_3Jcl")
    public WebElement EVENT_IMPORTANCE;

    @FindBy(id = "blog-submit-button-save")
    public WebElement Send;


}
