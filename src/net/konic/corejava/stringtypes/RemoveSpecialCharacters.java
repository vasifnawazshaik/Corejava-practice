package net.konic.corejava.stringtypes;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String input= new String("konic@2025!");
		String result="";
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')||(ch>='0'&&ch<='9')) {
				result=result+ch;
				
			}
		}
		System.out.println("Output: "+result);
		
	}

}
