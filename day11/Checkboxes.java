package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//Load Url
		driver.get(" https://leafground.com/checkbox.xhtml");
		//Maximize
		driver.manage().window().maximize();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Locate element to check basic checkbox and click
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[1]")).click();
		
		//click notification checkbox
		WebElement notification = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']"));
		notification.click();
		boolean selected = notification.isSelected();
		System.out.println(selected);
		//Verify the checked message is displayed after selecting notification checkbox
		String actualText = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String expectedText = "Checked";
		if(actualText.equals(expectedText)) {
			System.out.println("Pass:Checked message is displayed correctly");
		}
		else
		{System.out.println("Fail: Message is incorrect");
		}
		
		//Select Java Language
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-d')])[3]")).click();
	
		//Select Tri state
		WebElement triState = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-')])[8]"));
		triState.click();
		//Verify tri state is selected
		boolean selected2 = triState.isSelected();
		System.out.println(selected2);
		
		//Select Toggle switch
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		//Verify the message is displayed as expected after selecting Toogle switch
		String actualText2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String expectedText2 = "Checked";
		if(actualText2.equals(expectedText2))
		{
			System.out.println("Pass:Toogle switch message is displayed");
		}
		else
		{
			System.out.println("Fail:Toogle switch message is not displayed");
		}
		boolean enabled = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		System.out.println("Verify if check box is disabled:" + enabled);
	
		//Select multiple options
		driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover']")).click();

		//close window
		driver.close();
	}
	
	
	
	
	
	

}
