package javaLec._class.ex07Package;
/* 1) �ʵ�� �Ϲ������� private�� �����Ѵ�.
 * 2) ��� getter�� setter �޼��带 �̿��ؼ�
 *    ���� �ְų� ������ �� �ֵ��� �Ѵ�. 
 * 	  getter�� setter�� �Ϲ������� default, public 
 * 3) setter �޼��忡�� ������ ���� Ȯ���ϴ� �ڵ带
 *    ���� �� �ֱ� ������ ���� �ʵ带 �����ϴ� �ͺ���
 *    �������� ��������
 * */

/* 1) �޼���� �⺻������ default�� public�� ������ �Ѵ�.
 *    �ֳ��ϸ� ȣ���� �⺻���� �ϱ� ������
 * 2) �ٸ�, �޼��� �߿��� ���ο����� �����ϴ� ���� �����Ƿ�
 *    �̷� �޼���� ������ �д�(private, protected)
 * */
public class Circle {
	// getter/setter �ڵ� �ϼ� : Alt + Shift + S > r
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
