package javaLec.ExExtends.ex01Extends;

// Father의 부모 클래스(상위 클래스/Super클래스)는 GrandFather
// GrandFather를 물려받아 확장했다.
public class Father extends GrandFather {
	void wealth() {
		System.out.println("돈을 많이 벌었다.");
	}
}
