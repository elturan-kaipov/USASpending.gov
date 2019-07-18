package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Elturan_pages;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Elturan {

    Elturan_pages epgs=new Elturan_pages();

//    @When("user on the homepage")
//    public void user_on_the_homepage() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//    }

    @Then("user hover over to Award Searc")
    public void user_hover_over_to_Award_Searc() {
        WebElement awardSearch = epgs.awardSearch;
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(awardSearch).perform();

    }

    @Then("user click on Advanced Search")
    public void user_click_on_Advanced_Search() {
        epgs.advancedSearch.click();
    }

    @Then("user Click on Keywor expand arrow")
    public void user_Click_on_Keywor_expand_arrow() {
        epgs.keyword.click();
    }

    @Then("user print in search box hospital chicago")
    public void user_print_in_search_box_hospital_chicago() {
      epgs.searchBox.sendKeys("chicago hospital");
    }

    @Then("user click on Magnifying Glass in Keyword section")
    public void user_click_on_Magnifying_Glass_in_Keyword_section() {
        epgs.magnifyingGlass.click();
    }

    @Then("user check box FY {int} in Time Period Section")
    public void user_check_box_FY_in_Time_Period_Section(Integer int1) {
        epgs.fy2019.click();
    }

    @Then("user click on Submit Search button")
    public void user_click_on_Submit_Search_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        epgs.submitBTN.click();

    }

    @Then("user Verify there is a section with {int} Active Filters text on top of search results table")
    public void user_Verify_there_is_a_section_with_Active_Filters_text_on_top_of_search_results_table(Integer int1) {
        Assert.assertTrue(epgs.filterBar.getText().contains("2 Active Filters"));
    }

    @Then("user Verify this section has keyword hospital Chicago and time period FY {int}")
    public void user_Verify_this_section_has_keyword_hospital_Chicago_and_time_period_FY(Integer int1) {
        Assert.assertTrue(epgs.firstFilter.getText().contains("chicago hospital"));
        Assert.assertTrue(epgs.secondFilter.getText().contains("FY 2019"));
    }

    @Then("user Verify column Grants has {int} results")
    public void user_Verify_column_Grants_has_results(Integer int1) {

    }
}
