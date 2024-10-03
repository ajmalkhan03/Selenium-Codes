package selenium_advanced_Topics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
		
		
		 driver.get("https://leafground.com/file.xhtml");
		 
		 WebElement choosebtn = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		 choosebtn.click();
		 
		// Choose File:"C:\Users\ajmal\TestLeaf Logo.png"
		 String file="C:\\Users\\ajmal\\TestLeaf Logo.png";
		 StringSelection selection =new StringSelection(file);
		 
		 
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		 
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 Thread.sleep(3000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
	
	}

}
