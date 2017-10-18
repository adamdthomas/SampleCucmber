package lfg.lfgdotcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LifeInsuranceCalculatorPage {
	/*
	And I open the life insurance calculator
	Then I see the How Much Life Insurance calculator
	And I enter basic Age Income and Assumptions data
	And I enter basic immediate cash data
	And I enter basic long term income needs data
	And I enter basic availible resources data
	When I click Submit 
	Then I see my results
	*/
	
	WebDriver driver;
	
	public LifeInsuranceCalculatorPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void OpenCalculator(){
		WebElement calcButton = driver.findElement(By.xpath("//a[contains(.,'Use this calculator')]"));
		calcButton.click();
	}
	
	public boolean CalulatorExist() {
		
		boolean calcExists = false;
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[@class='calcTitle']")));
		
		calcExists = driver.findElements(By.xpath("//h2[@class='calcTitle']")).size() > 0;
		
		driver.switchTo().defaultContent();
		
		return calcExists;
		
	}

}
