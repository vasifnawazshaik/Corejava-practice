package net.konic.corejava.Overloading;

public class MobileRecharge {
	/*Overload recharge() for plan and coupon.

	INPUT:
	recharge(9000000000L)
	recharge(9000000000L, 299)
	recharge(9000000000L, 299, "NEW50")

	OUTPUT:
	Recharge successful for 9000000000
	Recharge ₹299 successful
	Recharge ₹299 with coupon NEW50 applied
*/
       void recharge(String phone) {
    	   System.out.println("Recharge successful for " + phone);
       }
       void recharge(String phone,int ipohone) {
    	   System.out.println("Recharge " + phone + " successful" );
    	   }
       void recharge(String phone,String iphone) {
    	   System.out.println("Recharge " + phone + iphone );
       }
       public static void main(String[] args) {
		MobileRecharge mr = new MobileRecharge();
		mr.recharge("9053018907");
		mr.recharge("₹299", " successful");
		mr.recharge("₹299", " with coupon NEW50 applied");
	}
}
