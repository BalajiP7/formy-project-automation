package SamplePackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToAlert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(6000);
		alert.accept();
	}

}
