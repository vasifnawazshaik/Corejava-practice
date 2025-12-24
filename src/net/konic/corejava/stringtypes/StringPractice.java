package net.konic.corejava.stringtypes;

public class StringPractice {
	public static void main(String[] args) {
		
		String s = "huzaifa";
		System.out.println(s+s.hashCode());
		
		StringBuffer sb = new StringBuffer("huzaifa");
		//System.out.println(sb+sb.hashCode());
		System.out.println(sb+""+sb.hashCode());
	}

}
