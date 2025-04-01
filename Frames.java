package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//Switch to frame
		driver.switchTo().frame(1);
		
		// Click the "Try It" button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
		//Alert 
		Alert confirmAlert = driver.switchTo().alert();
		
		 // Verify the result text
		String text = confirmAlert.getText();
		System.out.println("Alert text is :" + text);
		confirmAlert.accept();
		
		
		

	}

}
