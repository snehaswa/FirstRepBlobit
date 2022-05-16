package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesFile {
	 

	//public static void main(String[] args) throws IOException, InterruptedException {

	
		 public static WebDriver driver;

		public static Properties prop;
		// readPropertiesFile();
		// writePropertiesFile();
public PropertiesFile(){
			prop = new Properties();
		
	

		
		try {
			InputStream input = new FileInputStream(
					"/Users/sneharajkumarswami/git/FirstRepBlobit/Blobit/src/main/java/config/config.properties");
		
			
			prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			
		}

		

		System.out.println(prop.getProperty("browser"));

}
	
		
		public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");

		// public WebDriver getDriver(String browserName) {
		// WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.Chrome.driver", "/Users/sneharajkumarswami/Downloads/chromedriver");
			driver = new ChromeDriver();
			//this.driver=new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.geckodriver.driver", "/Users/sneharajkumarswami/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("no browser value is given");
		}
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(1000);
	
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		/*
		 * public static void writePropertiesFile() {
		 * 
		 * try { OutputStream output = new FileOutputStream(
		 * "/Users/sneharajkumarswami/eclipse-workspace/Demo1/src/config/config.properties"
		 * ); prop.setProperty("browser", "chrome"); prop.store(output, null);
		 * 
		 * } catch (Exception e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 */
	}

	
}


