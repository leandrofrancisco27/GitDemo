package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User landed on netbanking page");	
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("Practice landing page");
	}
	
	@When("User login into application")
	public void user_login_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
	
	
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_pasword(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(username + "and password is "+password);
	}
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}
	
	@Given("setup de entries in the database")
	public void setupEntries() {
		System.out.println("********************");
		System.out.println("setup the entries in database");
	}
	
	@When("launch the browser from configurables variables")
	public void launchBrowser() {
		System.out.println("launch the browser from configurables variables");
	}
	
	@When("hit the home page url of banking site")
	public void hitUrl() {
		System.out.println("hit the home page url of banking site");
	}
	
}
