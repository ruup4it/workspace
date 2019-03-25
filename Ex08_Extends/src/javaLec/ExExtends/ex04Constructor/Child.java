package javaLec.ExExtends.ex04Constructor;

//Child의 부모 클래스(상위 클래스/Super클래스)는 Father
//Father를 물려받아 확장했다.
public class Child extends Father {
	double day;

	Child(int score, long money, double day) {
		super(score, money);
		this.day = day;
		System.out.println("Child 생성자");
	}

	void play() {
		System.out.println("인생이 즐겁다.");
	}
}
