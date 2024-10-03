package selenium_advanced_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.youtube.com/");
		
		WebElement tooltip = driver.findElement(By.xpath("//*[@id=\"voice-search-button\"]/ytd-button-renderer/yt-button-shape/button"));
		
		Actions action=new Actions(driver);
		action.moveToElement(tooltip).perform();
		
		WebElement findtooltip = driver.findElement(By.xpath("//*[@id=\"voice-search-button\"]/ytd-button-renderer/tp-yt-paper-tooltip"));
		String text = findtooltip.getText();
		System.out.println(text);
		
	}

}
