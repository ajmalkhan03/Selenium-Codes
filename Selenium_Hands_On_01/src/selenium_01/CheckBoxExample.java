package selenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		checkbox.click();

		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		checkbox1.click();

		WebElement checkbox2 = driver.findElement(By.id("j_idt87:j_idt102"));

		if (checkbox2.isEnabled()) {
			System.out.println("Check Box is Disabled");
													
		} else {

			System.out.println("Checkbox is Enabled");
		}
		
		

		WebElement toggleswitch = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
		toggleswitch.click();
		
		
	}

}
