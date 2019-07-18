package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataBaseDownloadFunctionalityPage {

    public DataBaseDownloadFunctionalityPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(),'Download Center')]")
    public WebElement downloadCenterTab;

    @FindBy(xpath = "//a[contains(text(),'Award Data Archive')]")
    public WebElement awardDataArchiveTab;

    @FindBy(xpath = "//a[contains(text(),'Custom Award Data')]")
    public WebElement customAwardDataTab;

    @FindBy(xpath = "//a[contains(text(),'Custom Account Data')]")
    public WebElement customAccountDataTab;

    @FindBy(xpath = "//a[contains(text(),'Agency Submission Files')]")
    public WebElement agencySubmissionFilesTab;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[4]/ul[1]/li[4]/div[1]/div[1]/ul[1]/li[5]/a[1]")
    public WebElement databaseDownloadTab;

    @FindBy(xpath = "//a[contains(text(),'API')]")
    public WebElement aPITab;

    @FindBy(xpath = "//a[contains(text(),'Data Dictionary')]")
    public WebElement dataDictionaryTab;

    @FindBy(xpath = "//a[contains(text(),'usaspending-db-setup.pdf (173 KB)')]")
    public WebElement setupGuideLink;

    @FindBy(xpath = "//a[contains(text(),'usaspending-db_20190708.zip (51 GB)')]")
    public WebElement databaseDownloadLink;
}
