package javaLec.ExOverriding.ex06instanceOf;

/*클래스를 독립적으로 만들어서 객체의 메서드를 호출하려면
 * 매개변수가 다른 동일한 이름의 함수를 만든다
 * Overloading을 사용*/
class Box{
	void simpleWrap() {
		System.out.println("simple wrap");
	}
}
class PaperBox{
	void paperWrap() {
		System.out.println("paper wrap");
	}
}
class GoldPaperBox{
	void goldWrap() {
		System.out.println("gold wrap");
	}
}

public class InstanceOfMain {
	static void wrapBox(Box box) {
		box.simpleWrap();
	}
	static void wrapBox(PaperBox pBox) {
		pBox.paperWrap();
	}
	static void wrapBox(GoldPaperBox gpBox) {
		gpBox.goldWrap();
	}
	public static void main(String[] args) {
		Box box = new Box();
		PaperBox pBox = new PaperBox();
		GoldPaperBox gpBox = new GoldPaperBox();
		wrapBox(box);
		wrapBox(pBox);
		wrapBox(gpBox);
	}
}









