package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.PropertiesFile;

public class HomePage extends PropertiesFile {
	//public static WebDriver driver;
	

	// Initialzing the page objects:

	public HomePage() {
		// initializeDriver();
		PageFactory.initElements(driver, this);
	}

	// Page Factory- OR;

	@FindBy(xpath = "//button[contains(text(),'SIGN IN WITH EMAIL')]")
	public WebElement signinwithemail;

	@FindBy(xpath = "/MuiButton-startIcon MuiButton-iconSizeLarge css-wth0qt")
	public WebElement signinwithgoogle;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement Emailaddress;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	public WebElement loginbtn;
	
	@FindBy(xpath="//button[contains(text(),'sneha')]")
public WebElement selectstudent;
	// actions
	
	public String varifySearchPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public void SignInEmail() throws InterruptedException {
		signinwithemail.click();
		Thread.sleep(3000);
		
	
		// String expected = Welcome snehar@geekyants.com;
		// String actual = signinwithemail.getText();
		// System.out.println("Compared");
		// System.out.print(" "+actual+" "+signinwithemail.getText());

//    if(expected.equals(actual)){
//        System.out.println("Pass");
//    }
//        else {
//            System.out.println("Fail");
//        }
//		Thread.sleep(1000);

	}

	public void EmailAddText() throws InterruptedException {
		Emailaddress.click();
		Thread.sleep(3000);
		// Emailaddress.clear();
		//Emailaddress.sendKeys("Snehar@geekyants.com");
		//String expected = emailid;
		//String actual = signinwithemail.getText();
		//System.out.println("Compared");
		//System.out.print("  " + actual + " " + signinwithemail.getText());

	}
	
	public void EnterPassword() throws InterruptedException
	{
		Password.click();
		Thread.sleep(3000);
	}
	
	public void clickonLogin() throws InterruptedException
	{
		loginbtn.click();
		Thread.sleep(2000);
	}

	public void SignInGoogleAcc() throws InterruptedException {
		signinwithgoogle.click();
		// signinwithgmail.sendKeys(Gemailid);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	public void clickstudent() throws InterruptedException {
		selectstudent.click();
		Thread.sleep(1000);
	}

	

	

	
}



