package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
//		driver.findElement(By.linkText("Create Lead")).click();
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoth");
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
//		//driver.findElement(By.name("submitButton")).click();
//		
//		WebElement sourceElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
//		Select option = new Select(sourceElement);
//		//option.selectByIndex(0);
//		//option.selectByValue("IND_HARDWARE");
//		option.selectByVisibleText("General Services");
//		
		;
		

	}

}
