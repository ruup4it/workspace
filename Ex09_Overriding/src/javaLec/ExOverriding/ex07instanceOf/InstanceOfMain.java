package javaLec.ExOverriding.ex07instanceOf;

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


/*instanceof는 해당 클래스로 변환이 가능하냐
 * 해당 클래스이거나 상속을 받았는냐
 * 해당하면 true, 아니면 fasle*/
/*상속계층에서 가장 자식부터 검사해야만 한다*/
public class InstanceOfMain {
	static void wrapBox(Box box) {
		if(box instanceof GoldPaperBox)
			((GoldPaperBox)box).goldWrap();
		else if(box instanceof PaperBox)
			((PaperBox)box).paperWrap();
		else if(box instanceof Box)
			box.simpleWrap();
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









