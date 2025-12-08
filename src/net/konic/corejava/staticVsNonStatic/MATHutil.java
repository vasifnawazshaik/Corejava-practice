package net.konic.corejava.staticVsNonStatic;

public class MATHutil {
     public static int add(int a,int b) {
    	 return a+b;
     }
     int multy(int a,int b) {
    	 return a*b;
    	 
     }
  public static void main(String[] args) {
	  int w = MATHutil.add(7, 6);
	  System.out.println("w:"+ w);
	  MATHutil mu = new MATHutil();
	int N =  mu.multy(7, 6);
	System.out.println("N:"+ N);
  }
}
