package selenium_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Name = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.name("pass"));
		Name.sendKeys("9659898410");
		Password.sendKeys("Ajmal@*99");
		 Thread.sleep(300);
		 driver.findElement(By.name("login")).click();
		 //driver.close();

	}

}
