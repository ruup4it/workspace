package javaLec._class.ex11Static;

class Circle {
	static final double PI = 3.1415;
	private double radius;

	Circle(double rad) {
		radius = rad;
	}

	void showPerimeter() {
		System.out.println(String.format("µ—∑π : %.2f",radius*2*PI));
	}
	
	void showArea() {
		System.out.println(String.format("≥–¿Ã : %.2f",radius*radius*PI));
	}
}

public class ClassVarUse {
	public static void main(String[] args) {
		Circle circle = new Circle(1.2);
		circle.showPerimeter();
		circle.showArea();
	}
}
