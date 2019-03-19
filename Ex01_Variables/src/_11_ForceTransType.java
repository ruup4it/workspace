/* 강제 형 변환 (명시적 형 변환)
 * 큰 범위의 숫자를 작은 범위의 숫자에 담으려고 할 때
 * 그냥은 컴파일 과정에서 막아버리니까
 * 필요하면 명시적으로 변환하겠다고 선언하는 것 
 * 
 * 앞에꺼 손실나는데 너가 명확하다면 명시적으로 형변환을 통해 바꾸렴
 * ex) int : 4 byte / byte : 1 byte 
 * int -> byte로 하면 3 byte가 잘려나감
 * 하지만 10 정도는 괜찮
 * int : 00000110 -> byte : 0110 
 * 
 * */
public class _11_ForceTransType {
	public static void main(String[] args) {
		// 데이터각 잘리는 경우
		// byte는 127까지 밖에 표현을 못하는데 강제 형변환을 시킨 경우 > -128로 바뀜
		int num = 128;
		byte bNum = (byte) num;
		System.out.println(bNum);

		//
		char ch = 'A'; // char는 음수 없음
		// short s = ch; // 에러 발생(cannot convert from char to short)
		short s = (short) ch; // short는 음수까지 있음
		// char와 short는 같은 2byte지만 범위가 다름
		// short는 음수까지 있으므로 char의 문자 범위가 양수쪽으로 더 넓다.
		System.out.println(s);

		//
		float f = 13.3F;
		// int num = f; // 에러 발생(cannot convert from float to int)
		// 같은 4byte이지만 실수인 float의 범위가 크다
		int num2 = (int) f; // 소수점이 사라진다.
		System.out.println(f);
		System.out.println(num2);

		// long은 8byte, float는 4byte
		// float가 long 보다 크기는 작지만 표현 범위가 더 넓으므로 허용됨
		// 8byte -> 4 byte 에 넣지만 실수로 변환해서 넣는다.
		// 표현 범위가 float > long 이므로 정상 동작
		long lval = 1234L;
		float fNum = lval;
		System.out.println(fNum);
		
	}
}
