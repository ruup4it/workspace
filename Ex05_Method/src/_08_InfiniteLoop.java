
public class _08_InfiniteLoop {
	public static void main(String[] args) {
		int num = 0;
		while(true) {
			System.out.println(num++);
			if(num>=10)
				return; // ���θ޼��� ��ü�� ����
		}
	}
}
