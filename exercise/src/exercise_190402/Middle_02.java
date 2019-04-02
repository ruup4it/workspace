package exercise_190402;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//2. 하나의 학생 정보는 Student클래스로 표현한다. Student클래스에는 이름, 학과, 학번,
//학점 평균을 나타내는 필드가 있다. 키보드로 학생 정보를 5개 입력받아
//ArrayList<Student>에 저장한 후에 ArrayList<Student>의 모든 학생 정보를 출력하는 
//프로그램을 작성하라
class Student {
	Scanner scan = new Scanner(System.in);
	String name;
	String department;
	int studentNum;
	double scoreAvg;

	Student() {
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.print("학과를 입력하세요 : ");
		department = scan.nextLine();
		System.out.print("학번을 입력하세요 : ");
		studentNum = scan.nextInt();
		System.out.print("학점 평균을 입력하세요 : ");
		scoreAvg = scan.nextDouble();
		scan.nextLine();
	}

	public String toString() {
		return "=========================\n이름 : " + name + "\n" + "학과 : " + department + "\n" + "학번 : " + studentNum + "\n" + "학점 평균 : " + scoreAvg
				;
	}
}

public class Middle_02 {
	public static void main(String[] args) {
		ArrayList<Student> arrStudent = new ArrayList<Student>();
		// 입력
		for(int i = 0; i<3 ; i++) {
			arrStudent.add(new Student());
		}
		// 출력
		Iterator<Student> itr = arrStudent.iterator(); 
		while (itr.hasNext()) { // 값이 있다면
			System.out.println(itr.next());	// 찍어주기
		}
	}
}
