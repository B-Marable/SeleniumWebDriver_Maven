package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Number of Rows: " + rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Number of Columns: " + columns.size());
		
//		System.out.println("First Column: " + columns.get(0).getText());
//		System.out.println("Second Column: " + columns.get(1).getText());
//		System.out.println("Third Column: " + columns.get(2).getText());
		
		for (int i = 0; i < columns.size(); i++) {
		    System.out.println("Column " + (i + 1) + ": " + columns.get(i).getText());
		}
		
//		for(WebElement col:columns) {
//			System.out.println(col.getText());
//		}
		
		String company = "Island Trading";
		WebElement country = driver.findElement(By.xpath("//td[contains(text(), 'Island Trading')]/following-sibling::td[2]"));
		System.out.println(company + "'s " + "country name is " + country.getText());

	}

}
