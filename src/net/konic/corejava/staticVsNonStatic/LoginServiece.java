package net.konic.corejava.staticVsNonStatic;

public class LoginServiece {
   static String validateuser = "nawaz";
 

   public void details(String logout) {
	   System.out.println("logout");
	  
      
	 
}
   public static void main(String[] args) {
	 String result = LoginServiece.validateuser;
	  LoginServiece ls = new LoginServiece();
	  ls.details(result);
	  System.out.println(validateuser);
	  System.out.println(ls.validateuser);
	  
   }   
}