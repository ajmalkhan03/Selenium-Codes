package selenium_advanced_Topics;

import java.util.List;
import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://leafground.com/list.xhtml");
		
		
		List<WebElement> Selectable = driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));
		int size = Selectable.size();
		System.out.println(size);
		
//		Actions actions=new Actions(driver);
//		actions.keyDown(Keys.CONTROL)
//				.click(Selectable.get(0))
//				.click(Selectable.get(1))
//				.click(Selectable.get(2)).build().perform();	
		
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(Selectable.get(0));
		actions.clickAndHold(Selectable.get(1));
		actions.clickAndHold(Selectable.get(2));
		actions.build().perform();
	}
	
}
