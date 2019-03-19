
public class _08_InfiniteLoop {
	public static void main(String[] args) {
		int num = 0;
		while(true) {
			System.out.println(num++);
			if(num>=10)
				return; // 메인메서드 자체가 종료
		}
	}
}
