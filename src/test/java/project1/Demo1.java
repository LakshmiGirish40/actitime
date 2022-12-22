package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	public void testA()
	{
		WebDriverManager.chromedriver().setup();//automatically download latest exe and set the path
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
}


//Users/girishnarendra/.cache/selenium/chromedriver/mac64/108.0.5359.71/chromedriver