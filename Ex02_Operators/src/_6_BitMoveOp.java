// 비트 이동 연산자 : Java에서 잘 안 쓰임
// 2의 배수 단위의 계산을 할 때 가장 빠르다.

public class _6_BitMoveOp {
	public static void main(String[] args) {
		int x = 2;
		System.out.println(x << 1);
		System.out.println(x << 2); //
		System.out.println(x << 3);
		
		x = 64;
		System.out.println(x >> 1);
		System.out.println(x >> 2);
		System.out.println(x >> 3);
		
	}
}
