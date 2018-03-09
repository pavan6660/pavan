package xyz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	
	public void abc(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arte118_rajesh\\Desktop\\chromelatest\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		
		
	}
}
