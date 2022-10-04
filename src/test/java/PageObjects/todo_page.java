package PageObjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class todo_page {

	WebDriver driver;


	public todo_page (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

     @FindBy(xpath="//input[@placeholder='What needs to be done?']")
     WebElement txtbox;
     
     @FindBy(css="div[class='view'] label")
     WebElement item;
     
     @FindBy(xpath="//input[@class='edit']")
     WebElement item_edit;
     
     public void add_item(String a_item)
		{
    	  txtbox.sendKeys(a_item);
		}
     
     public void clk()
     {
		 Actions act= new Actions(driver);

       act.sendKeys(Keys.ENTER).perform();

     }
     
	 public void double_clk_item()
	   {
		 Actions act= new Actions(driver);

	      System.out.println("coming action class");  
	      try {

			Thread.sleep(1000);
		 } catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	      act.moveToElement(item).doubleClick().build().perform();
	   }
	 public void clk_edit_item()
		{
		    item_edit.click();
		    
		    item_edit.sendKeys(Keys.BACK_SPACE );

		}
	 
	 public void edit_item(String e_item)
		{
		    item_edit.sendKeys(e_item);
		}
		
     
}
