import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_one {

	public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/C:/Users/Akthar/Downloads/chromedriver_win32 (1)/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
