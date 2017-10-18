package cucumber.steps;


import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import lfg.lfgdotcom.LifeInsuranceCalculatorPage;

public class LifeInsuranceCalculatorSteps extends BaseSteps{
	
	
	@Then("^I see the How Much Life Insurance calculator$")
	public void i_see_the_How_Much_Life_Insurance_calculator() throws Throwable {
	    LifeInsuranceCalculatorPage lifeInsuranceCalculatorPage = new LifeInsuranceCalculatorPage(driver);
	    Assert.assertTrue(lifeInsuranceCalculatorPage.CalulatorExist());
	}
	
	@Then("^I enter basic Age Income and Assumptions data$")
	public void i_enter_basic_Age_Income_and_Assumptions_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^I enter basic immediate cash data$")
	public void i_enter_basic_immediate_cash_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^I enter basic long term income needs data$")
	public void i_enter_basic_long_term_income_needs_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^I enter basic availible resources data$")
	public void i_enter_basic_availible_resources_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@When("^I click Submit$")
	public void i_click_Submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^I see my results$")
	public void i_see_my_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
