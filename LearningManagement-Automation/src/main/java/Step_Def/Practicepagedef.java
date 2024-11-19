package Step_Def;

public class Practicepagedef {

   
   @Given("the user clicks practice menu item")
   public void practicemenu(){

       System.out.println("navigated to practice management");
    }

    @When("successfully added practice")
    public void addpracticepopup(String name , String value ,String manageemail , String groupemai) {
       
        System.out.println("practice added successfully");
    }

    @When("successfully edited practice")
    public void editpracticepopup(String email1) 
        System.out.println("practice edited successfully");
    }

    @when("successfully deleted practice")
    public void deletepracticepopup() {
      System.out.println("practice deleted successfully");
       
       
    }
    @Then("user should be on practice page")
       public void practicemenu(){
    System.out.println("user should be practice management");
       
}
