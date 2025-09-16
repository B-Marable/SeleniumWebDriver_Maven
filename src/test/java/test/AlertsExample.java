package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement alertBtn = driver.findElement(By.id("alertButton")); // alert button
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertBtn);
		alertBtn.click();
		
		Alert alert1 = driver.switchTo().alert();
//		Thread.sleep(5000);
		alert1.accept();
		
		
		WebElement confirmBtn = driver.findElement(By.id("confirmButton")); // alert button
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmBtn);
		confirmBtn.click();
		
		Alert alert3 = driver.switchTo().alert();
//		Thread.sleep(5000);
		alert3.dismiss();

	}

}
