package javaLec._class.ex12This;

/* this �� ��ü �ڽ��� ����Ű�� �ܾ�� 
 * self�� �ǹ��Ѵ�.
 * */

/*  ������ �� ù ��° �Ű� ������ this�� �߰� ��
 *  �� this�� ��ü�� �������ִ� ������ �Ѵ�.
 *  Number(int num) -> Number(Number this, int num)
 *  void showNum() -> void showNum(Number this)
 *  num1.showNum(); -> showNum(num1);
 *  num2.showNum(); -> showNum(num2);
 * */
class Number {
	private int num;

	// ���� ������ �ʵ庸�� �켱 ������ �����Ƿ� �ʵ忡 ������ �� ��
//	Number(int num) {
//		num = num;
//	}
	// ���� ������ ������ �̸��� ��� this�� �ٿ��� �ʵ�� �νĵ�
	Number(int num) {
		this.num = num;
		System.out.println("Constructor :\t" + this);
	}

	// ���������� �����Ƿ� this ���� ������
	void showNum() {
		System.out.println(num);
	}
}

public class NumberMain {
	public static void main(String[] args) {
		Number number1 = new Number(3);
		System.out.println("main :\t\t" + number1);
		Number number2 = new Number(1);
		System.out.println("main :\t\t" + number2);
		number1.showNum();
		number2.showNum();
	}

}
