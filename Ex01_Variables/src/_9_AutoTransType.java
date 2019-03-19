/* 자동 형 변환
 * 작은 범위 숫자를 큰 범위의 숫자에 담을 때 발생
 * */
public class _9_AutoTransType {
	public static void main(String[] args) {
/*		자동 형 변환이 일어난다
		10은 default int인데 값이 byte에 들어가므로
		byte로 변환된다
		b는 byte인데 1byte이므로 4byte인 int에
		담겨지므로 자동으로 int로 바뀌어진다.*/
		
		byte b = 10;
		int ibyte = b;
		System.out.println(ibyte);
		
		/*
		 * 자동 형 변환이 일어남 char는 내부적으로 정수로 저장되고, 
		 * 2byte이므로 int인 4byte에 담긴다. 
		 * 그러므로 자동 형 변환이 일어난다.
		 */
		char ch = 'A';
		int iCh = ch;
		System.out.println(iCh);
		
		
	}
}
