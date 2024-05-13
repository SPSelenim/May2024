package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Home {
public WebDriver driver=null;
	
	public POM_Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getDetails()
	{
		String curtitle=driver.getCurrentUrl();
		  System.out.println("Title is : "+curtitle);
		  driver.findElement(By.name("QA")).click();
		   curtitle=driver.getTitle();
		  System.out.println("After clicking - Title is : "+curtitle);
		  
	}
}
