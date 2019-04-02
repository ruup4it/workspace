package exercise_190402_Middle_03;

abstract class GraphicObject{
	int x, y, w, h;
	GraphicObject(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public abstract void view();
}