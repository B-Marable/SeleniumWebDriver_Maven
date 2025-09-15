package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instance of browser driver
		WebDriver driver = new ChromeDriver();
		
		// launching browser driver
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.close();

	}

}
