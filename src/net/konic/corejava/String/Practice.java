package net.konic.corejava.String;

public class Practice {
	public static void main(String[] args) {
		String s= "huzaifa";
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s+s.hashCode());
		
		StringBuilder sb = new StringBuilder("Huzaifa");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		System.out.println(sb+sb.hashCode());
	}
	
}
