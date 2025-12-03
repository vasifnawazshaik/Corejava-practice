package net.konic.object.string;

public class TestEmp {
	
	public static void main(String[] args) {
		
	Employee e = new Employee("H",101);
	Employee e1 = new Employee("H",101);
	
	System.out.println(e);
	System.out.println(e1);
	
		
	if(e1.equals(e)){
		System.out.println("same   equal meth");
	}else {
		System.out.println("not same Equal meth");
	}
	
	}

}
