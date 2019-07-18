package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GlossaryFunctionalityPage {

    public GlossaryFunctionalityPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='header-glossary-button']")
    public WebElement glossaryTab;

    @FindBy(xpath = "//div[@class='usa-da-glossary-wrapper']")
    public WebElement glossaryWindow;

    @FindBy(xpath = "//div[13]//ul[1]//li[1]//button[1]")
    public WebElement oBjectClassLink;

    @FindBy(xpath = "//button[contains(text(),'Official Definition')]")
    public WebElement oFficialDefinitionLink;

    @FindBy(xpath = "//a[contains(text(),'Object Class definitions')]")
    public WebElement getoBjectClassDeffinitionLink;

}
