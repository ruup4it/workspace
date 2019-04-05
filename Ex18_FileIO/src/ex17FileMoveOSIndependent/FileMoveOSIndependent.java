package javaLec.ExFileIO.ex17FileMoveOSIndependent;

import java.io.File;

// 역슬래시는 Windows의 경로구분자(\\)
// File.separator는 OS에 독립적이다(어느 OS나 사용가능)
// 그러나 c:, d: 드라이브 Windows종속적인 표현이므로
// 절대경로보다 상대경로로 바꾸어 줄 필요가 있다.
// 절대경로 : D:\\source\\putty.exe
// 상대경로 : 현재 폴더를 기준으로 표현
public class FileMoveOSIndependent {
	public static void main(String[] args) {
		File myFile = 
				new File("D:"+File.separator+"destination"+
							File.separator+"푸티.exe");
		if(myFile.exists() == false) {
			System.out.println("원본 파일이 없습니다");
			return;
		}
		File reDir = new File("D:"+File.separator+"source");
		reDir.mkdir();				// 디렉터리 만들기
		File reFile = new File(reDir, "putty.exe");
		myFile.renameTo(reFile);	// 파일 이동하기
		if(reFile.exists() == true)
			System.out.println("파일 이동에 성공하였습니다");
		else
			System.out.println("파일 이동에 실패하였습니다");		
	}
}









