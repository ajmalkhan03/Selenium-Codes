package selenium_advanced_Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://leafground.com/table.xhtml");
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int size = columns.size();
		
		System.out.println(size);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size1 = rows.size();
		
		System.out.println(size1);
		
		WebElement getPercent = driver.findElement(By.xpath("//*[@id=\"form:j_idt89_data\"]/tr[1]/td[1]//following::td[1]"));
		String text = getPercent.getText();
		System.out.println(text);
	}

}
