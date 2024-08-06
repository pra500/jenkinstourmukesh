package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	 WebDriver driver;
	 
	 
  @Test
  public void fTest() {	  	   
	    
	   
	   
	    driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");	
		String title=driver.getTitle();		
		Assert.assertEquals(title, "Test Login | Practice Test Automation");
		driver.close();		
			
	  
  }
  

  

}



