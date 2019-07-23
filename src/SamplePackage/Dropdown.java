package SamplePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://formy-project.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
	/*	WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
		dropdownMenuButton.click();*/
		
		Select dropdown = new Select(driver.findElement(By.id("dropdownMenuButton")));
		
		List<WebElement> dropdownMenuItems = dropdown.getOptions();
		
		System.out.println(dropdownMenuItems.size());
		
		for(int i = 0 ; i < dropdownMenuItems.size() ; i++) {
			System.out.println(dropdownMenuItems.get(i).getText());
			
		}
	}

}
