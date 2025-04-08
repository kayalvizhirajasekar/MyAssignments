package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestngSalesForce extends ProjectSpecificMethod{
@Test
	public void salesForce() {
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		//Username: dilip@testleaf.com
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
//		//Password: testleaf@2025
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
//		//Click Login buttom
//		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//Click View All and click Legal Entities from App Launcher 
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		//Click on the search for legal Entities  
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal");
		//Click on Legal Entity
		driver.findElement(By.xpath("(//p[@class='slds-truncate'])[2]")).click();
		//Click on new in the right corner
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		//Provide Legal Entity Name
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Kayal");
		//Provide company name - Testleaf
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Testleaf");
		//Provide description as Salesforces
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		//MouseHover the Status bar -- Scroll by
		WebElement status = driver.findElement(By.xpath("//div[contains(@class,'slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right')]/button"));
//		Actions act = new Actions(driver);
//		act.scrollToElement(status);
		//click the dropdown button in status bar
		status.click();
		driver.close();
	}

}
