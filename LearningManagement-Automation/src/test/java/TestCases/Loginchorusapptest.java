package TestCases;

import java.io.IOException;

import Page_Objects.Loginchrousapppage;
import Utiles.BaseClass;

public class Loginchorusapptest {
	
	public static void main (String[] args) throws InterruptedException,  IOException {
		
		BaseClass.LaunchApp();
		
		Thread.sleep(2000);
		
		Loginchrousapppage lcap = new Loginchrousapppage();
		
		lcap.Login("akila.noonapally@cognine.com", "Akhi@2001");
	}

}
