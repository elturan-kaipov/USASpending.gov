package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CheckIn {


    @When("user on the homepage")
    public void user_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user can see title")
    public void user_can_see_title() {
        String title="USAspending.gov";
        Assert.assertEquals(Driver.getDriver().getTitle(), title);
    }

}
