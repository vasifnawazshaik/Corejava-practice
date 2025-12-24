package net.konic.corejava.stringtypes;

public class Protocol {
	public static void main(String[] args) {
		String protocol = "https";
		String domine="konic.net";
		String path="/login";
		String URL=protocol+"://"+domine+path;
		System.out.println("URL : "+URL);
	}

}
