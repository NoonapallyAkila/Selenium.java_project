package Utiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
public static WebDriver driver;
	
	public static String URL="https://chorusqa.cogninelabs.com/";
	
	public static WebDriverWait WebDriverWait ;
	
		
	public static void  LaunchApp() throws IOException{
		
	    
		ChromeOptions options = new ChromeOptions();
		
		
		
		options.addArguments("--incognito");
		
		
		driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.get(URL);
		
		}
	
	public static void CloseApp() {
		
		driver.close();
		

}}


