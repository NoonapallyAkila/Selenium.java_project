package Step_Def;

public class Loginpagedef {

	  @Given("the user is on the login page")
	 public void theUserIsOnTheLoginPage() {
        // Code to navigate to the login page, e.g., using Selenium WebDriver
        System.out.println("User is on the login page");
    }

    @When("the user enters the username {string} and password {string}")
    public void theUserEntersUsernameAndPassword(String username, String password) {
        // Code to enter username and password
        System.out.println("Entered username: " + username + " and password: " + password);
    }

    @When("clicks the login button")
    public void clicksTheLoginButton() {
        // Code to click the login button
        System.out.println("Clicked on login button");
    }

    @Then("the user should be redirected to the homepage")
    public void theUserShouldBeRedirectedToTheHomepage() {
        // Code to verify redirection to homepage
        boolean isHomePage = true;  // This should be determined by your code
        Assert.assertTrue("User is not on the homepage", isHomePage);
    }

}
