package javaLec._class.ex11Static;

class AccessWay {
	static int num = 0;

	AccessWay() {
		incrCnt();
	}

	/*
	 * static ������ static �޼��峪 instance�޼��� ������� Ŭ���� ���ο��� �����Ӱ� ���� �����ϴ�.
	 */
	public void incrCnt() {
		num++;
	}
}
/* static ����� ����
 * 1) Ŭ���� ���ο��� �����Ӱ� ����
 * 2) Ŭ���� �̸����� ����
 * 3) ��ü �̸����� ����
 * ��ȣ�ϴ� ��� : Ŭ���� �̸� > ��ü �̸� 
 * static�� ��ü ���� �����Ǵ� ������ �ƴϰ�
 * Ŭ������ �����ϰ� ������ �� �ִ� �����̹Ƿ�
 * Ŭ���� �Ҽ����� ȣ���ϴ� ���� �� ��Ȯ
 * */
public class ClassVarAccess {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		AccessWay way = new AccessWay();
		AccessWay.num++; 	// Ŭ���������� ����
		way.num++; 			// ��ü�� ����
		System.out.println(String.format("num = %d",AccessWay.num));

	}
}
