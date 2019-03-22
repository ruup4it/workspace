
public class _12_DiffType {
	public static void main(String[] args) {
		// [정수와 정수] 연산의 결과는 [정수]
		int num0 = 10;
		int num1 = 3;
		System.out.println(num0/num1);
		
		// [정수와 실수] 연산의 결과는 [실수]
		// double 이 int 보다 우선 순위가 더 높으므로 
		// 정수가 실수로 자동 변환 된후 연산이 이루어지므로 결과는 실수가 됨
		int num = 10;
		double dNum = 3; // 3을 담았지만 내부적으로 3.000~으로 변환되서 담김
		float fNum = 3; 
		
		// 실수는 특정 이하는 근삿값 > 신뢰할 수 없음
		// 3.3333333333333335
		System.out.println(num/dNum); 
		// 3.3333333
		System.out.println(num/fNum); 
		// 3.33333325386047360000
		System.out.println(String.format("%.20f",num/fNum)); 
	}
}
