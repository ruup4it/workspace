package exercise_190314;

//3. do~while���� �̿��ؼ� 1���� 10���� ���� ����ϼ���
public class doWhile03 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		do {
			++num;
			sum += num;
		} while (num < 10);
		System.out.println(sum);
	}
}
