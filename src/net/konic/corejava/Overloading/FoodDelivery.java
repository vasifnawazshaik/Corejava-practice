package net.konic.corejava.Overloading;

public class FoodDelivery {
	/*Overload order() for qty and spicy option.

	INPUT:
	order("Biryani")
	order("Biryani", 2)
	order("Biryani", 2, true)

	OUTPUT:
	Order placed: Biryani (1 qty)
	Order placed: Biryani (2 qty)
	Order placed: Biryani (2 qty, Spicy)
*/
      void order(String a, String b) {
    	 System.out.println("Order placed:" + a + ( b)); 
      }
      void orderx(String a, String b) {
    	  System.out.println("Order placed:" + a + (b));
      }
      void ordery(String a,String b,String c) {
    	  System.out.println("Order placed:" + a + ( b + c));
      }
      public static void main(String[] args) {
		FoodDelivery fd = new FoodDelivery();
		    fd.order("Biryani", ("1 qty"));
		    fd.orderx("Biryani", ("2 qty"));
		    fd.ordery("Biryani", ("2 qty "), "spicy");
		}
	}

