package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement signUpBtn = driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]"));
		signUpBtn.click();
		
		// printing of all the months
		List<WebElement> months = driver.findElements(By.xpath("//select[@name='birthday_month']"));
		System.out.println("The months are: ");
		
		for (WebElement month : months) {
			System.out.println(month.getText());
		}
		
		// printing of the default year selected
		WebElement defaultYear = driver.findElement(By.xpath("//select[@name='birthday_year']/option[@selected='1']"));
		System.out.println("Default year selected is: " + defaultYear.getText());
		

	}

}
