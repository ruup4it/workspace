package javaLec._class.ex07Package;

import javaLec._class.ex08Package.Triangle;
/* <��Ű����?>
 * 1) package�� class���� ���� �з� �����̸�
 *    ���ÿ� ���� �����̴�.
 * 2) class ���� �� ������ package���� ���� ������
 *    default pakage �Ҽ��� �ȴ�.
 * 3) �ٸ� package�� Ŭ������ ����ϰ� ������ import�� �Ѵ�.
 *    ����Ű�� Ctrl + Shift + o
 * 4) import ���� ����� �� �ִ� package�� 
 *    �ڱ� �ڽ��� ���� package�� java.lang�̴�.
 * 5) java���� ������ ����������(private,default, protected, public)�� ���� ������
 *    default ���� ������ ���� �ȴ�.
 * 	  private ���� Ŭ���� ������ ���� ����
 *    default ���� ������ ���� ��Ű�� �������� ���� ����
 *	  protected ���� ��Ű��, ��� ���� Ŭ���� ������ ���� ����
 *    public ��𼭳� ���� ����
 * */

/* <��Ű�� ���� ���>
 * 1) ȸ�� �̸��� �������� ����� ��찡 ���� �ִ�.
 *    ���� ���, www.bitcamp.co.kr�� ���������� ������ ȸ��� 
 *    ��Ű���� ������ ��
 *    kr.co.bitcamp�� ����� ��찡 �����ִ�.
 * 2) �ֻ��� ��Ű���� <ȸ���� ������> - unique(���ϼ�)
 * 3) �߰� ��Ű���� <��� �̸�/����>
 * 4) ���� �Ʒ� ��Ű���� ��Ű�� ���� �ִ� Ŭ������ ����
 * */

/* ���ٱ���
 * public (������) : ��𼭳� ������� ���� ȣ�� ���� 
 * protected (��ȣ�ϴ�) : ��Ű���� ����,
 * 						�ٸ� ��Ű���� ����̸� ���� ȣ�� ����
 * default : ������ ��Ű���� ���� ȣ�� ���� 
 * private (��������) : Ŭ���� �������� ���� ȣ�� ����
 * */

public class CircleMain {
	public static void main(String[] args) {
		// ���� ��Ű���� �ִ� Circle ��ü ����
		Circle cc = new Circle(2);
		System.out.println(cc.circleArea());

		// �ٸ� ��Ű���� �ִ� Triangle ��ü ���� -> ��Ű��.Ŭ���� import ���������
		Triangle ta = new Triangle(2, 3);
		System.out.println(ta.getTriangleArea());

		// ��Ű��.Ŭ���� import ���� �ʰ� ����Ϸ��� ���
		// import javaLec._class.ex08Package.Circle;
		// ��Ű��.Ŭ���� ���� ä�� ��ü ����
		javaLec._class.ex08Package.Circle circle = new javaLec._class.ex08Package.Circle(3);
		System.out.println(circle.circlePerimeter());
	}
}
