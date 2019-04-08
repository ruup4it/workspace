package javaLec.ExFileIO.ex03DataFilterStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 프로그램에서 사용하는 여러 가지 유형의 데이터를 파일에 전송하는 방법
 * 1) byte[]로 변환하는 방법
 * 2) Filter클래스를 사용해서 Stream클래스와 연결한다.
 * */
public class DataFilterStream {
	public static void main(String[] args) throws IOException {
		// 스트림생성 클래스
		OutputStream out = new FileOutputStream("data.bin");
		// 필터 클래스
		DataOutputStream filterOut = new DataOutputStream(out);
		filterOut.writeInt(365);
		filterOut.writeDouble(3.14);
		filterOut.close();
		
		// 저장한 데이터를 읽어보자
		InputStream in = new FileInputStream("data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		int num = filterIn.readInt();
		double dNum = filterIn.readDouble();
		filterIn.close();
		
		System.out.println(num);
		System.out.println(dNum);
	}
}









