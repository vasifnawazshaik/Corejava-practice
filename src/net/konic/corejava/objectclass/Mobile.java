package net.konic.corejava.objectclass;

public class Mobile {

	public String brand(String a) {
		String brand = a;
		System.out.println(brand);
		return brand;
	}

	public String camqualality(String b) {
		String camqulality = b;

		System.out.println("camqualality");
		return camqulality;
	}

	public double price(double z) {
		double price = z;
		System.out.println(price);
		return price;
		
	}

	public class MobileTest {
		public static void main(String[] args) {

			Mobile mobile = new Mobile();

			mobile.brand("oppo");
			mobile.camqualality("good");
			mobile.price(10);

		}

	}
}
