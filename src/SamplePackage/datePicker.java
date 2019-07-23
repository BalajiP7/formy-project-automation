package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datePicker {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("03/03/2020");
		datepicker.sendKeys(Keys.RETURN);
	}

}
