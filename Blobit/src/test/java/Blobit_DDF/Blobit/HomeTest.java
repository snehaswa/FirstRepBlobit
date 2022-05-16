package Blobit_DDF.Blobit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.excel.utility.ExcelReader;

import Pages.HomePage;
import Pages.LoginPage;
//import ReadExcelData.Readexcel;
import config.PropertiesFile;

public class HomeTest extends PropertiesFile {

	public HomeTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws Exception {
		initialization();

	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String userid, String pwd) throws InterruptedException {

		HomePage hp = new HomePage();
		hp.varifySearchPageTitle(driver);
		hp.signinwithemail.click();
		hp.Emailaddress.sendKeys(userid);
		hp.Password.sendKeys(pwd);

		hp.clickonLogin();
		LoginPage lp = new LoginPage();
		/*String expected = "Welcome snehar@geekyants.com";
		String actual = driver.getTitle();
		//String title = lp.getdisplayedTitle();
		Assert.assertEquals(expected, actual);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}*/
		lp.clickstudent();
	
		lp.VerifyTitle();
		lp.LogOut();

	}

	// @DataProvider(name="LoginData")
	/*
	 * public Object[] [] getTestData() throws Exception {
	 * 
	 * Object data[] [] = ExcelReader.getTestData("Blobit");
	 * System.out.println("****************"); return data; }
	 */

	@DataProvider(name = "LoginData")

	// public void getData() {

	public Object[][] getData() {
		String path = "//Users/sneharajkumarswami/eclipse-workspace/Blobit/src/main/java/config/BlobitNew.xlsx";

		ExcelReader reader = new ExcelReader();

		Object data[][] = null;
		try {
			data = reader.getTestData("Sheet1");
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}

}
