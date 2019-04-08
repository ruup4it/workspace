package javaLec.ExFileIO.ex12ObjectSerialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* Serialize(직렬화)
 * Deserialize(역직렬화)
 * 객체를 파일로 저장한다는 의미
 * */
class Circle implements Serializable{
	int xPos;
	int yPos;
	double rad;
	public Circle(int x, int y, double r) {
		xPos = x;
		yPos = y;
		rad = r;
	}
	public void showCircleInfo() {
		System.out.printf("[%d, %d] \n", xPos, yPos);
		System.out.println("rad : " + rad);
	}
}
public class ObjectSerialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		OutputStream os = new FileOutputStream("Object.ser");
		ObjectOutputStream out = new ObjectOutputStream(os);
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		// 저장 순서대로 읽어오기
		InputStream is = new FileInputStream("Object.ser");
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














