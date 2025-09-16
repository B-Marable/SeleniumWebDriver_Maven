package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankRegister {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement register = driver.findElement(By.xpath("//a[contains(text(), 'Register')]"));
		register.click();
//		driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click(); SHORTER VERSION
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='customer.firstName']"));
		firstName.sendKeys("John");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@name='customer.lastName']"));
		lastName.sendKeys("Doe");
		
		WebElement address = driver.findElement(By.xpath("//input[@name='customer.address.street']"));
		address.sendKeys("San Isidro");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='customer.address.city']"));
		city.sendKeys("Antipolo");
		
		WebElement state = driver.findElement(By.xpath("//input[@name='customer.address.state']"));
		state.sendKeys("PH");
		
		WebElement zipCode = driver.findElement(By.xpath("//input[@name='customer.address.zipCode']"));
		zipCode.sendKeys("1870");
		
		WebElement phoneNum = driver.findElement(By.xpath("//input[@name='customer.phoneNumber']"));
		phoneNum.sendKeys("0987 654 3210");
		
		WebElement ssn = driver.findElement(By.xpath("//input[@name='customer.ssn']"));
		ssn.sendKeys("1234 567 89");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='customer.username']"));
		username.sendKeys("sampleUser21");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='customer.password']"));
		password.sendKeys("samplePass!23");
		
		WebElement confirmPass = driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
		confirmPass.sendKeys("samplePass!23");
		
//		WebElement registerBtn = driver.findElement(By.xpath("//input[@value='Register']"));
//		registerBtn.click();

	}

}
