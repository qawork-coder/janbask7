package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_89/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("TJ");
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		driver.findElement(By.name("email")).sendKeys("name");
		
	}

}
