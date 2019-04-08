package javaLec.ExFileIO.ex13SerializableInstMember;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Point implements Serializable{
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Circle implements Serializable{
	Point p;
	double rad;
	public Circle(int x, int y, double r) {
		p = new Point(x, y);
		this.rad = r;
	}
	public void showCircleInfo() {
		System.out.printf("[%d, %d] \n", p.x, p.y);
		System.out.println("rad: " + rad);
	}
}
public class SerializableInstMember {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		OutputStream os = new FileOutputStream("Object2.ser");
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		// 저장 순서대로 읽어오기
		InputStream is = new FileInputStream("Object2.ser");
		ObjectInputStream in = new ObjectInputStream(is);
		Circle c1 = (Circle)in.readObject();
		Circle c2 = (Circle)in.readObject();
		String message = (String)in.readObject();
		in.close();
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(message);
	}
}



