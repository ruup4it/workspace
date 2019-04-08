package javaLec.ExFileIO.ex16FileMove;

import java.io.File;

/* D:\\source\\putty.exe => D:\\destination\\푸티.exe 
 * 디렉터리 만들고 파일 이동
 * */
public class FileMove {
	public static void main(String[] args) {
		File myFile = new File("D:\\source\\putty.exe");
		if(myFile.exists() == false) {
			System.out.println("원본 파일이 없습니다");
			return;
		}
		File reDir = new File("D:\\destination");
		reDir.mkdir();				// 디렉터리 만들기
		File reFile = new File(reDir, "푸티.exe");
		myFile.renameTo(reFile);	// 파일 이동하기
		if(reFile.exists() == true)
			System.out.println("파일 이동에 성공하였습니다");
		else
			System.out.println("파일 이동에 실패하였습니다");
	}
}






