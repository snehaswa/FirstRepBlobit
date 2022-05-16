package Pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import config.PropertiesFile;

public class LoginPage extends PropertiesFile {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Welcome snehar@geekyants.com')]")
	public WebElement Title;

	
	@FindBy(xpath="//button[contains(text(),'Sneha')]")
	public WebElement SelectStudent;
	
	@FindBy(xpath="//h3[@class='navbar-heading-text']")
	public WebElement Title2;
	
	@FindBy(xpath="//button[contains(text(),'Logout')]")
	public WebElement Signout;
	
	
	
	public void clickstudent() {
		SelectStudent.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void VerifyTitle() {
		String s=Title2.getText();
		System.out.println("title 2 is"+s);
		String Exp=" Sneha's Profile";
		Assert.assertEquals(s, Exp);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void LogOut() {
		Signout.click();
		
	}
	
	//public String getdisplayedTitle() {
		//return actual;
		
		//System.out.println("title is: "+Title.getText());
		// String titleHomePage=HomePage.validatingHomePageTitle();
		// Assert.assertEquals(titleHomePage, “topgeek | UpSkill • Jobs • Dev
		// Community”);
	

	/*
	 * { String TitleName=Title.getText();
	 * System.out.println("Selected Title= "+TitleName); boolean
	 * T1=assert.assertEquals(TitleName, "Welcome snehar@geekyants.com");
	 * 
	 * 
	 * }
	 */
	
	String expected = "Welcome snehar@geekyants.com";
	//String actual = Title.getText();
	
	{
		System.out.println("Compared");
/*//(" "+actual+" "+signinwithemail.getText());

		if (expected.equals(actual)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
	
}
