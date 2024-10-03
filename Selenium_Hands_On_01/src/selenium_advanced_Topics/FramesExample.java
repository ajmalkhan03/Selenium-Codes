package selenium_advanced_Topics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement frmebtn = driver.findElement(By.id("Click"));
		frmebtn.click();
		 String text = driver.findElement(By.id("Click")).getText();
		 
		 System.out.println(text);
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame(2);
		 driver.switchTo().frame("frame2");
		 
		 
		 WebElement btn2click = driver.findElement(By.id("Click"));
		 btn2click.click();
		 
		 
		 driver.switchTo().defaultContent();
		 
		 List<WebElement> framescount = driver.findElements(By.tagName("iframe"));
		 int size = framescount.size();
		 
		 System.out.println(size);
		 
		 
		 
	}

}
