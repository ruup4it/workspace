import java.util.Arrays;
import java.util.Random;

/* �Ĵ� Ŭ���� ����
 * 1) ������� �������� �����Ѵ�.
 * 2) ������� ���� ������ �ȴ�.
 * 3) �������� ���� �޼��尡 �ȴ�.
 * 4) ������ �Ժη� �����ϸ� ������ ������ �ſ� ����
 * 	   �׷��� �Ϲ������� ������ ������Ŵ(private)
 * 5) �޼���� �Ϲ������� �ܺ� ȣ���� ������ ��
 * 	   �׷��� �Ϲ������� ������ �㰡��(public, default)
 * */
class Restaurant {
	// �ʵ� (����) : ���
	private int money = 100000;
	private String[] foods = { "������", "����", "���", "�̸�" };
	private int sel; // �ʵ� ������ �ڵ����� �ʱ�ȭ�� (int�� -> 0)

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String[] getFoods() {
		return foods;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}

	public int getSel() {
		return sel;
	}

	public void setSel(int sel) {
		this.sel = sel;
	}

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
		System.out.println(foods[sel] + "(��/��) �丮�ϴ�.");
	}

	void sendFood() {
		System.out.println(foods[sel] + " ���Խ��ϴ�.");
	}
}

public class _03_Restaurant {
	public static void main(String[] args) {
		// ���赵 ������ ��ü(��ü)
		Restaurant rest = new Restaurant();
		rest.cleaning();
		rest.prepareFoods();
		for (int i = 0; i < 5; i++) {
			System.out.println("==================");
			rest.welcome();
			//if (i == 3)
			//	rest.foods = new String[] { "��", "����" };

			rest.anyFood();
			rest.cookFood();
			//rest.money = -999999999;
			rest.sendFood();
			rest.getmoney(5000);
			rest.byebye();
		}
		System.out.println("==================");
		rest.calcmoney();
		rest.cleaning();
	}
}
