package stepDef;

import io.cucumber.java.en.Then;
import page.HomePage;

public class HomeStepDef extends test.java.BaseTest {

    HomePage homePage;

    @Then("user will be redirect to homepage")
    public void userWillBeRedirectToHomepage() {
        homePage = new HomePage(driver);
        homePage.validateBackPackDisplayed();
    }
}
