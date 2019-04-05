package javaLec.ExFileIO.ex17FileMoveOSIndependent;

import java.io.File;

// �������ô� Windows�� ��α�����(\\)
// File.separator�� OS�� �������̴�(��� OS�� ��밡��)
// �׷��� c:, d: ����̺� Windows�������� ǥ���̹Ƿ�
// �����κ��� ����η� �ٲپ� �� �ʿ䰡 �ִ�.
// ������ : D:\\source\\putty.exe
// ����� : ���� ������ �������� ǥ��
public class FileMoveOSIndependent {
	public static void main(String[] args) {
		File myFile = 
				new File("D:"+File.separator+"destination"+
							File.separator+"ǪƼ.exe");
		if(myFile.exists() == false) {
			System.out.println("���� ������ �����ϴ�");
			return;
		}
		File reDir = new File("D:"+File.separator+"source");
		reDir.mkdir();				// ���͸� �����
		File reFile = new File(reDir, "putty.exe");
		myFile.renameTo(reFile);	// ���� �̵��ϱ�
		if(reFile.exists() == true)
			System.out.println("���� �̵��� �����Ͽ����ϴ�");
		else
			System.out.println("���� �̵��� �����Ͽ����ϴ�");		
	}
}









