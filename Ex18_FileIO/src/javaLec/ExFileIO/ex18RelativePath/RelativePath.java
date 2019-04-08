package javaLec.ExFileIO.ex18RelativePath;

import java.io.File;

/* 절대경로 : D:\\destination\\putty.exe
 * 			C:\\Program Files\\AhnLab\\V3Lite40
 * 상대경로 : 현재 기준 폴더(eclipse에서는 현재 프로젝트 폴더)
 * 			// 현재 기준 폴더 아래에 source 폴더
 *          File subDir = new File("source");
 *          // 현재 기준 폴더 아래에 source 폴더 아래 src 폴더
 *          File subDir = new File("source\\src");
 *          // 현재 기준 폴더 상위 폴더에 있는 putty.exe파일
 *          File upDir = new File("..\\putty.exe");
 *          // 현재 기준 폴더 상위 폴더에 있는 temp폴더 내의 putty파일
 *          File upDir = new File("..\\temp\\putty.exe");
 *          // 현재 기준 경로
 *          File thisDir = new File(".\\ccc");
 * */
public class RelativePath {
	public static void main(String[] args) {
		File curDir = new File("");	// 현재 폴더
		System.out.println(curDir.getAbsolutePath());// 절대경로
		File subDir = new File("src"+File.separator+"aaa");
		subDir.mkdir();
		System.out.println(subDir.getAbsolutePath());// 절대경로
		File upperDir = new File(".."+File.separator+"bbb");
		upperDir.mkdir();
		String path = upperDir.getAbsolutePath();
		System.out.println(path);// 절대경로
		File uDir = new File(path+File.separator+"ccc");
		uDir.mkdir();
		System.out.println(uDir.getAbsolutePath());// 절대경로
	}
}











