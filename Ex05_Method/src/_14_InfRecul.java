/* �߸��� ���ȣ�� ����� ����
 * StackOverFlowError
 */
public class _14_InfRecul {
	public static void main(String[] args) {
		showHi(3);
	}
//	// �ڱ��ڽ��� ��� ȣ���ϸ鼭 ���� �������� �ʰ� 3���� �ӹ�������
//	public static void showHi(int cnt) {
//		System.out.println("Hi~");
//		showHi(cnt--); 
//			return;
//	}
//	 // 1�� �˻��ϱ� ���� �ٽ� ȣ���ϹǷ� ��� �ݺ���
//	public static void showHi(int cnt) {
//		System.out.println("Hi~");
//		showHi(--cnt);
//		if(cnt==1)
//			return;
//	}
	public static void showHi(int cnt) {
		System.out.println("Hi~");
		if(cnt==1)
			return;
		showHi(--cnt);
	}
}
