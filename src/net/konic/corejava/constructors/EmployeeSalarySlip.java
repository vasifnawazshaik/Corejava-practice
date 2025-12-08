package net.konic.corejava.constructors;

public class EmployeeSalarySlip {
	String Name;
	double Salary;
	public EmployeeSalarySlip(String name, double salary) {
	    Name = name;
		Salary = salary;
		
	}
	 public static double yearlySalary() {
		 return 30000*12;
		 
	 }
	 public static void main(String[] args) {
		EmployeeSalarySlip ess = new EmployeeSalarySlip("nawaz", 30000);
		System.out.println(yearlySalary());
		System.out.println(ess.Salary);
		System.out.println(ess.Name);
	}
	

}
