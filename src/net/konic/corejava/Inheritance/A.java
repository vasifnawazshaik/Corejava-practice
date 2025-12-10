package net.konic.corejava.Inheritance;

     public class A {
    	/* Create Multilevel inheritance A → B → C.
    	 Each class has one method: a(), b(), c().

    	 INPUT:

    	 Create object of C and call all methods

    	 EXPECTED OUTPUT:

    	 A method
    	 B method
    	 C method


    	 ---
*/
     
   
	 public void a() {
		System.out.println("A method");
	}
	 
}
     class B extends A {
        void b() {
        	System.out.println("B method");
        }
        	
        }
     class C extends B {
    	 void c() {
    		 System.out.println("C method");
    	 }
     
       public class ABCmethod {
    	   public static void main(String[] args) {
			C obj = new C();
			obj.a();
			obj.b();
			obj.c();
		}
       }
     }