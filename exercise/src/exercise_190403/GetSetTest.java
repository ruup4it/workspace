package exercise_190403;

class Student1 {
	/** 멤버변수 */
	private String name; // 학생이름
	private int num; // 학번

	/** 생성자 */
	public Student1() {
//		super();
//		this.name = "학생없음" ;
//		this.num = 000000;
	}
	
	public Student1(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	/** getter/setter */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num < 0) {
			System.out.println("입력불가");
		} else {
			this.num = num;
		}
	}

	/** toString */

	@Override
	public String toString() {
		return name + ", " + num;
	}
}

public class GetSetTest {
	public static void main(String[] args) {
		// 생성자 없는 경우
		Student1 st1 = new Student1();
		
		// 생성자 있는 경우
		Student1 st2 = new Student1("안녕",432);
		
		// 객체 찍기 toString
		System.out.println(st1);
		System.out.println(st1.getName());
		System.out.println(st1.getNum());
		
		System.out.println(st1.getName());
		System.out.println(st1.getNum());

		st1.setName("hi");
		st1.setNum(123);

		System.out.println(st1.getName());
		System.out.println(st1.getNum());

		st1.setNum(-123);

		System.out.println(st1.getName());
		System.out.println(st1.getNum());

	}
}
