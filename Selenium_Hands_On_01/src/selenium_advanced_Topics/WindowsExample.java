package selenium_advanced_Topics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://leafground.com/window.xhtml");
		String oldWindow = driver.getWindowHandle();
		
		WebElement clickbtn = driver.findElement(By.name("j_idt88:new"));
		clickbtn.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement emailclick = driver.findElement(By.name("email"));
		emailclick.sendKeys("ajmalkhan09@gmail.com");
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement Openmultiple = driver.findElement(By.name("j_idt88:j_idt91"));
		Thread.sleep(3000);
		Openmultiple.click();
		
		int numofwindow = driver.getWindowHandles().size();
		System.out.println("Number Of Opening Window Is :"+numofwindow);
		
		WebElement closewindowbtn = driver.findElement(By.name("j_idt88:j_idt93"));
		closewindowbtn.click();
		
		Set<String> newwindowHandles = driver.getWindowHandles();
		
		for (String allwindow : newwindowHandles) {
			if(!allwindow.equals(oldWindow)) {
				driver.switchTo().window(allwindow);
				driver.close();
				
			}
		}
		driver.quit();
	}

}
