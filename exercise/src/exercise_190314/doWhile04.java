package exercise_190314;
//4. do~while���� �̿��ؼ� 1���� 10���� �߿� ¦���� ����ϼ���
//do~while������ ���ǹ��� �־��ָ� ��
//¦�� ���� if(num % 2 == 0)
public class doWhile04 {

	public static void main(String[] args) {
		int num = 0;
		do {
			++num;
			if(num % 2 == 0)
				System.out.println(num);
		} while (num < 10);
	}

}
