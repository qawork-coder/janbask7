package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_89/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	System.out.println(driver.findElements(By.tagName("a")).size());
	
	//driver.findElement(By.cssSelector("#email")).sendKeys("tj");
	
	driver.findElement(By.xpath("//*[@data-testid='royal_email']")).sendKeys("TJ");
		
	}

}


//twitter.com/login