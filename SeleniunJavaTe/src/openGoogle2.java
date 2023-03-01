

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openGoogle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akthar\\Downloads\\chromedriver_win32\\chromedriver.exe (1)" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=O_eupfuwRT0&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=7");

	}

}
