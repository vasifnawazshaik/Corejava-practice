package net.konic.corejava.encapsulation;

public class UserProfile { /*Create a UserProfile class with private email.
Email must contain @.

Input:

Enter Email: usergmail.com

Output:

Invalid email */
       private String email;

	   public String getEmail() {
		   return email;
	   }

	   public void setEmail(String email) {
		   if(email.contains("@")) {
		   this.email = email;
		   System.out.println("email:" + email);
	   }
		   else {
			   System.out.println("invalid Email");
		   }
}
	   public static void main(String[] args) {
		UserProfile obj = new UserProfile();
		obj.setEmail("usergmail.com");
		obj.getEmail();
	}
   }