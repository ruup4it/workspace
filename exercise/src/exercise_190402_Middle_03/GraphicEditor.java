package exercise_190402_Middle_03;

import java.util.ArrayList;
import java.util.Arrays;

//3. main() 함수를 다음과 같이 수행할 수 있도록 GraphicObject를 상속받는 Rect와 Line을 
//작성하고, GraphicEditor클래스에 필요한 메서드 add()와 draw()를 작성하여 완성하라


public class GraphicEditor{
	ArrayList<GraphicObject> aList = new ArrayList<GraphicObject>();
	void add(GraphicObject obj){
		aList.add(obj);
		draw();
	}	
	void draw(){
		aList.get(aList.size()-1).view();
	}
	public static void main(String[] args){
		GraphicEditor g = new GraphicEditor();
		g.add(new Rect(2, 2, 3, 4));		
		g.add(new Line(3, 3, 8, 8));
		g.add(new Line(2, 5, 6, 6));
	}
}
//
//<출력결과>
//2,2 -> 3,4의 사각형
//3,3 -> 8,8의 선
//2,5 -> 6,6의 선
