package javaLec.ExFileIO.ex14TransientMembers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class PersonalInfo implements Serializable{
	String name;
	int age;
	transient String secretInfo;		// �������� �ʰڴ�
	transient int secretNum;			// �������� �ʰڴ�
	public PersonalInfo(String name, String sInfo, int age, int sNum) {
		this.name = name;
		this.secretInfo = sInfo;
		this.age = age;
		this.secretNum = sNum;
	}
	public void showCircleInfo() {
		System.out.println("name : " + name);;
		System.out.println("secret info : " + secretInfo);
		System.out.println("age : " + age);
		System.out.println("secret num : " + secretNum);
		System.out.println("");
	}
}
public class TransientMembers {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		OutputStream os = new FileOutputStream("Personal.ser");
		ObjectOutputStream out = new ObjectOutputStream(os);
		PersonalInfo info = 
				new PersonalInfo("ȫ�浿", "����", 24, 45);
		info.showCircleInfo();
		out.writeObject(info);
		out.close();
		
		InputStream is = new FileInputStream("Personal.ser");
		ObjectInputStream in = new ObjectInputStream(is);
		PersonalInfo recovInfo = (PersonalInfo)in.readObject();
		in.close();
		recovInfo.showCircleInfo();
	}
}











