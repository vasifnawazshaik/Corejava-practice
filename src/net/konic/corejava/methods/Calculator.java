package net.konic.corejava.methods;

public class Calculator {
   
     public int add (int v, int s) {
		int W = v + s;
		System.out.println(W);
		return W;
		
     }
       public int sub(int a, int b) {
    	   int C = a + b;
    	   System.out.println(C);
    	   return C;
    	   
       }
        public double mult(int b, int c) {
        	int E = b - c;
        	System.out.println(E);
        	return E;
        	
        }
          public double  divi(int x, int y) {
        	  int Z = x + y;
        	  System.out.println(Z);
        	  return Z;
        	  
          }
          public static void main(String[] args) {
			Calculator calculator = new Calculator();
			calculator.add(8, 25);
			calculator.sub(13, 1);
			calculator.mult(3, 6);
			calculator.divi(2, 5);
			
			
		}
     }
