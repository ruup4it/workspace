package exercise_190318;

//4. ���޵� ���� �Ҽ����� �ƴ��� �Ǵ��Ͽ�, �Ҽ��� ��� true��, �Ҽ��� �ƴ� ��� false�� ��ȯ�ϴ� �޼��带 �����ϰ� 
//�̸� �̿��ؼ� 1�̻� 100������ �Ҽ��� ���� ����� �� �ֵ��� main�� �����ϼ���
//�Ҽ��� 1�ܿ� �ڱ��ڽ����θ� ���������� ���Դϴ�

public class Middle_04 {
	
	// �Ҽ����� �Ǵ��ϴ� �޼���
	// ���ϰ� : boolean�� (true or false ��ȯ)
	// �޼���� : prime
	// �Ű����� : int�� ����
	public static boolean prime(int num) {
		int count = 0; // �������� 0�� ����� ���� ����� ���� ����
		for (int i = 1; i <= num; i++) { // 1���� �Ű��������� �ݺ�
			if (num % i == 0) {  // �������� 0�̶�� 
				count++;			// ī��Ʈ ����
			}
		}
		if (count == 2) { 	// 1�� �ڽŸ����θ� ���������� �ϹǷ� count�� 2�϶�
			return true; 	// true ��ȯ
		} else {			// �ƴ϶��
			return false;   // false 
		}
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // 1���� 100���� �ݺ�
			boolean isPrime = prime(i); // prime �޼����� ���� ���� isPrime ������  ����
			if (isPrime) { // if(true)
				System.out.print(String.format("%d ",i)); //���
			}
		}
	}

}
