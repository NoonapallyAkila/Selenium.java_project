package Test;

public class Login {
	
	private String username; 
	private String pwd; 
	 public void setusername(String username) 
	 { 
	 this.username=username; 
	 } 
	 public String getusername() 
	 { 
	 if(username=="John") 
	 { 
	 return "Username is correct, Please Enter Password" ; 
	 } 
	 else 
	 { 
	 return "Username is Incorrect" ; 
	 } 
	 } 
	
	 public void setpwd(String pwd) 
	 { 
	 this.pwd=pwd; 
	 } 
	 public String getpwd() 
	 { 
	 if(pwd=="John@14141") 
	 { 
	 return "Please go ahead" ; 
	 } 
	 else 
	 { 
	 return"Entered password is invalid" ; 
	 } 
	 } 
	
	
	 public static void main(String args[]) 
	 { 
	 Login l1 = new Login(); 
	 l1.setusername("John"); 
	 System.out.println(l1.getusername()); 
	 l1.setpwd("Something@143"); 
	 System.out.println(l1.getpwd()); 
	 } 
	

}
