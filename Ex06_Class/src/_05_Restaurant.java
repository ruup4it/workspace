import java.util.Arrays;
import java.util.Random;

/* �Ĵ� Ŭ���� ����
 * 1) ������� �������� �����Ѵ�.
 * 2) ������� ���� ������ �ȴ�.
 * 3) �������� ���� �޼��尡 �ȴ�.
 * 4) ������ �Ժη� �����ϸ� ������ ������ �ſ� ����
 *    �׷��� �Ϲ������� �ܺ� ������ ������Ŵ(private)
 *    class�������� ���� ����
 * 5) �޼���� �Ϲ������� �ܺ� ȣ���� ������ ��
 *    �׷��� �Ϲ������� ������ �㰡��(public, default)
 * 6) Ŭ������ �ʱ�ȭ �۾��� �ϴ� ��ü ������ ������ ȣ��Ǵ�
 *    �޼��尡 �ִ�. �� �޼���� Ŭ������ �̸��� �����ϴ�
 *    �̹� Java�� ���鶧���� ������ ���
 *    (��ü���� ���α׷����� �̷��� �޼��带 ���´�)
 *    �� �޼��带 "������"�� �θ���
 *    ���࿡ �����ڸ� ������ ������ �����Ϸ��� �����Ͻ� �ڵ�����
 *    default�����ڸ� �߰����ش�.
 *    Unity�� �����ϸ� void Start()�� ���Ұ� ����
 * 7) �޼��� �߿� ���ο����� ���Ǵ� �޼��尡 �ִ�.
 * 	  ù° ����, ����ڰ� ����� �ʿ� ���� �޼���� ���߱� ����
 *    ��° ����, �����ڰ� �����Ű�� ���� ���� �޼��带 ���߱� ����
 * */

class Restaurant2{
	// �ʵ�(����):���
		private int money = 100000;
		private String[] foods = {"������", "����", "���", "�̸�"};
		private int sel;		// �ʵ庯���� �ڵ����� �ʱ�ȭ��
		
		// �޼���(���):����
		Restaurant2(){		// ������ (�޼���)
			cleaning();
			prepareFoods();
		}
		private void cleaning() {
			System.out.println("�Ĵ��� û���Ѵ�");
		}
		private void prepareFoods() {
			System.out.println("���� ��Ḧ �����ϴ�");
		}
		void welcome() {
			System.out.println("� ������");
		}
		void byeBye() {
			System.out.println("�ȳ���������");
		}
		void getMoney(int m) {
			money += m;
			System.out.println(m + "�� ���İ����� ����");
		}
		void calcMoney() {
			System.out.println("���� ���� " + money + "�̴�");
		}
		void anyFood() {
			System.out.println("� ���� ��Ƿ���?");
			System.out.println(Arrays.toString(foods));
			Random rd = new Random();
			sel = rd.nextInt(foods.length);
			System.out.println(foods[sel]+"�̿�");
		}
		void cookFood() {
			System.out.println(foods[sel]+"�� �丮�ϴ�");
		}
		void sendFood() {
			System.out.println(foods[sel]+"���Խ��ϴ�");
			System.out.println("���ְ� �弼��");
		}			
}

public class _05_Restaurant {
	
	public static void main(String[] args) {
		// ���赵         ������           ��ü(��ü)
		Restaurant2 rest = new Restaurant2();
//		rest.cleaning();
//		rest.prepareFoods();
		for(int i=0;i<10;i++){
			System.out.println("==================");
			rest.welcome();
//			if(i==5)
//				rest.foods = new String[] {"��", "����"};
			rest.anyFood();
			rest.cookFood();
//			rest.money = -999999999;
			rest.sendFood();
			rest.getMoney(1000);
			rest.byeBye();
			
		}
		System.out.println("==================");
		rest.calcMoney();
	}
}







