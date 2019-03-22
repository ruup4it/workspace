/* 학생을 아침에 일어나서 준비하고 공부하다 가는 일과를 클래스로 만드세요*/
class Student {
	int tiredness = 0;
	String clean = "";
	
	// 생성자
	Student(){
		
	}

	public void sleep() {
		tiredness -= 60;
		System.out.println(String.format("잠들기 피곤도: %d", tiredness));
	}

	public void drinkBeer() {
		tiredness -= 30;
		System.out.println(String.format("맥주마시기 피곤도: %d", tiredness));
	}

	public void groupStudy() {
		tiredness += 20;
		System.out.println(String.format("스터디하기 피곤도: %d", tiredness));
	}

	public void doHomework() {
		tiredness += 20;
		
		System.out.println(String.format("과제하기 피곤도: %d", tiredness));
	}

	public void haveLunch() {
		System.out.println(String.format("커피사오기 피곤도: %d", tiredness));
		
	}

	public void takeAClass() {
		tiredness += 30;
		System.out.println(String.format("수업듣기 피곤도: %d", tiredness));
	}

	public void drinkCoffee() {
		tiredness -= 3;
		System.out.println(String.format("커피 마시기 피곤도: %d", tiredness));
	}

	public void wash() {
		clean ="깨끗";
		System.out.println(String.format("씻기 청결도: %s", clean));
	}

	public void smoking() {
		tiredness -= 10;
		System.out.println(String.format("바람쐬기 피곤도: %d", tiredness));
	}

	public void wakeUp() {
		tiredness += 10;
		System.out.println(String.format("일어났다 피곤도: %d", tiredness));
	}
	
	
	
}

public class _06_Student {
	public static void main(String[] args) {
		Student st = new Student();
		// 일어나기
		st.wakeUp();
		// 릴 찌기
		st.smoking();
		// 씻기
		st.wash();
		// 버스타기
		st.takeAClass();
		// 커피 사기
		st.drinkCoffee();
		// 수업듣기
		st.takeAClass();
		// 점심먹기
		st.haveLunch();
		// 과제하기
		st.doHomework();
		// 스터디하기
		st.groupStudy();
		// 맥주 마시기
		st.drinkBeer();
		// 잠자기
		st.sleep();
	}
}
