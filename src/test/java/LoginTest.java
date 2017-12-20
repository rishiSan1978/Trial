import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver =  new ChromeDriver();
	}
	
	@Test
	public void doLogin(){
		 driver.get("https://www.google.com/");
		 System.out.println("Hello");
		 System.out.println("Welcome to hello world");
		 System.out.println("Welcome to hello world");
		 System.out.println("Welcome to hello world");
		 System.out.println("Welcome to hello world");
		 
	}
	
	@AfterTest
	public void tearDown(){
	   driver.quit();		
	}
}
