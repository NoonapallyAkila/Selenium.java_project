package Step_Def;

public class Skillsetpagedef {
	
	 @Given("the user clicks skillset menu item")
   public void skillsetmenu(){

       System.out.println("navigated to skillset management");
    }

    @When("successfully added skillset")
    public void addskillsetpopup(String skillsetname ) {
       
        System.out.println("skillset added successfully");
    }

    @When("successfully edited skillset")
    public void editpracticepopup(String skill) 
        System.out.println("skillset edited successfully");
    }

    @when("successfully deleted skillset")
    public void deleteskillsetpopup() {
      System.out.println("skillset deleted successfully");
       
       
    }
    @Then("user should be on skillset page")
       public void skillsetmenu(){
    System.out.println("user should be skillset management");

}
