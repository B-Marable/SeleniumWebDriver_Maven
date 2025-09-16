package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// frame 1
		driver.switchTo().frame("frame1"); 
		WebElement frameHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println("Frame 1 Content: " + frameHeader.getText());
		
		driver.switchTo().defaultContent(); // switch back to main content
		
		// frame 2
		driver.switchTo().frame("frame2"); 
		WebElement frame2Header = driver.findElement(By.id("sampleHeading"));
		System.out.println("Frame 2 Content: " + frame2Header.getText());


	}

}
