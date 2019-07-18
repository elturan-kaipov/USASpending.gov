package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Elturan_pages {

    WebDriver driver;

    public Elturan_pages(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='nav-dropdown'])[1]")
    public WebElement awardSearch;


    @FindBy(xpath = "(//a[contains(text(),'Advanced Search')])[1]")
    public WebElement advancedSearch;

    @FindBy(xpath = "//div[@aria-label='Keyword']")
    public WebElement keyword;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='keyword-submit']")
    public WebElement magnifyingGlass;

    @FindBy(xpath = "//input[@id='fy2019']")
    public WebElement fy2019;

    @FindBy(xpath = "(//button[@class='submit-button'])[1]")
    public WebElement submitBTN;

    @FindBy(id = "top-filter-bar-title")
    public WebElement filterBar;

    @FindBy(xpath = "(//div[@class='filter-item'])[1]")
    public WebElement firstFilter;


    @FindBy(xpath = "(//div[@class='filter-item'])[2]")
    public WebElement secondFilter;

}
