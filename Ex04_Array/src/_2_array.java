import java.util.Arrays;

/* ���� �ö󰡴� �޸𸮴� 
 * JVM ���� Garbage Collector(������ ������)�� ����
 * ���� �˰����� ����Ǿ� �˾Ƽ� �����ȴ�.
 * 
 * kor�� ����Ű�� 5���� ������ ������ GC�� ����
 * 
 * ���ÿ� �ö� �޸𸮴� �ش� ������ ���� �� �Ҹ�ȴ�.
 * stnum�� kor�� main �޼��尡 ���� �� ��� �Ҹ�
 * */
public class _2_array {
	public static void main(String[] args) {
		//int stNum = 5 ; // ���ÿ� �ö󰣴�.
		int[] korScore = new int[5]; // ���� �ö󰣴�.
		korScore[0] = 88;
		korScore[1] = 99;
		korScore[2] = 90;
		korScore[3] = 87;
		korScore[4] = 79;
		
		// 16���� hashCode ��
		// JVM�� ���� ���� ������ �����ϱ� ����
		// �ؼ��Ǵ� ��� ���� ��ȣ
		System.out.println(korScore);
		System.out.println(Arrays.toString(korScore));
	}
}
