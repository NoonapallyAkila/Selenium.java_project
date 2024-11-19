package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import Page_Objects.Loginchrousapppage;
import Page_Objects.PracticePage;
import Page_Objects.SkillsetPage;
import Page_Objects.TopicPage;
import Utiles.BaseClass;

public class Topictestpage {
	
	
public static void main (String[] args) throws InterruptedException,  IOException, TimeoutException {
		
		BaseClass.LaunchApp();
		
		Thread.sleep(2000);
		
		Loginchrousapppage lcap = new Loginchrousapppage();
		
		lcap.Login("akila.noonapally@cognine.com", "Akhi@2001");
		
		PracticePage prp = new PracticePage();
		prp.LndIcon();
		
		
		SkillsetPage ssp = new SkillsetPage();
		
		ssp.skillsetmenu();
		
		
		TopicPage tp = new TopicPage();
		
		tp.Topictab();
		
		
		
}

}
