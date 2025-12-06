package net.konic.corejava.STATICvsNonSTATIC;

public class Employee {
	public static String companyname = "Smarttech pvt ltd" ;
	
	int EmpId;
	String Empname;
	Employee(int EmpId, String Empname){
		this.EmpId = EmpId;
		this.Empname = Empname;
	}
    void details() {
    	System.out.println("EmpId:"+ EmpId);
    	System.out.println("Empname:"+ Empname);
    	
    }
      static void name() {
    	 System.out.println("Companyname:"+ companyname);
    	  
      }
      public static void main(String[] args) {
		 Employee em = new Employee(403,"wasif");
		Employee.name();
		em.details();
    
		 
      }
}
