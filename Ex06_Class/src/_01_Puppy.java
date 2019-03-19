/* <<클래스의 목적>>
 * 1) 매서드 시대보다 복잡해져서 더 큰 단위가 필요해짐
 * 2) 큰 프로그램을 적절한 단위로 이해, 해결
 * 3) 매서드를 재활용하려고 시도했더니 생각보다 잘 안됨
 * 		왜? - 매서드는 결국 외부 파라미터(매개변수)로 관련된 변수를 받아야 하니까
 * 			  -  매서드는 자기와 관련있는 다른 매서드를 필요로 하니까
 * 		그래서 아예 관련있는 것들은 클래스라는 이름으로 다 묶어버리자
 * 4) 그래서 클래스는 상당히 독립적인 형태를 취하고 있고
 * 		어느 정도는 재사용성이 높아졌다.
 * 		심지어는 객체지향 방법론이 나오고 나서
 * 		미래에는 개발자가 사라질 것이라고 예측한 전문가들도 있었다.
 * 5) 객체지향에서 재사용성은 Framework의 제작으로
 * 		어느 정도는 성공했지만 개발자가 없어질 일은 없다.
 * 6) 식당 클래스, 객체지향은 현실세계를 모델링했다고 표현
 * 		ex. 식당 - 식당주인(매출, 레서피)
 * 			   		 - 위생공무원(청결, 규격)
 * 			   		 - 손님(가격, 맛)
 * 		같은 클래스라도 주체에 따라 관심이 다름.
 *  7) 실제는 현실을 그대로 옮기는 것은 불가능하고
 *  	 현재 내가 대상(오브젝트)에 대한 관심사(요구사항)에 대해
 *  	 제한적으로 프로그래밍 하게 된다.
 *  8) 그러나 표준적인 기능들은 Framework라는 형태로 설계되어
 *  	 자주 사용되게 된다. 그리고 이 Framework를 사용하기 위해 개발자가 필요하다.
 *  9) 정리: 클래스 = 필드(명사) + 매서드(동사)
 */
public class _01_Puppy {
		// Field(멤버변수)
		String leftEye = "왼쪽 눈";
		String rightEye = "오른쪽 눈";
		String mouth = "입";
		String nose = "코";
		String tail = "꼬리";
		String[] legs = new String[4];
		
	public void pretty() {
		System.out.println(tail+"을 흔든다");
	}
	
	public void eat() {
		System.out.println(nose+"를 킁킁거린다");
		System.out.println(mouth+"를 벌려서 먹는다");
	}
	
	public void sleep() {
		System.out.println(leftEye+"을 감는다");
		System.out.println(rightEye+"을 감는다");
	}
	
	public static void main(String[] args) {
		//      푸들 	   모모
		_01_Puppy puppy = new _01_Puppy();
		puppy.pretty();
		puppy.eat();
		puppy.sleep();
	}
}
