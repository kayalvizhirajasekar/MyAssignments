package week3.day3;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		//get Window handle
		String parent = driver.getWindowHandle();
		System.out.println("Parent address is :" + parent);
		
		//getWindowHandles
		Set<String> child = driver.getWindowHandles();
		System.out.println("Child address is :" + child);

		//Print title before switching
		String parentTitle = driver.getTitle();
		System.out.println("Parent Title is :" + parentTitle);
		//Convert Set to List
		List<String> convert = new ArrayList<String>(child);
		
		//Switch from parent to child
		driver.switchTo().window(convert.get(1));
		
		//Print title after switching
		String childTitle = driver.getTitle();
		System.out.println("Child title is " + childTitle);
		
		
//		System.out.println("Add of all opened windows:" + windowHandles);
//		
//		//convert Set to List
//		List<String> window = new ArrayList<String>(windowHandles);
//		
//		//Switch to child
//		driver.switchTo().window())
//		
		
		
		
		
		
		//Switch to child
//		driver.switchTo().window(all.getItem(1));
		
	}

}
