import java.util.Scanner;

// ����ڷκ��� ������ �Է� �޾ƶ�
public class _8_ThreeParamOp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0; String strNum="";
		
		System.out.println("������ �Է��ϼ���");
		num = scan.nextInt();
		
		strNum = num % 2 == 0 ? "¦��" : "Ȧ��" ;
		
		System.out.println(strNum);
		scan.close();
	}
}
