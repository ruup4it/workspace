package javaLec.ExExtends.ex04Constructor;

// Father의 부모 클래스(상위 클래스/Super클래스)는 GrandFather
// GrandFather를 물려받아 확장했다.
public class Father extends GrandFather {
	long money = 99999999999999999L;

	Father(int score, long money) {
		super(score); // GrandFather의 매개변수 생성자를 호출
		this.money = money;
		System.out.println("Father 생성자");
	}

	void wealth() {
		System.out.println("돈을 많이 벌었다.");
	}
}
