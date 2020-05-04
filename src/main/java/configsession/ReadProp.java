package configsession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {

		WebDriver driver = null;
//How to read properties file;
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\rashi\\Automation\\AutoTesting\\Feb1LabProject\\"
				+ "src\\main\\java\\configsession\\configu.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/rashi/All Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("FF")) {
			driver=new FirefoxDriver();
		}
		else if (browserName.equals("IE")) {
			driver=new InternetExplorerDriver();
		}
		else if (browserName.equals("Safari")) {
			driver=new SafariDriver();
		}
		else {
			System.out.println("no browser value is given.");
		}
		driver.get(prop.getProperty("url"));

	}

}
