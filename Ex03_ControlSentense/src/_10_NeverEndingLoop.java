import java.util.Scanner;

/* ���ѷ���
 * if���� + break���� ���� ���� ��찡 ����.
 * 1) while(true)
 * 
 * 2) do{
 * 	  }while(true);
 * 
 * 3) for(;;)
 * */

//���ڸ� �Է� �޾ƶ�
//�Է¹��� ���ڸ� ���ض� 
//-1�� �ԷµǸ� ���� ���ڸ� ����ϰ� 
//�����ض�
public class _10_NeverEndingLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		// ���� ����
		for(;;) {
			System.out.print("���� �Է� (-1�̸� ����) : ");
			num = scan.nextInt();
			sum += num;
			if(num == -1)
				break;
		}
		System.out.println("���� �� :" + sum);
		scan.close();
	}
}
