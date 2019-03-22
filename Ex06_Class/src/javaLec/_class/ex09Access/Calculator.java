package javaLec._class.ex09Access;

// �ܺο��� ����ϰ� ����� �� ������ �д�.
// ���ϱ�� ���⸦ �����Ѵ�.
public class Calculator {

	private Adder adder;
	private Subtractor subtractor;

	// �����ڰ� public�̾�߸� �ܺο��� ��ü ���� ����
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
		System.out.println(String.format("���� Ƚ�� : %d", adder.getCntAdd()));
		System.out.println(String.format("���� Ƚ�� : %d", subtractor.getCntSub()));
	}
}
