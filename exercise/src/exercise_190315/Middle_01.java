package exercise_190315;
//1. 1000������ �ڿ��� �߿��� 2�� ����̸鼭 7�� ����� ���ڸ� ����ϰ�,

//�� ��µ� ���ڵ��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���

public class Middle_01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				sum += i;
				System.out.print(i + ", ");
			}
		}
		System.out.println("\n���� : " + sum + "�Դϴ�.");
	}

}
