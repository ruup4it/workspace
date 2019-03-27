package javaLec.ExAbstract.ex03equals;

/* Object클래스로부터 상속 받은 method 중에 가장 많이 Overriding되는
 * method가 equals와 toString이다.
 * 1) toString 은 객체의 정보를 나타내는 메서드
 *    - 객체가 null일 때는 null을 반환한다.
 *    - 기본적으로 [패키지+클래스이름+@+16진수]로 구성된 hashcode를 반환한다.
 *    System.out.println(객체); 이 때 보여지는 정보
 *    내가 원하는 정보로 보여지게 하는데 종종 사용된다.
 * 2) equals 는 ==와 용도가 동일하다  
 *    즉 객체의 참조값(hashcode)가 같은 지 다른 지를 판단하여 boolean으로 반환한다.
 *    그러나 String 같은 경우는 overriding 되어서 
 *    참조값이 아니라 문자열 내용으로 비교하게 된다.
 *    String은 ==로 비교하면 참조 값으로 비교하게 된다.
 *    일반적인 클래스는 equals를 overriding해서 String클래스처럼
 *    비교할 정보를 구현자가 정할 수 있다.
 * */
public class Ball {
	public static void main(String[] args) {
		System.out.println();
	}
}
