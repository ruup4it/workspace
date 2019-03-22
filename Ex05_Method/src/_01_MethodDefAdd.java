/* Method (Java에서 함수를 가리키는 용어)
 * Function
 * 
 * 문장 = 명사 + 동사 = 주어 + 동사
 * 프로그래밍 = 필드 + 메서드
 * 
 * 메서드를 만드는 목적 
 * 1) 코드가 길어지게 되면 가독성을 위하여 일정 단위로 분류
 * 	  일정 의미 있는 단위로 분류
 * 	k5 - 부품 모듈화, 1군데가 이상이 생기면 그 부분만 수리
 * 	(개발 비용의 절약)
 * 2) 중복 코드를 이름으로만 호출하기 위해
 * 3) 재사용을 쉽게 하기 위해
 * */

/* static 메서드
 * 클래스가 사용될 때 객체를 만들지 않아도 바로 메모리에 로딩
 * */
/* 메서드의 형식
 * 
 * 녹즙			녹즙기		(잎)
 * returnValue methodName (argumentValue){
 * 
 * }
 * 리턴값(returnValue)이 int, double, int[], 클래스 등
 * return 해당 return형; 이 와야 한다.
 * 리턴 값이 void이면 아무값도 반환하지 않는다는 의미이므로
 * return을 생략하거나 그냥 retuurn만 써주면 된다.
 * return의 의미는 이 함수를 호출한 곳으로 돌아가라
 * */

/* return값   2x+1이 함수명 (x가 매개변수)
 *    y   =    2x + 1
 * 
 * */
// 한 파일에 public 클래스는 하나만 존재
public class _01_MethodDefAdd {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryOne(12);
		hiEveryOne(12);
		System.out.println("프로그램의 끝");
	}
	static void hiEveryOne(int age) {
		System.out.println("좋은 아침 입니다.");
		System.out.println("제 나이는" + age + "입니다.");
		return; // 아무 값도 리턴할 것 없이 돌아가라 ; void일 경우 생략 가능
	}
}

