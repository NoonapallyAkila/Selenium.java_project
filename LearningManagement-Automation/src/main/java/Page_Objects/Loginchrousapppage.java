package Page_Objects;

import Utiles.BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginchrousapppage extends BaseClass{
	
	WebElement Username = driver.findElement(By.xpath("//input[@type='email']"));
	
	WebElement Next = driver.findElement(By.xpath("//input[@type='submit']"));
	
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	
	//WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	
	//WebElement yesbutton = driver.findElement(By.xpath("//input[@type ='submit']"));
	
	
	WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(50));
	
	public void Login(String uid , String pwd) throws InterruptedException {
		
		Thread.sleep(1000);
		Username.sendKeys(uid);
		
		Next.click();
		
		password.sendKeys(pwd);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Sign in']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type ='submit']"))).click();
		
		
		//WebElement LnD_icon = driver.findElement(By.xpath("//div[@class='ic-title' and contains(text(),'Learning and Development')]"));
	     // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ic-title' and contains(text(),'Learning and Development')]"))).click();
		
		
	      
		
		
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  /*	account_name=//div[@class='ur-nm mr-2' and contains(text(),'Chorus Automation')]
	cognine_logo=//div[@class='logo']
	PMO_Dashboard_title=//app-root//div[@class="pl-3" and contains(text(), 'Project Management')]
	iframe=(//iframe)[1]*/
	
	


