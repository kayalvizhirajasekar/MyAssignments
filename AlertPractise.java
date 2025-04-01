package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractise {

	public static void main(String[] args) {
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Load URL
		driver.get("https://leafground.com/alert.xhtml");
		//Maximize screen
		driver.manage().window().maximize();
		//FindElement 
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//Switch from main webpage to alert
		Alert confirmAlert = driver.switchTo().alert();
		//Get the text
		String text = confirmAlert.getText();
		//Accept the alert
		confirmAlert.accept();
		//Print the textd
		System.out.println(text);
		

	}

}
