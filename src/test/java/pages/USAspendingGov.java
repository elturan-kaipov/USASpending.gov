package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class USAspendingGov {

    WebDriver driver;

    public USAspendingGov() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "(//div[@class='nav-dropdown'])[1]")
    public WebElement awardSearchOption;

    @FindBy (xpath = "/html//div[@id='app']//header[@class='site-header__wrapper']/nav[@class='site-navigation']//ul[@role='menu']/" +
            "li[2]//button[@title='Award Search: Search through awards and discover trends and connections']")
    public WebElement awardSearchOption2;

    @FindBy (css = "#app > div > div > div.site-header > header > nav > " +
            "div > div.site-navigation__menu.full-menu > ul > li:nth-child(2) > div > button > div.nav-dropdown__parent-icon > svg")
    public WebElement awardSearchExpandMenuButton;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[2]/div/div/ul/li[1]")
    public WebElement awardSearchDropDownButton;
}