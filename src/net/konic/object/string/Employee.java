package net.konic.object.string;

import java.util.Objects;

public class Employee {
	
	private String ename;
	private int empno;
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public Employee(String ename, int empno) {
		super();
		this.ename = ename;
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", empno=" + empno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empno, ename);
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return empno == other.empno && Objects.equals(ename, other.ename);
	}


	
	
	

}
