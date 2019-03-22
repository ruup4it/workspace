// 조건 연산자 : 조건문 대신 사용
// 삼항 연산자 - 항목이 3개라서 이름 지음
// A ? B : C - A 가 true면 B가 결과
//			   A 가 false면 C가 결과
// 조건문 대신 쓰이는 경우가 있다.
public class _7_ThreeParamOp {
	public static void main(String[] args) {
		boolean b = true;
		int num = b? 10: 100;
		System.out.println(num);
		
		b = false;
		num = b? 10:100;
		System.out.println(num);
	}
}
