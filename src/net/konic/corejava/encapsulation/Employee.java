package net.konic.corejava.encapsulation;

public class Employee {
	/*Create an Employee class with private salary.
Salary must be greater than 0.

Input:

Enter Salary: 45000

Output:

Employee Salary: 45000 */
   private int salary;

   public int getSalary() {
	return salary;
   }

   public void setSalary(int salary) {
	   if(salary > 0) {
	this.salary = salary;
   }
	   else {
		   System.out.println("unemployed");
	   }
   }
   public static void main(String[] args) {
	Employee obj = new Employee();
	obj.setSalary(45000);
	int Salary = obj.getSalary();
	System.out.println("Employee salary:"+ Salary);
}


}
