package Step_Def;

public class Practicepagedef {

   public void lndicon() {
        
        System.out.println("User is on the master page");
    }

    @When("the user enters the name {string} and value{string}")
    public void addpracticepopup(String name , String value ,String manageemail , String groupemai) {
       
        System.out.println("practice added successfully");
    }

    @When("clicks on the edit practice")
    public void editpracticepopup(String email1) 
        System.out.println("practice edited successfully");
    }

    @when("the user should be redirected to the homepage")
    public void deletepracticepopup() {
      System.out.println("practice deleted successfully");
       
       
    }

}
