package exercise_190313;

// 3. while���� �̿��ؼ� 1���� 10���� ���� ����ϼ���

public class while03 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
	}
}
