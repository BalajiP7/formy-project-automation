package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		
		WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
		radioButton1.click();
		
		WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
		radioButton2.click();
	}

}
