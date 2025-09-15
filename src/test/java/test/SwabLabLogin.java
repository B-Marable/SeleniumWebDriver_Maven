package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwabLabLogin {

	public static void main(String[] args) {
		
		String usernameValue = "standard_user";
		String passwordValue = "secret_sauce";
		
		WebDriver driver = new ChromeDriver();
		
		// fetching of values
		
//		WebElement credentials = driver.findElement(By.className("login_credentials"));
//		System.out.println(credentials.getText());
		
		// launching browser driver
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		username.sendKeys(usernameValue);
		password.sendKeys(passwordValue);		
		loginBtn.click();
		
//		driver.close();
	}

}
