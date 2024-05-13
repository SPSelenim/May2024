package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//13-May-2024
//16:11

//corrected all 16:17


public class Home {

	public WebDriver driver=null;
	
	@BeforeClass
	public void tearTest()
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		  try
		  {
		  driver.get("D:\\SeleniumAutomation\\05DemoApps\\demo.html");
			  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  }catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		  	
	}
	
	@Test
  public void f() {
	  System.out.println("Home : Test1 : 16:77");
  POM_Home home=new POM_Home(driver);
  home.getDetails();
	  
  }
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
