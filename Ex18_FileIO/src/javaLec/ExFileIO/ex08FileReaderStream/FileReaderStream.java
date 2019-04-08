package javaLec.ExFileIO.ex08FileReaderStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {
	public static void main(String[] args) throws IOException {
		char[] cbuf = new char[10];
		int readCnt = 0;
		Reader in = new FileReader("hyper.txt");
		readCnt = in.read(cbuf, 0, cbuf.length);
		for(int i=0;i<readCnt;i++)
			System.out.println(cbuf[i]);
		in.close();
	}
}


