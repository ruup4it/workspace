
public class _12_DiffType {
	public static void main(String[] args) {
		// [������ ����] ������ ����� [����]
		int num0 = 10;
		int num1 = 3;
		System.out.println(num0/num1);
		
		// [������ �Ǽ�] ������ ����� [�Ǽ�]
		// double �� int ���� �켱 ������ �� �����Ƿ� 
		// ������ �Ǽ��� �ڵ� ��ȯ ���� ������ �̷�����Ƿ� ����� �Ǽ��� ��
		int num = 10;
		double dNum = 3; // 3�� ������� ���������� 3.000~���� ��ȯ�Ǽ� ���
		float fNum = 3; 
		
		// �Ǽ��� Ư�� ���ϴ� �ٻ� > �ŷ��� �� ����
		// 3.3333333333333335
		System.out.println(num/dNum); 
		// 3.3333333
		System.out.println(num/fNum); 
		// 3.33333325386047360000
		System.out.println(String.format("%.20f",num/fNum)); 
	}
}
