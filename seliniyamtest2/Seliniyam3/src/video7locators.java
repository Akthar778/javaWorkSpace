import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class video7locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		
		
		highlight(driver,driver.findElement((By.id("login_field")) ));
		Thread.sleep(1000);
		highlight(driver,driver.findElement(By.name("password")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.tagName("h1")));
		Thread.sleep(1000);
		highlight(driver,driver.findElement(By.name("commit")));
		Thread.sleep(1000);
		
		highlight(driver, driver.findElement(By.linkText("Contact GitHub")));
		Thread.sleep(1000);
		highlight(driver,driver.findElement(By.name("password")));
		Thread.sleep(1000);
		
		highlight(driver,driver.findElement(By.linkText("Terms")));
		Thread.sleep(1000);
		highlight(driver, driver.findElement(By.linkText("Privacy")));
		Thread.sleep(1000);
		
		highlight(driver, driver.findElement(By.className("class=\"footer container-lg p-responsive py-6 mt-6 f6\"")));
		
		driver.quit();
		}

	private static void highlight(WebDriver driver, WebElement findElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", findElement);
		
	}
	

}
