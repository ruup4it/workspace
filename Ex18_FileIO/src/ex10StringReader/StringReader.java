package javaLec.ExFileIO.ex10StringReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReader {
	public static void main(String[] args) throws IOException {
		Reader rd = new FileReader("류현진.txt");
		BufferedReader in = new BufferedReader(rd); 
		String str;
		while(true) {
			// 엔터값까지 읽어서 반환하는 데 엔터값은 없애버린다.
			// 엔터값은 1줄 읽는 구분 역할로만 사용
			str = in.readLine();
			if(str==null)
				break;
			System.out.println(str);
		}
		in.close();
	}
}







