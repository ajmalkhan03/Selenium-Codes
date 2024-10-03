package selenium_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

		
		WebDriver driver = new ChromeDriver();
		
		try {
		driver.get("https://leafground.com/input.xhtml");
		driver.findElement(By.name("j_idt88:name")).sendKeys("Ajmalkhan");
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("Chrompet");
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		boolean enabled = textBox.isEnabled();
		if(!enabled) {
			System.out.println("Text Box Is Disabled");
		}
		else {
			
			System.out.println("Text Box Enabled");
		}
		
				
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		String attribute = driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(attribute);
		WebElement findElement = driver.findElement(By.name("j_idt88:j_idt99"));
		findElement.sendKeys("ajmal0699@gmail.com");
		findElement.sendKeys(Keys.TAB);
		WebElement activeElement = driver.switchTo().activeElement();
		String activeElemementName = activeElement.getAttribute("placeholder");
		System.out.println("Control Moved:" + activeElemementName);
		WebElement AboutYourself = driver.findElement(By.name("j_idt88:j_idt101"));
		AboutYourself.sendKeys("Ajmalkhan Iam Software Tester I have 2 years Of Experience In Testing");
		
		WebElement txtboxenter = driver.findElement(By.name("j_idt106:thisform:age"));
		txtboxenter.sendKeys(Keys.ENTER);
		
		WebElement erroremessage = driver.findElement(By.id("j_idt106:thisform:j_idt110"));
		
		if(erroremessage.isDisplayed()) {
			
			String errortext = erroremessage.getText();
			System.out.println("Error message Displayed: "+" " +errortext);
		}
		else {
			System.out.println("Not displayed Error message");
			
		}
		
		WebElement labelname = driver.findElement(By.id("j_idt106:j_idt113"));
		Point InitialPosition = labelname.getLocation();
		System.out.println("First Position:"+InitialPosition);
		
		WebElement click = driver.findElement(By.name("j_idt106:float-input"));
		click.click();
		
		Point newlocation = labelname.getLocation();
		System.out.println("new location is "+newlocation);
																					
		
		WebElement DdSelect = driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/ul"));
		DdSelect.sendKeys("Ajmalkhan");
		
		WebDriverWait wait=new WebDriverWait(driver,(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/ul")));
		
		@SuppressWarnings("unchecked")
		List<WebElement> options = (List<WebElement>) driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[4]/span"));
		
        if (options.size() >= 3) {
            options.get(2).click();
            System.out.println("Third option selected.");
        } else {
            System.out.println("Less than 3 options available.");
        
    } 
	}
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            //driver.quit();
        }
	}
	
}
