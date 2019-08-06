package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTabWindow {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		
			
		String orignalHandler = driver.getWindowHandle();
		
		for(String newHandle: driver.getWindowHandles()) {
			driver.switchTo().window(newHandle);
		}
		
		Thread.sleep(6000);
		driver.switchTo().window(orignalHandler);

	}

}
