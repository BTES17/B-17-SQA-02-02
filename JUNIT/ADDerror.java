package JUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ADDerror {
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	public static WebDriver driver;
	     
	@Test	
	 public  void MultipleActions()
	    {
		 System.out.println("Execution Start");
		 String url= System.getProperty("user.dir")+"\\src\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver",url); 
		   
		    driver=new ChromeDriver(); 
	    	driver.get("https://www.facebook.com/");
		    String actualTitle = driver.getCurrentUrl();
		    try{
		    	 Assert.assertEquals(actualTitle, "https://www.facebook123.com/");
		    }catch(Throwable t){
		    	ec.addError(t);
		    	System.out.println(t.getMessage());
		    	
				   
		    } System.out.println("Execution Stop");
		   
		    
	      
	    }
}
