package javaLec.ExFileIO.ex01ByteFileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("dog.jpg");
		OutputStream out = new FileOutputStream("강아지.jpg");
		int copyByte = 0;
		int bData;
		while (true) {
			bData = in.read(); // 1byte씩 읽는다.
			if (bData == -1) // 더 이상 읽을 것이 없다
				break;
			out.write(bData);
			copyByte++;
		}
		in.close();
		out.close();
		System.out.println("복사된 바이트 크기 : " + copyByte);
	}
}
