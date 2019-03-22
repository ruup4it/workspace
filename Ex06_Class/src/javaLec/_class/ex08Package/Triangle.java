package javaLec._class.ex08Package;

public class Triangle {
	double width;
	double height;

	public Triangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getTriangleArea() {
		return width * height / 2;
	}

}
