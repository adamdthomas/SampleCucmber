package test;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {
	
	WebDriver driver;
	
/*	@Test
	public void AdditionTest(){
		int firstNumber = 3;
		int secondNumber = 7;
		int answer;
		answer = firstNumber + secondNumber;
		Assert.assertEquals(10, answer);
	}*/
	
	@Test
	public void webtest(){
		System.out.println("Beginning of webtest");
		driver.findElement(By.id("banner-username")).sendKeys("UNameHere");
		
		try {
			driver.findElement(By.id("next-btn-banner")).click();
		} catch (Exception e) {}

		String title = driver.getTitle();
		Assert.assertEquals("Sign On", title);
		System.out.println("End of webtest");
	}
	
	@Test
	public void lfgcomLoaded(){
		System.out.println("Beginning of lfgcom test");
		String title = driver.getTitle();
		Assert.assertEquals("Individuals & Families | Lincoln Financial Group", title);

		System.out.println("End of lfgcom test");
	}
	
	
	@Before
	public void testSetup(){
		System.out.println("Beginning of test setup");
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.lfg.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='rightArrow']/i")));
		System.out.println("End of test setup");
	}
	
	
	@After
	public void testTeardown(){
		System.out.println("Beginning of test teardown");
		driver.quit();	
		System.out.println("End of test teardown");
	}
	

}
