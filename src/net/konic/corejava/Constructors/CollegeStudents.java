package net.konic.corejava.Constructors;

public class CollegeStudents {
   String collegename = "IIT Delhi";
   String Studentname;
   int roll;
   public CollegeStudents(String Studentname, int roll) {
	   this.Studentname = Studentname;
	   this.roll = roll;
	   
   }
    public void Changecollege(String collegename) {
    	    collegename = "IIT hyderabad" ;
    	    
    }
    public static void main(String[] args) {
		CollegeStudents cs = new CollegeStudents("wasif", 1215);
		System.out.println("collegename:"+ cs.collegename);
		System.out.println("Studentname:"+ cs.Studentname);
		System.out.println("roll:"+ cs.roll);
		
	}
}

