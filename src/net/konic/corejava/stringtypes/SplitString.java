package net.konic.corejava.stringtypes;

public class SplitString {
	public static void main(String[] args) {
		String s = "welcome to konic technologies";
		
		System.out.println(s.length());
		
		String[] words =s.split(" ");
		
		System.out.println(words.length);
		
		
	}

}
