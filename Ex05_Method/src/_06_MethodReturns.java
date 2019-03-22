// 매서드 이용목적: 적절한 길이로 잘라주기 위함
public class _06_MethodReturns {
	public static void main(String[] args) {
		int result = adder(4,5);
		System.out.println("4와 5의 합: "+result);
		System.out.println("3.5의 제곱: "+square(3.5));
	}
	
	public static int adder(int num1, int num2) {
		int addResult = num1+num2;
		return addResult;
		// return num1+num2;
	}
	
	public static double square(double num) {
		return num*num;
	}
}
