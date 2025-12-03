package net.konic.corejava.Variables;

public class RectangleArea {
	
	int length;
	int width;
	
	void setDimentions(int l , int w) {
		length = l;
		width=w;
	}
	
	int area() {
		return length* width;
	}
    public static void main(String[] args) {
		
    	RectangleArea r = new RectangleArea();
    	r.setDimentions(5, 10);
    	System.out.println("rectangle area is : "+ r.area());
	}
}
