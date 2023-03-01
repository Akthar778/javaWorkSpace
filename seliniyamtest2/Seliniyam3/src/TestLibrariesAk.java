

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLibrariesAk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\java workspace\\seliniyamtest2\\Seliniyam3\\src\\resources\\chromedriver.exe");      
		WebDriver driver = new ChromeDriver();
         		
//		WebDriver obj = new EdgeDriver();
//		obj.get("https://www.google.co.in/");̥
		
		driver.get("https://www.google.co.in/");
		driver.close();
	}

}
