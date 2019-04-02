package exercise_190402_Middle_03;

public class Rect extends GraphicObject {

	Rect(int x, int y, int w, int h) {
		super(x, y, w, h);

	}

	@Override
	public void view() {
		System.out.println(x + "," + y + " -> " + w + "," + h + "의 선");

	}

}
