package exercise_190327;
//1. 더하기, 빼기 곱하기 나누기를 수행하는 각 클래스

//Add, Sub, Mul, Div를 만드세요
//
//이들은 모두 다음 필드와 메서드를 가집니다
//
//1) int타입의 a, b 필드 : 연산하고자 하는 숫자들
//2) void setValue(int a, int b) : 숫자를 객체에 설정
//3) int calculate(): 해당 목적에 맞는 연산을 실행하고 그 결과를 리턴합니다
//
//Add, Sub, Mul, Div모두 공통된 필드와 메서드가 존재하므로
//Calc를 정의하고 이들이 Calc를 상속받게 하세요
//그리고 Calc의 배열에 자식 객체들을 담고
//calculate를 실행시키세요

class Add extends Calc {
	int calculate() {
		result = a + b;
		return result;
	}
	public String toString() {
		return "더하기 결과는 " + result + "입니다.";
	}
}

class Sub extends Calc {
	int calculate() {
		result = a - b;
		return result;
	}
	public String toString() {
		return "빼기 결과는 " + result + "입니다.";
		
	}
}

class Mul extends Calc {
	int calculate() {
		result = a * b;
		return result;
	}
	public String toString() {
		return "곱하기 결과는 " + result + "입니다.";
	}
}

class Div extends Calc {
	int calculate() {
		result = a / b;
		return result;
	}
	public String toString() {
		return "나누기 결과는 " + result + "입니다.";
	}
}

public class Middle_01 {
	public static void main(String[] args) {
		Calc[] calcArr = new Calc[] { new Add(), new Sub(), new Mul(), new Div() };
		calcArr[0].setValue(1, 2);
		calcArr[1].setValue(3, 2);
		calcArr[2].setValue(8, 2);
		calcArr[3].setValue(8, 4);
		
		calcArr[0].calculate();
		calcArr[1].calculate();
		calcArr[2].calculate();
		calcArr[3].calculate();
		
		for(Calc item : calcArr)
			System.out.println(item);
	}
}
