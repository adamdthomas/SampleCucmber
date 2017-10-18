package cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import lfg.lfgdotcom.HomePage;

public class HomePageSteps {
	
	WebDriver driver;
	HomePage homepage;
	
	@Given("^I navigate to the lfg homepage$")
	public void i_navigate_to_the_lfg_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigating to home page.");
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.lfg.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='rightArrow']/i")));
		System.out.println("Navigation to home page complete.");
	}

	
	
	@When("^I enter my username \"(.*)\"$")
	public void i_enter_my_usernameAL(String userName) throws Throwable {
		homepage = new HomePage(driver);
		homepage.EnterUserName(userName);
	}
	

	@When("^I click next$")
	public void i_click_next() throws Throwable {
		homepage.GoToLoginPage();
	}

	@Then("^I should be at the sign on page$")
	public void i_should_be_at_the_sign_on_page() throws Throwable {

		Assert.assertEquals("Sign On", homepage.pageTitle);

	}

	
	@After
	public void testTeardown(){
		driver.quit();
	}

	

}
