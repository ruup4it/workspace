package exercise_190329;

//4. 다음 main()메서드의 실행결과가 출력되도록 MyPoint클래스를 작성하세요
//   public static void main(String[] args){
//	MyPoint a = new MyPoint(3, 20);
//	System.out.println(a);
//   }

//  <출력결과>
//  MyPoint(3, 20)

//------------------------------------------------
//1) MyPoint 라는 클래스가 필요
//2) 이 클래스는 생성자를 가지고 있다.
//3) 생성자는 매개변수를 가지고있다.

//객체 자체를 바로 출력 : 해쉬코드
//MyPoint(3, 20)
//1) toString을 재정의 

//public String toString(){
//return "MyPoint(" +first + ", " +second +")";

class MyPoint {
	int first;
	int second;

	MyPoint(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		String result = "MyPoint(" + first + ", " + second + ")";
		return result;
	}

}

public class Basic_04 {
	public static void main(String[] args) {
		MyPoint a = new MyPoint(3, 20);
		System.out.println(a);
	}
}
