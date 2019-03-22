package _ch07_GenericCollection;
// import static문 - java.lang.System 클래스의 out이라는 static 필드를 명시하면서 import
import static java.lang.System.out; 
// 제네릭 타입을 적용한 클래스 : 상징적으로 T라는 문자를 사용하였지만 그렇게 큰 의미는 없다.
class GenericEx1<T> {
	// 제네릭 타입 배열 선언
	// T라는 상징적인 명칭은 5행에서 선언된 제네릭 타입과 일치해야 한다. 
	// 외부로부터 현재 클래스가 생성될 때 정의되는 제네릭 타입으로 자료형이 명확하게 대체된다.
	T[] v; 
	
	// 제네릭 타입의 인자로 하는 메서드
	public void set(T[] n) {
		v = n;
	}
	
	// foreach문을 사용
	// 제네릭 타입 배열을 참조하는 멤버변수 v의 요소들을
	// 하나씩 검출하여 s라는 변수에 대입하고 출력
	public void print() {
		for(T s : v) {
			out.println(s);
		}
	}
}

