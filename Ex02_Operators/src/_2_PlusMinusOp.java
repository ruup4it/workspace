// ����������
// Increment and Decrement Operators
public class _2_PlusMinusOp {
	public static void main(String[] args) {
		int num = 10;
		// ���������� ���� ���� 1���� or 1 ����
		num++; // num = num + 1;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		num--; // num = num - 1;
		System.out.println(num);
		
		--num;
		System.out.println(num);
	
		System.out.println("===============");
	
		num = 10;
		
		// ++num
		// num ���� ���� 1 ���� ��Ų �Ŀ� temp�� ���
		int temp = ++num;
		System.out.println("num = 10;");
		System.out.println("temp = ++num;");
		System.out.println("num ���� ���� 1 ���� ��Ų �Ŀ� temp�� ���");
		System.out.println("num : " + num);
		System.out.println("temp : " + temp);
		
		System.out.println("===============");
		
		num = 10;
		
		// num++
		// num ���� temp�� ���� �Ŀ� 1 ����
		temp = num++;
		System.out.println("num = 10;");
		System.out.println("temp = num++;");
		System.out.println("num ���� temp�� ���� �Ŀ� 1 ����");
		System.out.println("num : " + num);
		System.out.println("temp : " + temp);
		
		// -- ���� ++�� �����ϴ�.
		
		System.out.println("===============");
		
		num = 10;
		System.out.println(++num);
		
		num = 10;
		System.out.println(num++);
		
	}
}
