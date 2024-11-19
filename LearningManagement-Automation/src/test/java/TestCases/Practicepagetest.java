package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import Page_Objects.Loginchrousapppage;
import Page_Objects.PracticePage;
import Utiles.BaseClass;

public class Practicepagetest {
	
public static void main (String[] args) throws InterruptedException,  IOException, TimeoutException {
		
		BaseClass.LaunchApp();
		
		Thread.sleep(2000);
		
		Loginchrousapppage lcap = new Loginchrousapppage();
		
		lcap.Login("akila.noonapally@cognine.com", "Akhi@2001");
		
		
		
		PracticePage prp = new PracticePage();
		prp.LndIcon();
		
		prp.practicemenu();
		
		prp.addpracticepopup("Testing 33", "Aditya Malluvalasa" , "akila@cognine.com", "akila@cognine.com");
		
		Thread.sleep(1000);
         prp.editpracticepopup("akilanoonapally@cognine.com");
		
		//prp.deletepracticepopup();
}}

