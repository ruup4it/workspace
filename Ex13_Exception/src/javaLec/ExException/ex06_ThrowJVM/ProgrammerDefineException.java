package javaLec.ExException.ex06_ThrowJVM;

import java.util.Scanner;

// 우리가 정의하는 Exception클래스
// 사용자 정의 예외처리 클래스
class AgeInputException extends Exception{
	AgeInputException(String ex){
		super(ex);
	}
}

public class ProgrammerDefineException {
	/*readAge()내에서 AgeInputException이 발생하면
	 * 나를 호출한 곳으로 보내겠다.
	 * */
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 0) {
			AgeInputException excpt = 
					new AgeInputException("유효하지 않은 나이 입력되었습니다");
			throw excpt;	// 예외를 (강제로) 발생
		}
		return age;
	}
	public static void main(String[] args) throws AgeInputException {
		System.out.println("나이를 입력하세요");
		int age = readAge();
		System.out.println("당신은 " + age + "세입니다");
	}
}
















