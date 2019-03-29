package exercise_190329;

//3. main() 함수를 다음과 같이 수행할 수 있도록 하기 위한 CPoint클래스와
//   CColorPoint클래스를 작성하고 전체 프로그램을 완성하라.
//   CColorPoint클래스의 어떤 메서드에서도 System.out.println()을 호출해서는
//   안된다. CPoint클래스는 생성자가 오직 하나 뿐이다
//   
//   public void main(String[] args){
//	CPoint a, b;
//
//	a = new CPoint(2, 3);
//	b = new CColorPoint(3, 4, "red");
//	a.show();
//	b.show();
//	System.out.println(a);
//	System.out.println(b);
//   }
//
//<출력결과>
//(2,3)
//(3,4)red
//(2,3)입니다
//(3,4)입니다

class CPoint {
	int first, second;
	String third = "";

	CPoint(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public void show() {
		// (2, 3)
		System.out.println("(" + first + "," + second + ")" + third);
	}

	public String toString() {
		System.out.print("(" + first + "," + second + ")");
		return "입니다";
	}
}

class CColorPoint extends CPoint{
	CColorPoint(int first, int second, String third){
		super(first,second);
		this.third = third;
	}
}

public class Middle_03 {
	public static void main(String[] args) {
		CPoint a, b;
		a = new CPoint(2, 3);
		b = new CColorPoint(3, 4, "red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
	}
}
