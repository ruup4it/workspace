﻿package exercise_190320;

/*2. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의합니다
생성과 동시에 초기화가 가능한 생성자도 정의합니다
밑변과 높이 정보를 변경시킬 수 있는 메소드를 정의합니다
삼각형의 넓이를 계산해서 반환하는 메소드도 정의합니다
객체를 만들어서 사용해보세요*/
class Triangle{
	int bottom;
	int height;
	
	Triangle(){
		bottom = 10;
		height = 20;
	}
	
	void setTriangle(int bottom, int height){
		this.bottom = bottom;
		this.height = height;
	}
	
	int calcArea() {
		return bottom*height/2;
	}
}
public class Basic_02 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.setTriangle(500,20);
		System.out.println(triangle.calcArea());
	}
	
}
