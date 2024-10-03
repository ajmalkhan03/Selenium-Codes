package selenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		WebElement link = driver.findElement(By.partialLinkText("Go to Dashboard"));
		link.click();
	}
 
}
