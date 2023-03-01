import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonp1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		m1(driver, driver.findElement(By.id("nav-logo-sprites")));
		Thread.sleep(1000);
		m1(driver, driver.findElement(By.className("nav-a")));
		Thread.sleep(1000);
		}
	private static void m1(WebDriver driver, WebElement findElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", findElement);
		
	}

}
