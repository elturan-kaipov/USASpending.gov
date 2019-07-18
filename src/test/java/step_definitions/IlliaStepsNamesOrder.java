//package step_definitions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import utilities.Driver;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class IlliaStepsNamesOrder {
//
//    WebDriver driver = Driver.getDriver();
//
//    @Given("User goes to Usaspending website")
//    public void user_goes_to_Usaspending_website() {
//        driver.get("https://www.usaspending.gov/");
//    }
//
//    @Given("User hovers over Profiles")
//    public void user_hovers_over_Profiles() {
//        WebElement profiles = driver.findElement(By.xpath
//                ("//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[3]/div/button/div[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(profiles).perform();
//    }
//
//    @Then("User clicks on States option of the dropdown menu")
//    public void user_clicks_on_States_option_of_the_dropdown_menu() {
//        WebElement profiles = driver.findElement(By.xpath
//                ("//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[3]/div/button/div[1]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(profiles).perform();
//        WebElement states = driver.findElement(By.xpath
//                ("//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[3]/div/div/ul/li[3]/a"));
//        states.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
//
//    @Then("State and Territory Name Column of the search summary should contain state names starting from Alabama and ending with US Virgin Islands VI")
//    public void state_and_Territory_Name_Column_of_the_search_summary_should_contain_state_names_starting_from_Alabama_and_ending_with_US_Virgin_Islands_VI() {
//        WebElement tableOfStates = driver.findElement(By.xpath("//tbody[@class='state-list__body ']"));
//        List<WebElement> totalRowsList = tableOfStates.findElements(By.xpath
//                ("//*[@id='main-content']//div[@class='landing-page']/div//div[@class='state-landing__results']" +
//                        "//table[@class='state-list']//tbody[@class='state-list__body']/tr/td/a"));
//
//    }
//
//    @Then("State and Territory Name Column search results from one to fifty one of the search summary should contain state names in the alphabetical order")
//    public void state_and_Territory_Name_Column_search_results_from_one_to_fifty_one_of_the_search_summary_should_contain_state_names_in_the_alphabetical_order() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//}
