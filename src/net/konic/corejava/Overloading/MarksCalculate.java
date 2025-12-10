package net.konic.corejava.Overloading;

import java.security.DomainCombiner;

public class MarksCalculate {
	/*Overload calculateMarks() for 1 subject, 2 subjects, 3 subjects.

	INPUT:
	calculateMarks(80)
	calculateMarks(80, 90)
	calculateMarks(80, 90, 85)

	OUTPUT:
	Total Marks: 80
	Total Marks: 170
	Total Marks: 255
  */
	  void calculatemarks(int subj) {
		  System.out.println("Total Marks:" + subj);
	  }
	  void calculatemarks(int subj1,int subj2) {
		  System.out.println("TotalMarks:" + (subj1+subj2));
		  
	  }
	  void calculatemarks(int subj1,int subj2,int subj3) {
		  System.out.println("TotalMarks:" + (subj1+subj2+subj3));
	  }
	  public static void main(String[] args) {
		MarksCalculate mc = new MarksCalculate();
		mc.calculatemarks(80);
		mc.calculatemarks(80, 90);
		mc.calculatemarks(80, 90, 85);
	}
}