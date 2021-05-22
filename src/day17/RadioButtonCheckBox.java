package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_89/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		
		driver.findElement(By.id("vfb-7-1")).click();
		
		driver.findElement(By.id("vfb-6-2")).click();
		
		System.out.println(driver.findElement(By.id("vfb-6-1")).isSelected());
		
		System.out.println(driver.findElement(By.id("vfb-6-2")).isDisplayed());
		
		
		
	}

}
