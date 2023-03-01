package com.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
       
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\DOWNLOADS\\edgedriver_win64\\msedgedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=O_eupfuwRT0&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=7");

	}

}
