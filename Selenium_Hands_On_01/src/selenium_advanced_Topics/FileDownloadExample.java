package selenium_advanced_Topics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileDownloadExample {

    public static void main(String[] args) throws InterruptedException {
        // Set ChromeDriver path
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\Testing_Softwares\\chromedriver.exe\\");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the URL
        driver.get("https://leafground.com/file.xhtml");

        // Click the download button (adjusting the locator to use id, which is generally more stable)
        WebElement btnclick = driver.findElement(By.id("j_idt93:j_idt95"));
        btnclick.click();

        // Wait for the file to download (use an appropriate wait time, this is just an example)
        TimeUnit.SECONDS.sleep(5);

        // Specify the download directory (this path should match the browser's default download path)
        File downloadLocation = new File("C:\\Users\\ajmal\\Downloads");

        // Get all files from the download location
        File[] allFiles = downloadLocation.listFiles();
        boolean fileFound = false;

        // Iterate through the downloaded files and check if the desired file is present
        for (File file : allFiles) {
            if (file.getName().equals("TestLeaf Logo.png")) {
                System.out.println("File is Present: " + file.getName());
                fileFound = true;
                
            }
        }

        // If the file was not found, print a message
        if (!fileFound) {
            System.out.println("File not found.");
        }

        // Close the browser
        driver.quit();
    }
}
