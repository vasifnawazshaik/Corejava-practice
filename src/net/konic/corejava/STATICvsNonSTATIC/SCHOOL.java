package net.konic.corejava.STATICvsNonSTATIC;

public class SCHOOL {
	static String schoolname = "film school";
	 int roll;
	 String name;
	 public static void sclname() {
		 System.out.println("schoolname:"+ schoolname);
		 
	 }
	 void details(int roll, String name) {
		 roll = roll;
		 name = name;
		 System.out.println("Studentname:"+ name);
		 System.out.println("Studentroll:"+ roll);
	 }
	 public static void main(String[] args) {
		SCHOOL.sclname();
		SCHOOL sc = new SCHOOL();
		sc.details(1215, "wasif");
	}
	 }


