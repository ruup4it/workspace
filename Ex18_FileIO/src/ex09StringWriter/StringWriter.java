package javaLec.ExFileIO.ex09StringWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		Writer wt = new FileWriter("������.txt");
		BufferedWriter out = new BufferedWriter(wt);
		out.write("������ - �ϴ� 2�� �ߴ�");
		out.newLine();
		out.write("�� ������ �ְ��� ������ �Ǵ� ������ �� ���̴�");
		out.newLine();
		out.write("���� �¸��ϴ� ���� ���� ���� �ּ��� ���ϰڴ�");
		out.newLine();
		out.write("����ø���� ����!");
		out.newLine();// \r\n
		out.newLine();
		out.write("��� ���� �� �����ڷ�");
		out.newLine();
		out.write("bitcamp@goodnews.co.kr");
		out.close();
		System.out.println("��� �Է� �Ϸ�");
	}
}







