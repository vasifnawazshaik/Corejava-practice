package net.konic.corejava.IsAHasA;

import java.util.Scanner;

 class Person {
	/* IS-A RELATIONSHIP (Inheritance)


	 ---

	 Q1) Employee IS-A Person

	 Requirements:

	 Person → name, age

	 Employee → salary

	 Take input using Scanner

	 Print full details


	 Input:

	 Name: Shiraz
	 Age: 28
	 Salary: 50000

	 Output:

	 Person: Shiraz (28)
	 Employee Salary: 50000


	 ---
  */
	String name;
	int age;
	 Person(String name,int age){
		 this.name = name;
		 this.age = age;
	 }
}
class Employee extends Person{
	   double salary;
	   Employee(String name,int age,double salary) {
       super(name, age);
       this.salary = salary;
	   
	   }
}
public class PersonTest{
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	/* System.out.println("shiraz");
    	 System.out.println(20);
    	 System.out.println(50000);
    	 */
    	 String name = sc.nextLine();
    	 int age = sc.nextInt();
    	 double salary = sc.nextDouble();
    	 Employee em = new Employee(name,age,salary);
    	 System.out.println("Person: " + em.name + "(" + em.age + ")");
    	 System.out.println("Employee: " + em.salary);
    	 sc.close();
    	 }
     
     
 }