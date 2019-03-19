import java.util.Arrays;
import java.util.Random;

/* �Ĵ� Ŭ���� ����
 * 1) ������� �������� �����Ѵ�.
 * 2) ������� ���� ������ �ȴ�.
 * 3) �������� ���� �޼��尡 �ȴ�.
 * */
public class _02_Restaurant {
	// �ʵ� (����) : ���
	int money = 100000;
	String[] foods = { "������", "����", "���", "�̸�" };
	int sel; // �ʵ� ������ �ڵ����� �ʱ�ȭ�� (int�� -> 0)

	// �޼��� (���) : ����
	void cleaning() {
		System.out.println("�Ĵ��� û���Ѵ�.");
	}
	
	void prepareFoods() {
		System.out.println("���� ��Ḧ �����ϴ�");
	}

	void welcome() {
		System.out.println("�������");
	}

	void byebye() {
		System.out.println("�ȳ���������");
	}

	void getmoney(int m) {
		money += m;
		System.out.println(m + "�� ���� ������ ����");
	}

	void calcmoney() {
		System.out.println("���� ���� " + money + "�̴�.");
	}

	void anyFood() {
		System.out.println("� ���� ��Ƿ���?");
		System.out.println(Arrays.toString(foods));
		Random rd = new Random();
		sel = rd.nextInt(foods.length);
		System.out.println(foods[sel]);
	}
	void cookFood() {
		System.out.println(foods[sel] + "��/�� �丮�ϴ�.");
	}
	void sendFood() {
		System.out.println(foods[sel] + "���Խ��ϴ�.");
	}

	public static void main(String[] args) {
		// ���赵 	  ������		��ü(��ü)
		_02_Restaurant rest = new _02_Restaurant();
		rest.cleaning();
		rest.prepareFoods();
		for(int i = 0; i<5;i++) {
			System.out.println("==================");
			rest.welcome();
			if(i ==3) {
				rest.foods = new String[] {"��", "����"};
			}
			rest.anyFood();
			rest.cookFood();
			rest.money = -999999999;
			rest.sendFood();
			rest.getmoney(5000);
			rest.byebye();
		}
		System.out.println("==================");
		rest.calcmoney();
		rest.cleaning();
	}
}
