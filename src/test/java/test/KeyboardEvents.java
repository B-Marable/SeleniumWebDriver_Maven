package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvents {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement searchField = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchField.sendKeys("Today is Tuesday");
		
		// ctrl + a & delete
		searchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		
		searchField.sendKeys("What is the day today?");
		searchField.sendKeys(Keys.ENTER);
		
	}

}
