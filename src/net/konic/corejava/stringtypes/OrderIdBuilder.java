package net.konic.corejava.stringtypes;

public class OrderIdBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ORD");
		StringBuilder sb1 = new StringBuilder("1001");
		sb.append(sb1);
		System.out.println(sb);
		
	}

}
