package testCase;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nCino_Assessment {
	static Logger logger; // for Log4J

	
        public static void main(String[] args) throws InterruptedException {
    		logger=LogManager.getLogger("Log4jLogging"); // for Log4J

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PyraUIUX\\Desktop\\Drivers-Java\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        
        
        //2. Open the url in the browser 
        logger.info("Launching the browser URL");
        driver.get("http://todomvc.com/");
        driver.manage().window().maximize();       
        Thread.sleep(5000);
        
        
        driver.findElement(By.xpath("//div[normalize-space()='Labs']")).click();
        logger.info("Clicked on Labs Tab");

        Thread.sleep(5000);

        driver.findElement(By.linkText("Angular 2.0")).click();
        logger.info("Clicked on Angular Tab");

        Thread.sleep(3000);

        WebElement Textbox= driver.findElement(By.xpath("//input[@placeholder='What needs to be done?']"));
        Textbox.sendKeys("Welcome to nCino!");
        logger.info("Item entered to the textfield");


        Actions act=new Actions(driver);
 	
        act.sendKeys(Keys.ENTER).perform();
        logger.info("Item added to todo list");

     
        WebElement todo= driver.findElement(By.cssSelector("div[class='view'] label"));
	    act.doubleClick(todo).perform(); // double click action
        logger.info("Double click action has been performed");

	   
     	WebElement todo_edit =driver.findElement(By.xpath("//input[@class='edit']"));
     	todo_edit.click();
        logger.info("Edit action has been performed");

    	System.out.println("comingggg123333333333");


    	todo_edit.sendKeys(Keys.BACK_SPACE );
     	System.out.println("coming back");

     	todo_edit.sendKeys(". Have a good day.");
        act.sendKeys(Keys.ENTER).perform();
        
        logger.info("Existing item has been edited successfully");

       // driver.close();

     
        

}
}
