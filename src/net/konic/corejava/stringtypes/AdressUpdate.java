package net.konic.corejava.stringtypes;

public class AdressUpdate {
	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Street5");
		StringBuffer obj1 = new StringBuffer(" Hyderabad");
		  obj.append(obj1);
		  System.out.println("update adress: " + obj);
	}

}
