package net.konic.corejava.Variables;

public class EvenOddCheck {
     int n ;
     void readNumber(int m ) {
    	  m =n;
     }
     
     boolean isEven() {
    	 if(n%2==0) {
    		return true;
    	 }else {
    		return false;
    	 }
    	
     }
     
     public static void main(String[] args) {
		EvenOddCheck even = new EvenOddCheck();
		even.readNumber(20);
		if(even.isEven()) {
			System.out.println("Given number is Even");
		}else {
			System.out.println("Given number is odd");
		}
		
		
			
		}
		
			
		
	
     
}
