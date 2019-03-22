package exercise_190320;

/*1. ���� Ŭ������ �����ϼ���
1) ����̰� ������ �ִ� ���� ���� ������ ���� �� �ִ� > marble ����
2) ���̸� ���� ������ �ְ������ ǥ���ϴ� �޼ҵ尡 �����Ѵ� > playMarble() �޼ҵ�
3) ����� ���� ���� ������ ����ϴ� �޼ҵ尡 �����Ѵ�. > printMarble() �޼ҵ�

main������ ��ü�� �̷��� ����ϴ�
  ���1�� �����ڻ� -> ���� 15��
  ���2�� �����ڻ� -> ���� 9��
  1�� ���̿��� ���1�� ���2�� ���� 2���� ȹ���Ѵ�
  2�� ���̿��� ���2�� ��� 1�� ���� 7���� ȹ���Ѵ�
  ���������� ������ ��̰� �����ϰ� �ִ� ������ ���� ����Ѵ�
  ���α׷��� �����Ѵ�.*/
class Child {
	int marble;
	String name;
	static int playCount;	// ���� Ƚ�� 
							// ���� ��ü���� �����ϱ����� Static
	
	Child(int num, String name) {
		marble = num;         // ��������� �Ű����� �̸��� �ٸ� ���
		this.name = name;	  // ��������� �Ű����� �̸��� ���� ���
	}

	void playMarble(int num, Child child) {  // ���� ����, ���ѱ� ���
		playCount++;  						 // ���� Ƚ��
		System.out.println(
				String.format("%d�� ���� : %s�� %s�� ���� %d���� ȹ���Ѵ�", 
				playCount, name, child.name, num)
		);
		marble += num;						 // this ���� ����
		child.marble -= num;				 // ���ѱ� ��� ���� ����
	}

	void printMarble() { //���
		System.out.println(String.format("%s�� ���� ���� ���� ���� : %d", name, marble));
	}

}

public class Advance_01 {
	public static void main(String[] args) {
		// ��� ����
		Child child1 = new Child(15, "������"); // ���1�� �����ڻ� -> ���� 15��
		Child child2 = new Child(9, "��â��"); // ���2�� �����ڻ� -> ���� 9��

		// ����
		child1.playMarble(2, child2); // ���1�� ���2�� ���� 2���� ȹ���Ѵ�
		child2.playMarble(7, child1); // ���2�� ��� 1�� ���� 7���� ȹ���Ѵ�

		// ���
		child1.printMarble();
		child2.printMarble();
	}
}
