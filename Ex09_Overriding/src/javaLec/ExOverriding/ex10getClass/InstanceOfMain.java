package javaLec.ExOverriding.ex10getClass;

class Box{
	void simpleWrap() {
		System.out.println("simple wrap");
	}
}
class PaperBox extends Box{
	void paperWrap() {
		System.out.println("paper wrap");
	}
}
class GoldPaperBox extends PaperBox{
	void goldWrap() {
		System.out.println("gold wrap");
	}
}


/*instanceOf는 순서를 지켜야 한다
 * 아래 방식은 정확히 자신이 만들어진 클래스 정보를
 * 매칭하여 확인하므로 정확하게 구별할 수 있다*/
public class InstanceOfMain {
	static void wrapBox(Box box) {
		Object classObj = box.getClass();
		if(classObj.equals(Box.class))
			box.simpleWrap();
		if(classObj.equals(PaperBox.class))
			((PaperBox)box).paperWrap();
		if(classObj.equals(GoldPaperBox.class))
			((GoldPaperBox)box).goldWrap();
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









