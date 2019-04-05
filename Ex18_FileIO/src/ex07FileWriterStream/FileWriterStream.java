package javaLec.ExFileIO.ex07FileWriterStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* 2가지 종류의 스트림이 있다.
 * 1) byte 스트림 : 있는 그대로 읽고, 있는 그대로 쓰기
 * 2) 문자  스트림 : 운영체제마다 문자코드셋이 다르다
 *                 알아서 운영체제에 알맞게 문자를 처리해준다.
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








