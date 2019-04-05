package javaLec.ExFileIO.ex05DataBufferFilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBufferFilterStream {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data2.bin");
		BufferedOutputStream bufFilterOut = 
							new BufferedOutputStream(out);
		DataOutputStream dataFilterOut = 
							new DataOutputStream(bufFilterOut);
		dataFilterOut.writeInt(999);
		dataFilterOut.writeDouble(87.123);
		dataFilterOut.close();
		
		//저장한 파일 읽기
		InputStream in = new FileInputStream("data2.bin");
		BufferedInputStream bufFilterIn = 
							new BufferedInputStream(in);
		DataInputStream dataFilterIn = 
							new DataInputStream(bufFilterIn);
		int num = dataFilterIn.readInt();
		double dNum = dataFilterIn.readDouble();
		dataFilterIn.close();
		System.out.println(num);
		System.out.println(dNum);
	}
}








