package exercise_190320;

/*2. �غ��� ���� ������ ������ �� �ִ� TriangleŬ������ �����մϴ�
������ ���ÿ� �ʱ�ȭ�� ������ �����ڵ� �����մϴ�
�غ��� ���� ������ �����ų �� �ִ� �޼ҵ带 �����մϴ�
�ﰢ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ嵵 �����մϴ�
��ü�� ���� ����غ�����*/
class Triangle{
	int bottom;
	int height;
	
	Triangle(){
		bottom = 10;
		height = 20;
	}
	
	void setTriangle(int bottom, int height){
		this.bottom = bottom;
		this.height = height;
	}
	
	int calcArea() {
		return bottom*height/2;
	}
}
public class Basic_02 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.setTriangle(500,20);
		System.out.println(triangle.calcArea());
	}
	
}
