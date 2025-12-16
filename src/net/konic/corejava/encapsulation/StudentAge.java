package net.konic.corejava.encapsulation;

public class StudentAge {  /*Create a StudentProfile class with private age.
Age must be between 5 and 100.

Input:

Enter Age: 3

Output:

Invalid age */
      private int Age;

	  public int getAge() {
		  return Age;
	  }

	  public void setAge(int age) {
		  if(age>=5 && age <=100) {
		  this.Age = age;
	  }
	      else { 
		System.out.println("invalid age");  
		  
	  }

	  }
	  public static void main(String[] args) {
		StudentAge sa = new StudentAge();
		sa.setAge(3);
		int age =sa.getAge();
		System.out.println("Age" + age );
	}
}
