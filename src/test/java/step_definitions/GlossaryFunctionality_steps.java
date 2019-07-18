package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.GlossaryFunctionalityPage;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public class GlossaryFunctionality_steps {

    GlossaryFunctionalityPage obj = new GlossaryFunctionalityPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());


    @Given("User is able to see the Glossary tab")
    public void user_is_able_to_see_the_Glossary_tab() {
        Assert.assertTrue(obj.glossaryTab.isDisplayed());
    }

    @When("User clicks on Glossary")
    public void user_clicks_on_Glossary() {
        obj.glossaryTab.click();
    }

    @Then("User should see Glossary window")
    public void user_should_see_Glossary_window() {

    Assert.assertTrue(obj.glossaryWindow.isDisplayed());

    }

    @Then("User should see eight glossary terms starting with O letter")
    public void user_should_see_glossary_terms_starting_with_O_letter() {

        List<WebElement> listOfOletterElements = Driver.getDriver().findElements(By.xpath("//div[13]//ul[1]//li"));
        Assert.assertTrue(listOfOletterElements.size()==8);

    }

    @Then("User clicks on Object Class link")
    public void user_clicks_on_Object_Class_link() {
        obj.oBjectClassLink.click();
    }

    @Then("User clicks on Official Definition link")
    public void user_clicks_on_Official_Definition_link() {
        obj.oFficialDefinitionLink.click();
    }

    @Then("User clicks on Object Class definitions link")
    public void user_clicks_on_Object_Class_definitions_link() {
        obj.getoBjectClassDeffinitionLink.click();
    }

    @Then("User should switch to new window with title Object Class definitions")
    public void user_should_switch_to_new_window_with_title_Object_Class_definitions() {
        String handle= Driver.getDriver().getWindowHandle();
        Set handles = Driver.getDriver().getWindowHandles();
        for (String handle1 : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle1);
        }
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.whitehouse.gov/sites/whitehouse.gov/files/omb/assets/a11_current_year/a11_2017.pdf";
        Assert.assertTrue(actualUrl.contains(".pdf"));
    }


}
