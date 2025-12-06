package net.konic.corejava.STATICvsNonSTATIC;

public class CounterDemo {
	static int count = 0;
	 CounterDemo(){
		 count++;
	 }
	  public static void main(String[] args) {
		CounterDemo CD1 = new CounterDemo();
		CounterDemo CD2 = new CounterDemo();
	    CounterDemo CD3 = new CounterDemo();
	    
	    System.out.println("Final count =:"+ CounterDemo.count);
	}

}