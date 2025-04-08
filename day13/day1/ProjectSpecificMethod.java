package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
//global declaration
	public ChromeDriver driver;

	@BeforeMethod
	public void preVonditions() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Username: dilip@testleaf.com
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		//Password: testleaf@2025
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
	}
	@AfterMethod
	public void postConditions() {
		driver.close();
		
		

	}

}
