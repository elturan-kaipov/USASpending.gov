package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class IlliaSteps {

    WebDriver driver = Driver.getDriver();

    @Given("User goes to Usaspending website")
    public void user_goes_to_Usaspending_website() {
        driver.get("https://www.usaspending.gov/");
    }

    @Given("User hovers over Profiles")
    public void user_hovers_over_Profiles() {
        WebElement profiles = driver.findElement(By.xpath
                ("//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[3]/div/button/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profiles).perform();
    }

    @Then("User clicks on States option of the dropdown menu")
    public void user_clicks_on_States_option_of_the_dropdown_menu() {
        WebElement profiles = driver.findElement(By.xpath
                ("//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[3]/div/button/div[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profiles).perform();
        WebElement states = driver.findElement(By.xpath
                ("//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[3]/div/div/ul/li[3]/a"));
        states.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("User should see fifty six results in the search summary")
    public void user_should_see_fifty_six_results_in_the_search_summary() throws InterruptedException {
        WebElement resultsCount = driver.findElement(By.xpath("//div[@class='results-count']"));
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        System.out.println(resultsCount.getText());
        Assert.assertTrue(resultsCount.getText().equals("56 results"));
    }

    @Then("the table of the search results should contain fifty six rows")
    public void the_table_of_the_search_results_should_contain_fifty_six_rows() {
        WebElement tableOfStates = driver.findElement(By.xpath("//tbody[@class='state-list__body ']"));
        List<WebElement> totalRowsList = tableOfStates.findElements(By.tagName("tr"));
        Assert.assertTrue(totalRowsList.size() == 56);
    }

    @Then("State and Territory Name Column of the search summary should contain state names starting from Alabama and ending with US Virgin Islands VI")
    public void state_and_Territory_Name_Column_of_the_search_summary_should_contain_state_names_starting_from_Alabama_and_ending_with_US_Virgin_Islands_VI() throws InterruptedException {

        List<WebElement> stateNames = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //System.out.println(stateNames.get(50).getText());
        for(int i = 0; i < stateNames.size(); i++) {
            Assert.assertTrue(stateNames.get(0).getText().equals("Alabama (AL)"));
            Assert.assertTrue(stateNames.get(55).getText().equals("U.S. Virgin Islands (VI)"));
        }

//        WebElement alabama = driver.findElement(By.xpath("//tbody[@class='state-list__body ']/tr[1]/td[1]/a"));
//        WebElement virginIslands = driver.findElement(By.xpath("//tbody[@class='state-list__body ']/tr[56]/td[1]/a"));
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        Assert.assertTrue(alabama.getText().equals("Alabama (AL)"));
//        Assert.assertTrue(virginIslands.getText().equals("U.S. Virgin Islands (VI)"));

    }

    @Then("State and Territory Name Column search results from one to fifty one of the search summary should contain state names in the alphabetical order")
    public void state_and_Territory_Name_Column_search_results_from_one_to_fifty_one_of_the_search_summary_should_contain_state_names_in_the_alphabetical_order() {
        List<WebElement> stateNames = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //System.out.println(stateNames.get(50).getText());
        for(int i = 0; i < 50; i++) {
            Assert.assertTrue(stateNames.get(i).getText().compareTo(stateNames.get(i+1).getText()) < 0);
        }
    }

    @Then("State and Territory Name Column search result fifty two of the search summary should be American Samoa \\(AS)")
    public void state_and_Territory_Name_Column_search_result_fifty_two_of_the_search_summary_should_be_American_Samoa_AS() {
        List<WebElement> stateNames = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(stateNames.get(51).getText().equals("American Samoa (AS)"));
    }

    @Then("State and Territory Name Column search result fifty three of the search summary should be Guam \\(GU)")
    public void state_and_Territory_Name_Column_search_result_fifty_three_of_the_search_summary_should_be_Guam_GU() {
        List<WebElement> stateNames = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(stateNames.get(52).getText().equals("Guam (GU)"));
    }

    @Then("State and Territory Name Column search result fifty four of the search summary should be Northern Mariana Islands \\(MP)")
    public void state_and_Territory_Name_Column_search_result_fifty_four_of_the_search_summary_should_be_Northern_Mariana_Islands_MP() {
        List<WebElement> stateNames = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(stateNames.get(53).getText().equals("Northern Mariana Islands (MP)"));
    }

    @Then("State and Territory Name Column search result fifty five of the search summary should be Puerto Rico \\(PR)")
    public void state_and_Territory_Name_Column_search_result_fifty_five_of_the_search_summary_should_be_Puerto_Rico_PR() {
        List<WebElement> stateNames = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(stateNames.get(54).getText().equals("Puerto Rico (PR)"));
    }

    @Then("State and Territory Name Column search result fifty six of the search summary should be U.S. Virgin Islands \\(VI)")
    public void state_and_Territory_Name_Column_search_result_fifty_six_of_the_search_summary_should_be_U_S_Virgin_Islands_VI() {
        List<WebElement> stateNames = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(stateNames.get(55).getText().equals("U.S. Virgin Islands (VI)"));
    }

    @Then("User hovers over upward arrow in Awarded Amount cell")
    public void user_hovers_over_upward_arrow_in_Awarded_Amount_cell() {
        WebElement upwardArrow = driver.findElement(By.cssSelector("svg[class='usa-da-icon-arrow-up']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(upwardArrow).perform();
    }

    @Then("User should see the prompt showing up with text Sort table by ascending awarded amount")
    public void user_should_see_the_prompt_showing_up_with_text_Sort_table_by_ascending_awarded_amount() {
        WebElement upwardArrow = driver.findElement(By.cssSelector("svg[class='usa-da-icon-arrow-up']"));
        Assert.assertTrue(upwardArrow.getAttribute("aria-label").equals("Sort table by ascending state"));
    }

    @Then("User clicks on the downward arrow in Awarded Amount cell")
    public void user_clicks_on_the_downward_arrow_in_Awarded_Amount_cell() {
        WebElement downwardArrow = driver.findElement(By.cssSelector("svg[class='usa-da-icon-arrow-down']" +
                "[aria-label='Sort table by descending awarded amount']"));
        downwardArrow.click();
    }

    @Then("User should see the amounts in Awarded Amount column sorted in descending order")
    public void user_should_see_the_amounts_in_Awarded_Amount_column_sorted_in_descending_order() {
        List<WebElement> amounts = driver.findElements(By.xpath("//tbody[@class='state-list__body ']/tr/td[2]"));
        List<Long> ints = new ArrayList<>();

        for(WebElement element : amounts) {
           ints.add(Long.valueOf(element.getText().replace("$", "").replace(",", "")));
        }

        for(int i = 0; i < ints.size() - 1; i++) {
            Assert.assertTrue(ints.get(i) >= ints.get(i+1));
        }

    }

}
