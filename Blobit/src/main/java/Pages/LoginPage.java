package Pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//h1[contains(text(),'Welcome to Blobit')]")
	public WebElement Title2;

	public void getdisplayedTitle() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Title.isDisplayed();
		String S = Title.getText();
		Assert.assertEquals(S, "Welcome snehar@geekyants.com");
	}

	public void validatetitle() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Title2.isDisplayed();
		String gettitlename = Title2.getText();
		Assert.assertEquals(gettitlename, "Welcome to Blobit");
		//
		// Assert.assertTrue(Acttitle.contains(Exptitle));
		System.out.println("Title validated");
	}

}
