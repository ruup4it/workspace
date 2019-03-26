package javaLec.ExOverriding.ex09Array;

class Box{
	void wrap() {
		System.out.println("simple wrap");
	}
}
class PaperBox extends Box{
	void wrap() {
		System.out.println("paper wrap");
	}
}
class GoldPaperBox extends PaperBox{
	void wrap() {
		System.out.println("gold wrap");
	}
}
/* 부모참조변수에 담으면 좋은 점
 * : 매개변수를 최상위 부모변수로 메서드 1개만 만들면 된다
 * Overriding이 좋은점
 * : 비록 부모참조변수에는 담았지만 Overring되어진 메서드는
 * 객체에 구현된 메서드가 알아서 호출된다. 
 * */
public class InstanceOfMain {
	static void wrapBox(Box[] boxs) {
		for(Box box : boxs)
			box.wrap();
	}
	public static void main(String[] args) {
		Box[] boxs = new Box[] {
			new Box(),
			new PaperBox(),
			new GoldPaperBox()
		};
		wrapBox(boxs);
	}
}









