package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceuteJavascript {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://formy-project.herokuapp.com/modal");
		driver.manage().window().maximize();
		
		WebElement modalButton = driver.findElement(By.id("modal-button"));
		modalButton.click();
		
		WebElement closeButton = driver.findElement(By.id("close-button"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(6000);
		js.executeScript("arguments[0].click();", closeButton);
		
		
	
	}

}
