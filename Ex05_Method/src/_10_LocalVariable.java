/* 지역변수는 {} 영역에 존재하는 변수
 * 매서드가 호출되면 스택 메모리에 로딩된다
 * 같은 이름이라도 다른 메모리를 사용
 * {}가 끝나면 스택에서 사라진다(올렸다 내렸다)
 * 해당 지역에서만 사용할 수 있고
 * 만약 다른 곳에 값을 넘기려면 return을 사용해야한다
 
 */
public class _10_LocalVariable {
	public static void main(String[] args) {
		boolean scope=true;
		if(scope) {
			int num = 1;
			num++;
			System.out.println(num);
		}else {
			int num = 5;
			System.out.println(num);
		}
		simple();
	}
	public static void simple() {
		int num = 3;
		System.out.println(num);
	}
}
