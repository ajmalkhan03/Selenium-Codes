package selenium_advanced_Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
		
		
		 driver.navigate().to("https://leafground.com/link.xhtml");
		 
		 WebElement clicklink = driver.findElement(By.linkText("Go to Dashboard"));
		 clicklink.click();
		 
		 driver.navigate().back();
		 
		 WebElement withoutclick = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
		 String attribute = withoutclick.getAttribute("href");
		 System.out.println(attribute);
		 
		 WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
		 brokenlink.click();
		 String title = driver.getTitle();
		 if(title.contains("Error 404")) {
			 System.out.println(title);
		 }
		 
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		 
		 WebElement clicklink1 = driver.findElement(By.linkText("Go to Dashboard"));
		 clicklink1.click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		 List<WebElement> tagname = driver.findElements(By.tagName("a"));
		 int size = tagname.size();
		 System.out.println(size);
		 
		 
		 
		 
	}

}
