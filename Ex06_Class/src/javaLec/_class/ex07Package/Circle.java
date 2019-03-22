package javaLec._class.ex07Package;
/* 1) 필드는 일반적으로 private로 설정한다.
 * 2) 대신 getter나 setter 메서드를 이용해서
 *    값을 넣거나 가져올 수 있도록 한다. 
 * 	  getter나 setter는 일반적으로 default, public 
 * 3) setter 메서드에는 들어오는 값을 확인하는 코드를
 *    넣을 수 있기 때문에 직접 필드를 접근하는 것보다
 *    안전성이 높아진다
 * */

/* 1) 메서드는 기본적으로 default나 public을 전제로 한다.
 *    왜냐하면 호출을 기본으로 하기 때문에
 * 2) 다만, 메서드 중에는 내부에서만 동작하는 것이 있으므로
 *    이런 메서드는 제한을 둔다(private, protected)
 * */
public class Circle {
	// getter/setter 자동 완성 : Alt + Shift + S > r
	private double rad;

	double getRad() {
		return rad;
	}

	void setRad(double rad) {
		if (rad > 0)
			this.rad = rad;
	}

	Circle(double r) {
		rad = r;
	}

	double circleArea() {
		return rad * rad * 3.14;
	}
}
