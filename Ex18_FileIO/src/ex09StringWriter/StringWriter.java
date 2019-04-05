package javaLec.ExFileIO.ex09StringWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		Writer wt = new FileWriter("류현진.txt");
		BufferedWriter out = new BufferedWriter(wt);
		out.write("류현진 - 일단 2승 했다");
		out.newLine();
		out.write("올 시즌은 최고의 투수가 되는 시즌이 될 것이다");
		out.newLine();
		out.write("팀이 승리하는 것을 돕기 위해 최선을 다하겠다");
		out.newLine();
		out.write("월드시리즈로 가자!");
		out.newLine();// \r\n
		out.newLine();
		out.write("기사 제보 및 보도자료");
		out.newLine();
		out.write("bitcamp@goodnews.co.kr");
		out.close();
		System.out.println("기사 입력 완료");
	}
}







