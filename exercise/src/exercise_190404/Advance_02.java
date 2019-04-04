package exercise_190404;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//2. 2개의 문장이 저장된 파일을 읽고
//1개의 새로운 파일로 저장하세요

public class Advance_02 {
	public static void main(String[] args) throws IOException {
		
		InputStream in1 = new FileInputStream("File1.txt");
		InputStream in2 = new FileInputStream("File2.txt");
		OutputStream out = new FileOutputStream("File3.txt");
		int bData;
		while (true) {
			bData = in1.read(); // 1byte씩 읽는다.
			if (bData == -1) // 더 이상 읽을 것이 없다
				break;
			out.write(bData);
		}
		
		System.out.println();
		
		while (true) {
			bData = in2.read(); // 1byte씩 읽는다.
			if (bData == -1) // 더 이상 읽을 것이 없다
				break;
			out.write(bData);
			System.out.println(bData);
		}
		
		in1.close();
		in2.close();

	}

}


