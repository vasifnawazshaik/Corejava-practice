package net.konic.corejava.Variables;

public class EmployeeSalary {
	
	String name ;
	int salary;
	;
	void details(String employeeName, int monthSal) {
		name=employeeName;
		salary= monthSal;
	}
	
	double yearlySalary() {
		return salary*12;
	}
	

	public static void main(String[] args) {
		
		EmployeeSalary e = new EmployeeSalary();
		e.details("vasif", 20000);
		System.out.println(e.yearlySalary());
		
	}

}
