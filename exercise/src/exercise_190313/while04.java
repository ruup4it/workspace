package exercise_190313;

//4. while���� �̿��ؼ� 1���� 10���� �߿� ¦���� ����ϼ���
//   while������ ���ǹ��� �־��ָ� ��
//   ¦�� ���� if(num % 2 == 0)

public class while04 {
	public static void main(String[] args) {
		int num = 1;
		while(num <= 10) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
			num ++;
		}
	}
}
