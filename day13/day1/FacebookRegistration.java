package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookRegistration {

	@Test
	public void fbReg() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Kayalvizhi");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Elango");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or')]")).sendKeys("9500303000");
		driver.findElement(By.id("password_step_input")).sendKeys("Krish333");
		
		 WebElement date = driver.findElement(By.id("day"));
		 Select option1= new Select(date);
		 option1.selectByValue("25");
		 
		 WebElement month = driver.findElement(By.id("month"));
		 Select option2 = new Select(month);
		 option2.selectByIndex(1);
		 
		 WebElement year = driver.findElement(By.id( "year"));
		 Select option3 = new Select(year);
		 option3.selectByVisibleText("1992");
		 
		 driver.close();
		 
		

	}

}
