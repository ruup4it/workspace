// 비트 논리 연산자
// Java에서 거의 잘 안 쓰임
// 그냥 있구나 
// |(or), &(and), ^(xor)
// |(or)  : 비트끼리 둘 중 1 개가 1이면 1
// &(and) : 비트끼리 둘 다 1이어야 1
// ^(xor) : 비트끼리 같으면 0, 다르면 1

public class _4_BitOp {
	public static void main(String[] args) {
		int x = 3; // 00000011
		int y = 2; // 00000010
				   
		System.out.println(x|y); // 00000011 : 3
		System.out.println(x&y); // 00000010 : 2
		System.out.println(x^y); // 00000001 : 1
		
		x = 16; // 00010000
		y = 8;  // 00001000
		System.out.println(x|y); // 00011000 : 24
		System.out.println(x&y); // 00000000 : 0 
		System.out.println(x^y); // 00011000 : 24
	}
}
