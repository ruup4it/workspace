package javaLec.ExFileIO.ex10StringReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReader {
	public static void main(String[] args) throws IOException {
		Reader rd = new FileReader("������.txt");
		BufferedReader in = new BufferedReader(rd); 
		String str;
		while(true) {
			// ���Ͱ����� �о ��ȯ�ϴ� �� ���Ͱ��� ���ֹ�����.
			// ���Ͱ��� 1�� �д� ���� ���ҷθ� ���
			str = in.readLine();
			if(str==null)
				break;
			System.out.println(str);
		}
		in.close();
	}
}







