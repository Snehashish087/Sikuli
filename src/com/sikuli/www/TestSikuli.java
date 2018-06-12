package com.sikuli.www;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestSikuli 
{
	public static void main(String[] args) throws FindFailed 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/snehashish/shopkick_automation/CIService/SikuliDemo/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
		
		
		Screen screen = new Screen();
		
		
		
		
		
		Pattern image_1 = new Pattern("/Users/snehashish/Desktop/Test3.png");
		screen.wait(image_1,3000);
		
		screen.click();
		screen.wait(image_1,3000);
		screen.click();
		
		
		
	}

}
