package javaLec.ExFileIO.ex11PrintWriterStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		Writer wt = new FileWriter("printf.txt");
		PrintWriter out = new PrintWriter(wt);
		out.println("PrintWriter�����Դϴ�");
		out.printf("�� ���̴� %d�� �Դϴ�\r\n", 24);
		out.printf("�������� %f�Դϴ�", 3.14);
		out.println();
		out.println("�ڹٰ� ���ƿ�");
		out.println("�� ���ƿ�");
		out.close();
	}
}








