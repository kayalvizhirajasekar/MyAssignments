package week3.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		//Load Url
		driver.get("https://www.fb.com");
		//Maximize window
		driver.manage().window().maximize();
		//Take screenshot from source
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Set destination
		File desti = new File("./Snaps/fb.png");
		//copy source to destination
		FileUtils.copyFile(source, desti);

	}

}
