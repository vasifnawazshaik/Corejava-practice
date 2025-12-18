package net.konic.corejava.String;

public class StringPractiece {
	
	public static void main(String[] args) {
		String name = "boy";
		String obj = new String("boy");
		//basic operations
  System.out.println(name.length());
  System.out.println("upper case: " +  name.toUpperCase());
  System.out.println("lower case: " + name.toLowerCase());
  System.out.println("charat: " + name.charAt(2));
  System.out.println("contain:" + name.contains("b"));
  // == vs .equals()
  String name1 = "men";
  String name2 = "men";
  String name3 = new String("men");
  //check reference memory
  System.out.println("name1 == name2:" + (name1==name2));
   System.out.println("name1== name3 " + (name1==name3));
   System.out.println("name1.equals(name3)" + (name1.equals(name3)));
   
// why string is immutable
	String msg = "hello";
	System.out.println(msg.hashCode());
      msg.concat("world");
      System.out.println("msg:" + msg);
      msg=msg.concat("world");

      System.out.println("msg:" + msg);
      System.out.println(msg.hashCode());
      // String constant pool
      String a = "Hotel";
      String b = "Hotel";
      System.out.println("a == b:" +(a == b));
      // String literal vs new String
      String x = "room";
      String y = "room";
      String z = new String("room");
      System.out.println("x == y:" +(x ==y));
      System.out.println("x == z:" +(x == z));
      System.out.println("x.equals(z):" + x.equals(z));
      //Real-time security example
      String password = "admin 123";
      password.concat( "456");
      System.out.println("password: " + password);
      System.out.println("program end");
	}
}
