package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleAutoComplete {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\Balaji\\Balaji\\Testing Software\\geckodriver-win64\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://test3.icoreemr.com");
		driver.findElement(By.id("username")).sendKeys("imedicor");
		driver.findElement(By.id("password")).sendKeys("Y9F!jk@bpPhJ4s");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(1000);
		driver.get("https://test3.icoreemr.com/interface/reports/receipts_by_payment_method.php");
		
		driver.manage().window().maximize();
		
		WebElement proc = driver.findElement(By.id("code"));
		proc.click();
		proc.sendKeys("1120");
		
		Thread.sleep(3000);
		
		WebElement autoproc = driver.findElement(By.className("select2-code-results"));
		autoproc.click();
			

	}

}
