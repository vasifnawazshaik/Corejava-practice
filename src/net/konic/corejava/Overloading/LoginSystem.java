package net.konic.corejava.Overloading;

public class LoginSystem {
	/*Overload login() for username/password & OTP.

	INPUT:
	login("shiraz", "pass123")
	login(9000000000L, 1234)

	OUTPUT:
	Login success using Username & Password
	Login success using Mobile OTP
    */
	 void login(String name,String pass) {
		 System.out.println("login success using username & pass");
	 }
	 void login(long number,int otp) {
		 System.out.println("login success using mobile num & otp");
	 }
	 public static void main(String[] args) {
		LoginSystem first = new LoginSystem();
		first.login("nawaz", "wax13");
		first.login(93909191, 162413);
	}

}
