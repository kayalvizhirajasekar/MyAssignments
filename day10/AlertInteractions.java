package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteractions {

	public static void main(String[] args) {
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		//Load Url
		driver.get("https://www.leafground.com/alert.xhtml");
		//Maximize
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Locate Element
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Switch to Alert box from main Webpage
		Alert confirmAlert = driver.switchTo().alert();
		//Send text 
		confirmAlert.sendKeys("Kayalvizhi");
		//Accept Alert
		confirmAlert.accept();
		//getText of the entered String
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		//Print text in the console
		System.out.println(text);

	}

}
