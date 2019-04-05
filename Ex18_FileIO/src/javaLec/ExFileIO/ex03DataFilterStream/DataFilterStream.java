package javaLec.ExFileIO.ex03DataFilterStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* ���α׷����� ����ϴ� ���� ���� ������ �����͸� ���Ͽ� �����ϴ� ���
 * 1) byte[]�� ��ȯ�ϴ� ���
 * 2) FilterŬ������ ����ؼ� StreamŬ������ �����Ѵ�.
 * */
public class DataFilterStream {
	public static void main(String[] args) throws IOException {
		// ��Ʈ������ Ŭ����
		OutputStream out = new FileOutputStream("data.bin");
		// ���� Ŭ����
		DataOutputStream filterOut = new DataOutputStream(out);
		filterOut.writeInt(365);
		filterOut.writeDouble(3.14);
		filterOut.close();
		
		// ������ �����͸� �о��
		InputStream in = new FileInputStream("data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		int num = filterIn.readInt();
		double dNum = filterIn.readDouble();
		filterIn.close();
		
		System.out.println(num);
		System.out.println(dNum);
	}
}









