package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.USAspendingGov;
import utilities.Driver;

public class TC004 {

    USAspendingGov usSpObj = new USAspendingGov();

    @Given("User is on UsaSpendingGov homepage")
    public void user_is_on_UsaSpendingGov_homepage() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("USAspending.gov"));
    }

    @Then("User should see Award Search option")
    public void user_should_see_Award_Search_option() {
        Assert.assertTrue(usSpObj.awardSearchOption.isDisplayed());
    }

    @Given("user is hovering over Award Search option")
    public void user_is_hovering_over_Award_Search_option() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(usSpObj.awardSearchOption).perform();
    }

    @Then("user sees tooltip with text Award Search: Search through awards and discover trends and connections")
    public void prompt_shows_up_with_text_Award_Search_Search_through_awards_and_discover_trends_and_connections() {
        String toolTipText = usSpObj.awardSearchOption2.getAttribute("title");
        Assert.assertTrue(toolTipText.equals("Award Search: Search through awards and discover trends and connections"));
    }

    @Given("user is hovering over Award Search expand menu button")
    public void user_is_hovering_over_Award_Search_expand_menu_button() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(usSpObj.awardSearchExpandMenuButton).perform();
    }

    @Then("user sees tooltip with text Expanded menu")
    public void prompt_shows_up_with_text_Expanded_menu() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(usSpObj.awardSearchExpandMenuButton).perform();
        Thread.sleep(2000);
        String toolTipText = usSpObj.awardSearchExpandMenuButton.getAttribute("aria-label");
        Assert.assertTrue(toolTipText.equals("Expanded menu"));
    }

}
