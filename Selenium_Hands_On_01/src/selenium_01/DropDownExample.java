package selenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
		
		
		 driver.get("https://leafground.com/select.xhtml");
		 
		 WebElement Dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		 Select select= new Select(Dropdown1);
		 select.selectByIndex(1);
		// select.selectByValue("3");
		 select.selectByVisibleText("India");
		 
	
		 
		 
	}

}
