package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement newTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newTab);
		newTab.click(); // new tab button

		List<String> allWindows = new ArrayList<>(driver.getWindowHandles()); // handles all windows and switching of tab

		String parent = allWindows.get(0);
		String child = allWindows.get(1);

		driver.switchTo().window(child); // actual switching to the child window
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(childHeader.getText());
		driver.close(); // close the tab

		driver.switchTo().window(parent);

		WebElement newWindow = driver.findElement(By.id("windowButton")); // new window button
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newWindow);
		newWindow.click();
		driver.close(); // close the new window

		driver.switchTo().window(parent);

	}

}
