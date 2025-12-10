package net.konic.corejava.Overloading;

public class FoodDelivery {
	/*Overload order() for qty and spicy option.

	INPUT:
	order("Biryani")
	order("Biryani", 2)
	order("Biryani", 2, tru-pp;/[[e)

	OUTPUT:
	Order placed: Biryani (1 qty)
	Order placed: Biryani (2 qty)
	Order placed: Biryani (2 qty, Spicy)
*/
      void order ( String food ) {
    	 ;
		 System.out.println("Order placed:" + food); 
      }
      void order(String food, String qty) {
    	  System.out.println("Order placed:" + food + (qty));
      }
      void order(String food,String qty,String tru) {
    	  System.out.println("Order placed:" + food + ( qty + tru));
      }
      public static void main(String[] args) {
		FoodDelivery fd = new FoodDelivery();
		    fd.order("Biryani");
		    fd.order("Biryani", "2 qty");
		    fd.order("Biryani", "2 qty", "spicy");
		}
	}

