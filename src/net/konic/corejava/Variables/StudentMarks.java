package net.konic.corejava.Variables;

public class StudentMarks {
	int marks;
	void setmarks(int m) {

		 marks =m;
		
	}
    String result() {
    	    if(marks>=35) {
    	    	    return "pass";
    	    }else {
    	        	return "fail";
    	    }
    	  
    }
    public static void main(String[] args) {
    	  StudentMarks sm = new StudentMarks();
    	  sm.setmarks(46);
    	  String result = sm.result();
    	  System.out.println(result);
    }
    
}
