
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My first selenium test:");
		
		String teString = "This is a test";
		
		System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.lfg.com");
		
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='rightArrow']/i")));
		
		driver.findElement(By.id("banner-username")).sendKeys("UNameHere");
		
		try {
			driver.findElement(By.id("next-btn-banner")).click();
		} catch (Exception e) {}
		
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
/*		driver.get("http://google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//----------------------WEB ELEMENTS
		//WebElement searchBar = driver.findElement(By.id("lst-ib"));
		WebElement searchBar = driver.findElement(By.name("q"));
		
		searchBar.sendKeys("Lincoln Financial");
		
		searchBar.submit();
		
		
		
		
		title = driver.getTitle();
		
		System.out.println(title);*/
		
		
		
		
		driver.quit();		
			
	}

}
