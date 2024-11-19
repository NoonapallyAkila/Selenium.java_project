package Page_Objects;

import java.time.Duration;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import Utiles.BaseClass;

public class PracticePage extends BaseClass {
	
	WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(500));
	
	
	WebElement Iframe = driver.findElement(By.xpath("//iframe[@id='undefined']"));
	
	//WebElement Configuration = driver.findElement(By.xpath("//span[@class='text nav-text'][contains(.,'Configuration')]"));
	
	//WebElement Practicemenu = driver.findElement(By.linkText("Practice"));
	
	
	//WebElement AddPractice = driver.findElement(By.linkText(" Add Practice"));
	
	/*WebElement Practicename = driver.findElement(By.xpath("//input[@name='PracticeName']"));
	
	WebElement Practicehead = driver.findElement(By.id("PracticeHeadsDropDown"));
	
	WebElement Managementemail = driver.findElement(By.xpath("//input[@name='PracticeManagementEmail']"));
	
	WebElement Groupemail = driver.findElement(By.xpath("//input[@name='PracticeGroupEmail']"));
	
	WebElement Practicesave = driver.findElement(By.xpath("//button[@id='SaveData']"));*/
	
	
	public void LndIcon () {
		
	
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ic-title' and contains(text(),'Learning and Development')]"))).click();
			
		 
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Iframe));
			
			
	}
			
	public void practicemenu() {
				
			Actions actions = new Actions(driver);

	        System.out.println("Switched to iframe. Now locating 'Configuration' element...");
	        
	        

	        
	        WebElement configurationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@title='Configuration']")));
	        System.out.println("Configuration element located. Performing actions...");

	        
	        actions.moveToElement(configurationElement).perform();

	       

	        
	        WebElement Practicemenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Practice")));
	        
	        Practicemenu.click();
	      //driver.switchTo().defaultContent();
			
		
	}
	
	public void addpracticepopup (String name , String value ,String manageemail , String groupemail) throws InterruptedException, TimeoutException {
		
		
	
				
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),' Add Practice')]"))).click();
				 		
		 WebElement Practicename = driver.findElement(By.xpath("//input[@name='PracticeName']"));
			
		Practicename.sendKeys(name);
		
		WebElement Practicehead =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"PracticeHeadsDropDown_chosen\"]/ul/li/input")));
		
		Practicehead.sendKeys(value);
		Practicehead.click();
		//Select select = new Select(Practicehead);
		//select.selectByVisibleText("Aditya Malluvalasa");
 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"PracticeHeadsDropDown_chosen\"]/div/ul/li[3]"))).click();
		
		WebElement Managementemail = driver.findElement(By.xpath("//input[@name='PracticeManagementEmail']"));
		
		 Managementemail.sendKeys(manageemail);
		 
		 WebElement Groupemail = driver.findElement(By.xpath("//input[@name='PracticeGroupEmail']"));
		 Groupemail.sendKeys(groupemail);
		 
		 driver.findElement(By.xpath("//*[@id=\"EditModal\"]/div/div/div[4]/div[1]/label")).click();
		 
		 WebElement Practicesave = driver.findElement(By.xpath("//button[@id='SaveData']"));
		 Practicesave.click();
				 
		 try {
	            
	            WebElement addpracticetoaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),' Practice added successfully')]"))); // Adjust the locator to match your toaster element

	            // Print the toaster message text to the console
	            System.out.println("Toaster message: " + addpracticetoaster.getText());
	        } catch (WebDriverException e) {
	            System.out.println("Toaster message not found or could not be retrieved.");
	            e.printStackTrace();
	        } 
				 
	}		 
		 
		 public void editpracticepopup (String email1) throws InterruptedException, TimeoutException {
			 
			 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='bi bi-pencil-fill'])[1]"))).click();	
			 
			WebElement editpractice =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='PracticeGroupEmail']")));
			editpractice.clear();
			editpractice.sendKeys(email1);
			
			
			driver.findElement(By.xpath("//*[@id=\"EditModal\"]/div/div/div[4]/div[1]/label")).click();
			 
			 WebElement Practicesave = driver.findElement(By.xpath("//button[@id='SaveData']"));
			 Practicesave.click();
			 
			 Thread.sleep(1000);
			 
			 try {
		            
		            WebElement editpracticetoaster = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),' Practice modified successfully')]"))); // Adjust the locator to match your toaster element

		            // Print the toaster message text to the console
		            System.out.println("Toaster message: " + editpracticetoaster.getText());
		        } catch (WebDriverException e) {
		            System.out.println("Toaster message not found or could not be retrieved.");
		            e.printStackTrace();
		        } 
					 
			 
			 
		 }
				
	
		 
	public  void deletepracticepopup() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//i[@class=\"bi bi-trash-fill\"]")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i [@class=\"bi bi-check2\"]"))).click();
		
		try {
            
            WebElement deletepracticetoaster = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),' Practice deleted successfully')]"))); // Adjust the locator to match your toaster element

            // Print the toaster message text to the console
            System.out.println("Toaster message: " + deletepracticetoaster.getText());
        } catch (WebDriverException e) {
            System.out.println("Toaster message not found or could not be retrieved.");
            e.printStackTrace();
        } 
			 
		
	}
	}
	

