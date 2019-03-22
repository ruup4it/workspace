package javaLec._class.ex09Access;

// 외부에서 사용하게 만드는 데 목적을 둔다.
// 더하기와 빼기를 제공한다.
public class Calculator {

	private Adder adder;
	private Subtractor subtractor;

	// 생성자가 public이어야만 외부에서 객체 생성 가능
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int num1, int num2) {
		return adder.addTwoNumber(num1, num2);
		
	}
	
	public int subTwoNumber(int num1, int num2) {
		return subtractor.subTwoNumber(num1, num2);
	}
	
	public void showOperatingTimes() {
		System.out.println(String.format("덧셈 횟수 : %d", adder.getCntAdd()));
		System.out.println(String.format("뺄셈 횟수 : %d", subtractor.getCntSub()));
	}
}
