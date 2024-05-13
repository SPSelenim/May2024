package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Search {
public WebDriver driver=null;
	
	public POM_Search(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getDetails()
	{
		String curtitle=driver.getCurrentUrl();
		  System.out.println("Title is : "+curtitle);
		  driver.findElement(By.name("Development")).click();
		   curtitle=driver.getTitle();
		  System.out.println("After clicking - Title is Development: "+curtitle);
		  
	}
}
