package exercise_190404;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//2. 2개의 문장이 저장된 파일을 읽고
//1개의 새로운 파일로 저장하세요
public class Advance_02 {
	InputStream in1 = new FileInputStream("/src/exercise_190404/file1.txt");
	InputStream in2 = new FileInputStream("/src/exercise_190404/file2.txt");
	OutputStream out = new FileOutputStream("/src/exercise_190404/file3.txt");

	int copyByte = 0;
	int readLen;
	byte[] buf = new byte[1024];
	while (true) {
		readLen = in1.read(buf);
		if (readLen == -1)
			break;
		out.write(buf, 0, readLen);
		copyByte += readLen;
	}

	in.close();
	out.close();

	System.out.println("복사된 바이트 크기 : " + copyByte);

}
