//
public class _1_if {
	public static void main(String[] args) {
		int num = 10;
		if(num%2 == 0) 
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		int num2 = 10;
		boolean b = num2%2 == 0;
		if(b) 
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		
		int num3 = 11;
		if(num3%3 == 0) 
			System.out.println("3�� ���");
		else if(num3 %3 ==1)
			System.out.println("3���� ������ �� ������1");
		else if (num3 %3 ==2) // else
			System.out.println("3���� ������ �� ������ 2");
	}
}
