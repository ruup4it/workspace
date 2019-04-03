package exercise_190403;

//1. 다음과 같은 선언한 Stack 인터페이스가 있다
//public interface Statck<T>{
//	public T pop();
//	public boolean push(T ob);
//}
//
//LinkedList 자료구조를 이용하여 Stack<T> 인터페이스를 구현(implements)하는
//MyStack<T> 클래스를 작성하세요. 그리고 MyStatck<T>의 제네릭 타입 T를 Integer타입으로
//구체화한 정수 스택을 생성하여 정수를 push하고 pop하는 프로그램을 작성하라
public class Advance_01 {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<Integer>();
		System.out.println(myStack.push(null));
		System.out.println(myStack.push(1));
		System.out.println(myStack.push(2));
		System.out.println(myStack.push(3));
		System.out.println(myStack.push(4));
		System.out.println(myStack.push(5));
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
	}

}
