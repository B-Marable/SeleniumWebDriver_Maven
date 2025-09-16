package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement signUpBtn = driver.findElement(By.linkText("Create new account"));
		signUpBtn.click();
		
		WebElement firstname = driver.findElement(By.cssSelector("input[name=firstname]"));
		firstname.sendKeys("Bianca");
		
		WebElement lastname = driver.findElement(By.cssSelector("input[name=lastname]"));
		lastname.sendKeys("Marable");
		
		// dropdowns
		WebElement birthMonth = driver.findElement(By.cssSelector("select#month"));
		Select dropdownMonth = new Select(birthMonth);
		dropdownMonth.selectByVisibleText("Sep");
		
		WebElement birthDay = driver.findElement(By.cssSelector("select#day"));
		Select dropdownDay = new Select(birthDay);
		dropdownDay.selectByVisibleText("21");
		
		WebElement birthYear = driver.findElement(By.cssSelector("select#year"));
		Select dropdownYear = new Select(birthYear);
		dropdownYear.selectByVisibleText("2002");
		
		// radio button
		WebElement gender = driver.findElement(By.cssSelector("input[value='1']"));
		gender.click();
		
		WebElement email = driver.findElement(By.cssSelector("input[name=reg_email__]"));
		email.sendKeys("sample@email.com");
		
		WebElement password = driver.findElement(By.cssSelector("input[name=reg_passwd__]"));
		password.sendKeys("samplePass!23");
		
		
		
		
	}

}
