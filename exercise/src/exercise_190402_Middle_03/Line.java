package exercise_190402_Middle_03;

public class Line extends GraphicObject {

	Line(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void view() {
		System.out.println(x + "," + y + " -> " + w + "," + h + "의 사각형");
	}

}
