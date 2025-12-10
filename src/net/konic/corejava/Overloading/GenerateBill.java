package net.konic.corejava.Overloading;

public class GenerateBill {
	
/*	Overload generateBill() with discount & tax.

	INPUT:
	generateBill(1000)
	generateBill(1000, 10 )
	generateBill(1000, 10, 5)

	OUTPUT:
	Final Bill: ₹1000
	Final Bill after discount: ₹900
	Final Bill: ₹945*/
	
	
		void billGenerate(int amount) {
			System.out.println("Final Bill: " + amount);
		}
		void billgenerate(int amount,int discount){
			int finalAmount = amount -(amount * discount /100);
			System.out.println("Final Bill after discount: " +  finalAmount );
		}
		void billgenerate (int amount,int discount,int tax ) {
			int discounte = amount - ( amount * discount / 100);
			int finalAmount = discount + (discount * tax / 100);
				System.out.println("Final Bill: " + finalAmount);
			}
		public static void main(String[] args) {
			GenerateBill obj = new GenerateBill();
			obj.billGenerate(1000);
			obj.billgenerate(1000, 10);
			obj.billgenerate(1000, 10, 5);
		}
		}
		



