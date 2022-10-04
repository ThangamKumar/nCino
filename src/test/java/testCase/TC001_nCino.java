package testCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.introduction;
import PageObjects.todo_page;
import testBase.Baseclass;

public class TC001_nCino extends Baseclass {
	
	@Test

	public void adding_item() throws InterruptedException,IOException
	{
		try 
		{
			
	     logger.info("TC001_ started executing ");

	     
	     driver.get("http://todomvc.com/");
	     driver.manage().window().maximize();
	        
	     introduction ind =new introduction(driver);
		 ind.clklabs();
	     logger.info("Clicked on Labs Tab");
	     

		 ind.clkAng();
	     logger.info("Clicked on Angular Tab");
         System.out.println("angular clicked");

	     todo_page todo =new todo_page(driver);
         System.out.println("todo page clicked");

		 todo.add_item("Welcomee");
		 
		 logger.info("Item entered to the textfield");
		 
		 todo.clk();
	     logger.info("Item added to todo list");
	     
	     todo.double_clk_item();
	     logger.info("Double click action has been performed");

	     todo.clk_edit_item();
	     logger.info("Edit action has been performed");
	     
	     logger.info("backspace action has been done");

	   	  System.out.println("coming back");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	      todo.edit_item(" to ncino");

	      todo.clk();
	        
	      logger.info("Existing item has been edited successfully");
		  logger.info("TC001_ Execution completed successfully ");
		}
		catch (Exception e)
		{
			logger.fatal("Failed ");
			captureScreen(driver, "adding_item"); //Capturing screenshot
			Assert.fail();
		}

	}
}
