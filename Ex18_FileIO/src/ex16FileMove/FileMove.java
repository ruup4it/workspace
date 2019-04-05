package javaLec.ExFileIO.ex16FileMove;

import java.io.File;

/* D:\\source\\putty.exe => D:\\destination\\ǪƼ.exe 
 * ���͸� ����� ���� �̵�
 * */
public class FileMove {
	public static void main(String[] args) {
		File myFile = new File("D:\\source\\putty.exe");
		if(myFile.exists() == false) {
			System.out.println("���� ������ �����ϴ�");
			return;
		}
		File reDir = new File("D:\\destination");
		reDir.mkdir();				// ���͸� �����
		File reFile = new File(reDir, "ǪƼ.exe");
		myFile.renameTo(reFile);	// ���� �̵��ϱ�
		if(reFile.exists() == true)
			System.out.println("���� �̵��� �����Ͽ����ϴ�");
		else
			System.out.println("���� �̵��� �����Ͽ����ϴ�");
	}
}






