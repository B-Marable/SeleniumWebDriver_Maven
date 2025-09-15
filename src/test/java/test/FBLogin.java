package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//		WebElement username = driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.id("pass"));
//		WebElement loginBtn = driver.findElement(By.name("login"));
		
		WebElement header = driver.findElement(By.tagName("H2"));
		System.out.println(header.getText());
		
//		WebElement forgotPass = driver.findElement(By.linkText("Forgot password?"));
//		forgotPass.click();

//		username.sendKeys("sample");
//		password.sendKeys("Sample!23");		
//		loginBtn.click();
		
	}

}
