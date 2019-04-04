package javaLec.ExFileIO.ex02BufferFileCopy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("doberman.jpg");
		OutputStream out = new FileOutputStream("도베르만.jpg");

		int copyByte = 0;
		int readLen;
		byte[] buf = new byte[1024];
		while (true) {
			readLen = in.read(buf);
			if (readLen == -1)
				break;
			out.write(buf, 0, readLen);
			copyByte += readLen;
		}

		in.close();
		out.close();

		System.out.println("복사된 바이트 크기 : " + copyByte);

	}
}
