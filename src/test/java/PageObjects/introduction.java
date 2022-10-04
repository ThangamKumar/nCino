package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class introduction {

	 WebDriver driver;
		public introduction (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		

	     @FindBy(xpath="//div[normalize-space()='Labs']")
	     WebElement labs_tab;
	     
	     @FindBy(linkText="Angular 2.0")
	     WebElement Ang_lnk;
	     
	 	public void clklabs()
		{
	 		labs_tab.click();
		}
		
		public void clkAng()
		{
			Ang_lnk.click();
		}

}
