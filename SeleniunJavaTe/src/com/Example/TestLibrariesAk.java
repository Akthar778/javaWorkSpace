package com.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLibrariesAk {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./resourcesAk/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}

}
