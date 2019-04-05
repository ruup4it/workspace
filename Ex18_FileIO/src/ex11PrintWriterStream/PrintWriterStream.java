package javaLec.ExFileIO.ex11PrintWriterStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		Writer wt = new FileWriter("printf.txt");
		PrintWriter out = new PrintWriter(wt);
		out.println("PrintWriter사용법입니다");
		out.printf("제 나이는 %d살 입니다\r\n", 24);
		out.printf("원주율은 %f입니다", 3.14);
		out.println();
		out.println("자바가 좋아요");
		out.println("다 좋아요");
		out.close();
	}
}








