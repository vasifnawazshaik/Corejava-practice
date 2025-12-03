package net.konic.corejava.Variables;

public class Temperature {
    int celsius;
	void Temp(int n) {
		celsius = n;
	}
	double fahrenheit() {
		return (celsius *9/5)+32;
	}
	public static void main(String[] args) {
		
		Temperature t = new Temperature();
		t.Temp(32);
		System.out.println(t.fahrenheit());
	}
}
