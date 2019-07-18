package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.DataBaseDownloadFunctionalityPage;
import utilities.Driver;

import java.util.Set;

public class DBDFunctionality_steps {

    DataBaseDownloadFunctionalityPage obj = new DataBaseDownloadFunctionalityPage();
    JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User is on the USAspending homepage")
    public void user_is_on_the_USAspending_homepage() {
        Assert.assertEquals( Driver.getDriver().getTitle(),("USAspending.gov"));

    }

    @Given("User is able to see the Download Center tab")
    public void user_is_able_to_see_the_Download_Center_tab() {
    Assert.assertTrue(obj.downloadCenterTab.isDisplayed());
    }

    @When("User is hovering over Download Center")
    public void user_is_hovering_over_Download_Center() {
        actions.moveToElement(obj.downloadCenterTab).perform();
    }

    @Then("User should see Award Data Archive")
    public void user_should_see_Award_Data_Archive() {
    Assert.assertTrue(obj.awardDataArchiveTab.isDisplayed());
    }

    @Then("User should see Custom Award Data")
    public void user_should_see_Custom_Award_Data() {
        Assert.assertTrue(obj.customAwardDataTab.isDisplayed());
    }

    @Then("User should see Custom Account Data")
    public void user_should_see_Custom_Account_Data() {
        Assert.assertTrue(obj.customAccountDataTab.isDisplayed());
    }

    @Then("User should see Agency Submission Files")
    public void user_should_see_Agency_Submission_Files() {
        Assert.assertTrue(obj.agencySubmissionFilesTab.isDisplayed());
    }

    @Then("User should see Database Download")
    public void user_should_see_Database_Download() {
        Assert.assertTrue(obj.databaseDownloadTab.isDisplayed());
    }

    @Then("User should see API")
    public void user_should_see_API() {
        Assert.assertTrue(obj.aPITab.isDisplayed());
    }

    @Then("User should see Data Dictionary")
    public void user_should_see_Data_Dictionary() {
        Assert.assertTrue(obj.dataDictionaryTab.isDisplayed());
    }

    @When("User clicks on Database Download")
    public void user_clicks_on_Database_Download() {
        actions.moveToElement(obj.downloadCenterTab).perform();
        obj.databaseDownloadTab.click();
    }

    @Then("User switches to the new window")
    public void user_switches_to_the_new_window() {
        String handle= Driver.getDriver().getWindowHandle();
        Set handles = Driver.getDriver().getWindowHandles();
        for (String handle1 : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle1);
        }
    }

    @Then("User should see Setup guide link with text {string}")
    public void user_should_see_Setup_guide_link_with_text(String string) {

        System.out.println(obj.setupGuideLink.getText());
        Assert.assertTrue(obj.setupGuideLink.isDisplayed());
    }

    @Then("User should see Database download link with text {string}")
    public void user_should_see_Database_download_link_with_text(String string) {

        System.out.println(obj.databaseDownloadLink.getText());
        Assert.assertEquals(obj.databaseDownloadLink.getText(),string);

    }

    @Then("User clicks usaspending db setupink")
    public void user_clicks_usaspending_db_setupink() {

        obj.setupGuideLink.click();
    }

    @Then("Title should be {string}")
    public void title_should_be(String string){
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://files.usaspending.gov/database_download/usaspending-db-setup.pdf";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

}
