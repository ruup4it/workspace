package javaLec._class.ex11Static;
/* static ������ ��ü ���� ������ �޸𸮿� �ö󰡰�
 * ��� ��ü���� ������ �� �ִ�.
 * */
/* �ν��Ͻ� ������ ��ü�� ������ �� �Բ� �����Ǹ�, ��ü ���� �����̴�. (��� ��ü���� ������ �� ����)
 * */

/* static�� Ŭ���� �Ҽ��̰� �̸���� ��ü���� �����Ӱ� ���� ���������� Ŭ������ �� 1���� ������ �� �ִ�.
 * �׷��Ƿ� ��ü���� �ٸ� ������ �ƴ϶� ����� ������ �޼��带 
 * static���� ����� ���������� ����� �� �ִ�.
 * 
 * */
/* static ��� : ��ü ���� ���� �޸𸮿� �ε�, Ŭ������ 1���� ����
 * instance ��� : ��ü ���� �� �޸𸮿� �ε�, ��ü ���� ��ŭ ����
 * */
class InstCnt {
	//static int instNum;
	int instNum;
	InstCnt(){
		instNum++;
		System.out.println(String.format("�ν��Ͻ� ���� : %d",instNum));
	}
}

public class ClassVar {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		InstCnt ic1 = new InstCnt();
		@SuppressWarnings("unused")
		InstCnt ic2 = new InstCnt();
		@SuppressWarnings("unused")
		InstCnt ic3 = new InstCnt();
	}
}
