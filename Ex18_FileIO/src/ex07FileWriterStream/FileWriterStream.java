package javaLec.ExFileIO.ex07FileWriterStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* 2���� ������ ��Ʈ���� �ִ�.
 * 1) byte ��Ʈ�� : �ִ� �״�� �а�, �ִ� �״�� ����
 * 2) ����  ��Ʈ�� : �ü������ �����ڵ���� �ٸ���
 *                 �˾Ƽ� �ü���� �˸°� ���ڸ� ó�����ش�.
 * */
public class FileWriterStream {
	public static void main(String[] args) throws IOException {
		char ch1 = 'A';
		char ch2 = 'B';
		Writer out = new FileWriter("hyper.txt");
		out.write(ch1);
		out.write(ch2);
		out.close();
	}
}








