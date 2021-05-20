package day13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_89/chromedriver.exe");
		//WHat kind of driver , are we going to use, location of the driver 
		WebDriver driver=new ChromeDriver();
		//WebDriver - Interface 
		//chromeDriver - class
		//driver - object 
		driver.get("https://www.google.com");
		//Launch the browser
		
		
	}

}
