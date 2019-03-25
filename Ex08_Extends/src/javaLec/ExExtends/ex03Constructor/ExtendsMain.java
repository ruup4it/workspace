package javaLec.ExExtends.ex03Constructor;
/*
 * 상속을 받으면 자식 객체내에는 부모 객체가 존재하게 된다.
 * 그리고 부모 객체가 먼저 만들어지고 나서 자식 객체가 만들어진다
 * 생성자 호출을 통해서 확인할 수 있다. 
 */

public class ExtendsMain {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Child child = new Child();
	}

}
