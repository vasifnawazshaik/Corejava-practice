package net.konic.corejava.encapsulation;

public class Student { /*Create a Student class with private marks.
Allow marks only between 0 and 100.

Input:

Enter Marks: 120

Outpu

Invalid marks  */
      private int Marks;

	  public int getMarks() {
		  return Marks;
	  }

	  public void setMarks(int marks) {
		  if(marks >0 && marks <100) {
			  this. Marks = marks;
	  }
		  else {
			  System.out.println("Invalid marks");
		  }
    	  
      }
	  public static void main(String[] args) {
		Student obj = new Student();
		obj.setMarks(126);
	int Marks =	obj.getMarks();
		System.out.println("Marks" + Marks);
	}
}


