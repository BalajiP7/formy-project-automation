package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formPage {
	
public static void submitForm(WebDriver driver) {
		
		WebElement fname = driver.findElement(By.cssSelector("#first-name"));
		fname.sendKeys("Balaji");
		
		WebElement lname = driver.findElement(By.cssSelector("#last-name"));
		lname.sendKeys("Somasundaram");
		
		WebElement jobTitle = driver.findElement(By.cssSelector("#job-title"));
		jobTitle.sendKeys("QA Engineer");
		
		WebElement highestLevelofEducation = driver.findElement(By.cssSelector("input#radio-button-2"));
		highestLevelofEducation.click();
		
		WebElement Sex = driver.findElement(By.cssSelector("input#checkbox-1"));
		Sex.click();
		
		WebElement experience = driver.findElement(By.id("select-menu"));
		experience.click();
		
		WebElement selectExperience = driver.findElement(By.cssSelector("option[value='3']"));
		selectExperience.click();
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("03/03/2020");
		datepicker.sendKeys(Keys.RETURN);
		
		WebElement Submit = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
		Submit.click();
		
	}

}
