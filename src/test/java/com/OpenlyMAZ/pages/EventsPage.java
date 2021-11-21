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
    public WebElement eventName;

    /*@FindBy(name = "DATE_FROM")
    public WebElement dateFrom;

    @FindBy(name = "TIME_FROM")
    public WebElement timeFrom;

    @FindBy(name = "DATE_TO")
    public WebElement dateTo;

    @FindBy(name =  "TIME_TO")
    public WebElement timeTo;

    @FindBy(xpath = "//span[.='Specify time zone']")
    public WebElement SpecifyTimezone;

    @FindBy(id = "feed-cal-tz-fromcal_3Jcl")
    public WebElement timezoneFrom;

    @FindBy(id = "feed-cal-tz-tocal_3Jcl")
    public WebElement timezoneTo;

    @FindBy (id = "event-locationcal_3Jcl")
    public WebElement eventLocation;
    //after this I should be able to select the location of the event from drop down list which I am unable to select.

    @FindBy(id = "feed-event-dest-add-link")
    public WebElement email; //here I need to add people to the event

    @FindBy(id = "destDepartmentTab_calnAJEM3")
    public  WebElement departments;

    //@FindBy (xpath = "(//div[.='To all employees'])[1]")
    //public WebElement allEmployee;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public  WebElement user1;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[20]")
    public  WebElement user2;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[100]")
    public  WebElement user3;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[187]")
    public  WebElement user4;

    @FindBy (xpath = "(//span[@class='feed-event-more-link-icon'])[1]")
    public  WebElement moreButton;

    @FindBy(id = "event-accessibilitycal_3Jcl")
    public WebElement eventAccessibility; //further need to select from drop down options

    @FindBy(id = "event-repeatcal_3Jcl")
    public WebElement repeatBox;

    @FindBy(id = "event-importancecal_3Jcl")
    public WebElement eventImportance;*/

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;


}
