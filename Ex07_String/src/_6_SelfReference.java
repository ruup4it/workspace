/*
 *  strBuf.append('Y').append(true);의 의미를 알아보자
 */
class SimpleAdder {
	private int num;

	public SimpleAdder() {
		num = 0;
	}
	// add 메서드가 위의 예제와 관련이 있다.
	public SimpleAdder add(int num) {
		this.num += num;
		return this; // 객체 자신
	}

	public void showResult() {
		System.out.println("add result : " + num);
	}
}

public class _6_SelfReference {
	public static void main(String[] args) {
		SimpleAdder adder = new SimpleAdder();
		//adder.add(1).add(3).add(5).showResult();
		/* adder.add()는 adder 자신(this)을 리턴하므로
			adder1과 adder2와 adder3은 모두 같은 hashcode를 가진다.
		*/
		SimpleAdder adder1 = adder.add(1);
		SimpleAdder adder2 = adder.add(3);
		SimpleAdder adder3 = adder.add(5);
		adder3.showResult();
		System.out.println();
		
		System.out.println("hashcode (adder)  : " + adder);
		System.out.println("hashcode (adder1) : " + adder1);
		System.out.println("hashcode (adder2) : " + adder2);
		System.out.println("hashcode (adder3) : " + adder3);
		System.out.println();
		
		System.out.println("adder==adder1 : " + (adder==adder1));
		System.out.println("adder==adder2 : " + (adder==adder2));
		System.out.println("adder==adder3 : " + (adder==adder3));
		System.out.println();
		
		System.out.println(String.format("adder==adder1 : %s", adder==adder1));
		System.out.println(String.format("adder==adder2 : %s", adder==adder2));
		System.out.println(String.format("adder==adder3 : %s", adder==adder3));
	}
}
