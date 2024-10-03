package selenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
		
		
		 driver.get("https://leafground.com/alert.xhtml");
		 
		 WebElement simplealertbtn = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		 simplealertbtn.click();
		 
		 org.openqa.selenium.Alert simplealert =driver.switchTo().alert();
		 
		 simplealert.accept();
		 
		 WebElement confirmalertbtn = driver.findElement(By.name("j_idt88:j_idt93"));
		 confirmalertbtn.click();
		 
		 
		 org.openqa.selenium.Alert Confalert =driver.switchTo().alert();
		 Confalert.dismiss();
		 
		 
		 WebElement promptalertbtn = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]"));
		 promptalertbtn.click();
		 
		 
		 org.openqa.selenium.Alert promptAlert =driver.switchTo().alert();
		 promptAlert.sendKeys("Ajmalkhan M");
		 promptAlert.accept();
	}

}
