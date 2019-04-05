package javaLec.ExFileIO.ex06DataBufferedFilterPerfomance;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataBufferedFilterPerformance {
	public static void performanceTest(DataOutputStream dataOut) throws IOException {
		long stime = System.currentTimeMillis();
		for(int i=0;i<10000;i++)
			for(int j=0;j<10000;j++)
				dataOut.writeDouble(99.99);
		long etime = System.currentTimeMillis();
		System.out.println("경과시간: " + (etime-stime));
	}
	public static void main(String[] args) throws IOException {
		OutputStream out1 = new FileOutputStream("data3.bin");
		DataOutputStream dataOut1 = new DataOutputStream(out1);
		performanceTest(dataOut1);
		dataOut1.close();
		
		OutputStream out2 = new FileOutputStream("data4.bin");
		BufferedOutputStream bufFilterOut =
					new BufferedOutputStream(out2);// 2MB
					//new BufferedOutputStream(out2, 1024*10);//10KB
		DataOutputStream dataBufOut = 
					new DataOutputStream(bufFilterOut);
		performanceTest(dataBufOut);
		dataBufOut.close();
	}
}









