package Page_Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utiles.BaseClass;

public class TopicPage  extends BaseClass{
	
	WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(500));
	
	public void Topictab() {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='topic-button']"))).click();
		
		WebElement Skillsetdropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text() , '--Select Skillset--')]")));
		
		Skillsetdropdown.click();
		
		
		
		WebElement selectskillset = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains (text() , 'Angular js')]")));
		
		selectskillset.click();
		
		
		
		
		
	}
	

}
