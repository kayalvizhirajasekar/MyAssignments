package week3.day3;

import java.util.List;
import java.awt.Paint;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ButtonInteraction2 {

	public static void main(String[] args) {
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//Load url
		driver.get("https://leafground.com/button.xhtml");
		//maximize
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		
		//Verify that the title of the page is ‘dashboard.’
		String title = driver.getTitle();
		System.out.println("The title of the webpage is: " + title);
	
		//Navigate back to original webpage
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		boolean button = driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled();
		System.out.println("Confirm if the button is disabled : " + button);

		//Find and print the position of the button with the text ‘Submit.’
		WebElement buttons = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point position = buttons.getLocation();
		int x = position.getX();
		int y = position.getY();
		System.out.println("Button Position: X = " + x + ", Y = " + y);
				
        
        //Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement bg = driver.findElement(By.xpath("(//span[text()='Save'])[1]"));
		String cssValue = bg.getCssValue("background-color");
		System.out.println("The background color is: "+ cssValue);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("The height and width is:" + size);
		

	}

}
