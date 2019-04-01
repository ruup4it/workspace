package exercise_190401;

//3. int타입의 x, y, radius필드를 가지는 Circle클래스를 작성하세요
//   equals()메서드를 오버라이딩하여 2 개의 Circle객체의 반지름이 같으면
//   두 Circle 객체가 동일한 것으로 판별하도록 하라.
//   Circle클래스의 생성자는 3개의 인자를 가지며, x, y, radius필드를
//   인자로 받아 초기화 한다.

class Circle {
	int x, y, radius;

	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public boolean equals(Object obj) {
		return this.radius == ((Circle) obj).radius;
	}

	public String toString() {
		return "반지름은 " + this.radius;
	}

}

public class Basic_03 {
	public static void main(String[] args) {
		Circle circle1 = new Circle(5, 5, 30);
		Circle circle2 = new Circle(1, 6, 30);

		System.out.println("원1 : " + circle1);
		System.out.println("원2 : " + circle2);
		System.out.println("== 결과 : " + (circle1 == circle2));
		System.out.println("equals() 결과 : " + circle1.equals(circle2));
	}
}
