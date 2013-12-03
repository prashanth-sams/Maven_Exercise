package foo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest{
	WebDriver driver;
	private String baseUrl;
	  
@BeforeTest
public void setUp()
	{
		driver = new FirefoxDriver();
		baseUrl = "http://qa-math.knewknovel.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

@Test
public void googleConvertor() throws Exception
	{	
	driver.get(baseUrl + "/Editor.aspx#edit/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("ul.menu > li.action.dropdown.empty.new > div.title > div.icon")).click();
	Thread.sleep(5000);
	}		
	

@AfterTest
	  public void tearDown() throws Exception {		
	    driver.quit();
		}
}