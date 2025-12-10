package net.konic.corejava.Inheritance;

public class Person {
	/*Create a program using Person (parent) and Student (child).
	Person → name, age
	Student → rollNo

	INPUT (assume values):

	name = Rahul
	age = 20
	rollNo = 101

	EXPECTED OUTPUT:

	Name: Rahul
	Age: 20
	Roll No: 101
   */
    
      
     void details(String name) {
    	 System.out.println("name:" + name);
     }
     void details(int age) {
    	 System.out.println("age:" + age);
     }
     
     
          
}
