package exercise_190403;
//2. 하나의 학생정보는 Student클래스로 표현한다. Student클래스에는

//이름, 학과, 학번, 학점 평균을 나타내는 필드가 있다. 여기서 학번을
//String타입으로 선언한다.
//키보드에서 학생 정보를 5개 입력받아 학번을 '키'로 하여 
//HashMap<String, Student>에 저장하고 학번으로 학생 정보를 검색하여
//출력하는 프로그램을 작성하라.
//다음과 같은 해시맵을 이용하라
//HashMap<String, Student> dept = new HashMap<String, Student>();

//1) Student를 만들고 이름, 학과, 학번, 학점 평균 o
//2) 메인 :HashMap<String, Student> dept = new HashMap<String, Student>(); o
// 3) 5명 입력받고 o
//4) 검색할 학번 입력받고
//5 ) 해당 값 출력
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	Scanner scan = new Scanner(System.in);
	String name; // 이름
	String department; // 학과
	String studentNum; // 학번
	double scoreAvg; // 학점평균

	Student() {
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.print("학과를 입력하세요 : ");
		department = scan.nextLine();
		System.out.print("학번을 입력하세요 : ");
		studentNum = scan.nextLine();
		System.out.print("학점 평균을 입력하세요 : ");
		scoreAvg = scan.nextDouble();
		scan.nextLine();
	}

	public String getStudentNum() {
		return this.studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String toString() {
		return "=========================\n이름 : " + name + "\n" + "학과 : " + department + "\n" + "학번 : " + studentNum
				+ "\n" + "학점 평균 : " + scoreAvg;
	}
}

public class Middle_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 키, 밸류
		// 학번, 학생클래스
		HashMap<String, Student> dept = new HashMap<String, Student>();

		for (int i = 0; i < 2; i++) {
			Student st = new Student();
			dept.put(st.getStudentNum(), st);
		}
		///////////////////////
		System.out.print("검색하실 학번을 입력하세요 : ");
		String search = scan.nextLine();
		//////////////

		Iterator<String> itr = dept.keySet().iterator(); // Iterator 생성

		while (itr.hasNext()) { // 값이 있다면
			String key = itr.next();
			if (search.equals(key)) {
				System.out.println(dept.get(key));
//				System.out.println("이름 : " + dept.get(key).name);
//				System.out.println("학과 : " + dept.get(key).department);
//				System.out.println("학번 : " + dept.get(key).studentNum);
//				System.out.println("학점평균 : " + dept.get(key).scoreAvg);
			}
		}
		scan.close();
	}
}
