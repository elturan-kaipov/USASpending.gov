package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.USAspendingGov;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class TC005 {

    USAspendingGov usSpObj = new USAspendingGov();

    @Given("User is hovering over Award Search option")
    public void user_is_hovering_over_Award_Search_option() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(usSpObj.awardSearchOption).perform();
    }

    @Then("dropdown shows up with two options Advanced Search, Keyword Search")
    public void dropdown_shows_up_with_two_options_Advanced_Search_Keyword_Search() {
       List<WebElement> awardSearchOptionsList = Driver.getDriver().findElements(By.xpath("//*[@id=\"app\"]/div/div/div[1]/header/nav/div/div[4]/ul/li[2]/div/div/ul/li[1]"));
       List <String> awardSearchTemplateList = new ArrayList<>();
       awardSearchTemplateList.add("Advanced Search");
       awardSearchTemplateList.add("Keyword Search");
       System.out.println(awardSearchTemplateList.toString());
       System.out.println(awardSearchOptionsList.size());
       System.out.println(awardSearchTemplateList.size());

       System.out.println("======");
       System.out.println(awardSearchOptionsList.get(0).getText());
       //System.out.println(awardSearchOptionsList.get(1).getText());
//       for (int i = 0; i < awardSearchOptionsList.size(); i++){
//           System.out.println(awardSearchOptionsList.get(i).getText());
//           System.out.println(awardSearchTemplateList.get(i));
//       }
    }
}
