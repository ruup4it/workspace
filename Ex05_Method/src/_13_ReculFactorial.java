/*	<<��� ȣ��>>
 * �ڱ� �ڽ��� ��� ȣ���Ѵ�
 * �ϳ���ž, ����Ž���� ���� �ݺ����� ���� �����Ҷ� ���
 * ���ǻ���) ���� ������ ������� ������ ���ؿ� �޸𸮰� ��� �׿� ���� �߻�
 */
public class _13_ReculFactorial {
	public static void main(String[] args) {
		// for���� �̿��� ���丮��
		System.out.println(forFactorial(5));
		
		// ���ȣ���� �̿��� ���丮��
		System.out.println(factorial(5));
	}
	
	public static int forFactorial(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++)
			fact *= i;
		return fact;
	}
	public static int factorial(int num) {
		if (num==1)
			return 1;
		else
			return num*factorial(num-1);
	}

}
