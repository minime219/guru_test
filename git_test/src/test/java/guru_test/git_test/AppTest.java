package guru_test.git_test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	protected WebDriver driver;
    @Test
    public void test() {
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("http://www.guru99.com");
    	String eTitle = "Meet Guru99";
    	String aTitle = driver.getTitle();
    	System.out.println(aTitle);
    	if(aTitle.contains(eTitle)) {
    		System.out.println("Test Passed!");
    	} else {
    		System.out.println("Test Failed");
    	}
    	driver.close();
    }
}
