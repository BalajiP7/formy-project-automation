package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/

public class ScrollPage {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://formy-project.herokuapp.com/scroll");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("name"));
		Actions action = new Actions(driver);
		action.moveToElement(name);
		name.sendKeys("Balaji");
		
		
		WebElement date = driver.findElement(By.id("date"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(date);
		date.sendKeys("01/01/2019");
		
		
	/*
	 * Using WebDriverwait also element can be found by scrolling the page.
	 * 	WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Balaji");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("date"))).sendKeys("01/01/2019");*/

	}

}
