package Page_Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import Utiles.BaseClass;

public class SkillsetPage extends BaseClass {
	
	WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(1000));
	
	
	public void skillsetmenu () {
		
		
		 
		
		
		Actions actions = new Actions(driver);

        System.out.println("Switched to iframe. Now locating 'Configuration' element...");
        
        

        
        WebElement configurationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a [@title='Configuration']")));
        System.out.println("Configuration element located. Performing actions...");

        
        actions.moveToElement(configurationElement).perform();

       

        
        WebElement Skillsetmenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Skillset")));
        
        Skillsetmenu.click();

}

	
	
	public void addskillsetpopup(String skillname) throws InterruptedException {
		
		
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button [@id='updateOrUpdateSkillset']"))).click();
	 		
		 WebElement Skillsetname = driver.findElement(By.xpath("//input[@name='SkillSetName']"));
			
		Skillsetname.sendKeys(skillname);
		
    WebElement SkillsetType =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'chosen-container chosen-container-single chosen-container-single-nosearch']")));
		
		 SkillsetType.click();
		 
		 Thread.sleep(1000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li [contains(text() ,Technical)]"))).click();
		
		


		
		
		
		
	}
	
	
	
	public void editskillsetpopup(String textarea) {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='bi bi-pencil-fill grid-icon']"))).click();
		
		
		WebElement Description = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@id='skillsetDescription']")));
		Description.clear();
		Description.sendKeys(textarea);
		
		 WebElement Skillsetsave = driver.findElement(By.xpath("//button[@id='SaveData']"));
		 Skillsetsave.click();
		 
		
	}
	
	
	public void deleteskillsetpopup() {
		
		driver.findElement(By.xpath("//i[@class='bi bi-trash-fill grid-icon']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i [@class=\"bi bi-check2\"]"))).click();
	}
}
	
	
