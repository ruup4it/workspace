package exercise_190401;

//4. 추상클래스의 서브클래스 만들기에 필요한 추상 메소드 오버라이딩과
//   super()의 사용에 관한 문제이다
//   MyPoint추상 클래스가 있습니다
//
//   abstract class MyPoint{
//	int x;
//	int y;
//	public MyPoint(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//	protected abstract void move(int x, int y);
//	protected abstract void reverse();
//	protected void show(){
//		System.out.println(x + "," + y);
//	}
//   }
//
//   MyPoint를 상속받는 MyColorPoint클래스를 작성하라. MyColorPoint의 생성자는
//   MyColorPoint(int x, int y, String color)로 하라. 그리고 다음과 같은 main()
//   메서드를 삽입하여 실행되도록 하라
//   public static void main(String[] args){
//	MyPoint p = new MyColorPoint(2, 3, "blue");
//	p.move(3, 4);
//	p.reverse();
//	p.show();
//   }
//
//
//<출력결과>
//4,3,blue

abstract class MyPoint {
	int x;
	int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected abstract void move(int x, int y);

	protected abstract void reverse();

	protected void show() {
		System.out.println(x + "," + y);
	}
}

class MyColorPoint extends MyPoint {
	String color;

	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;

	}

	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	protected void reverse() {
		int temp = x;
		this.x = y;
		this.y = temp;
	}

	protected void show() {
		System.out.println(x + "," + y + "," + color);
	}

}

public class Middle_04 {
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2, 3, "blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}
}
