package javaLec._class.ex11Static;

class StudyClass {
	static int schoolNum = 0;	// 학교 전체 학생 수
	int cNum=0;					// 해당 반 학생 수 
	String className;			// 해당 반 이름
	

	StudyClass(String cName, int num) {
		className = cName;
		cNum = num;
		schoolNum += num;
	}
	
	void showStudyClassInfo() {
		System.out.println(String.format("%s 학생 수 : %d 명",className,cNum));
	}
	
	static void showSchoolInfo() {
		System.out.println(String.format("총 학생 수 : %d 명", schoolNum));
	}
}

public class School {
	public static void main(String[] args) {
		StudyClass studyClassA = new StudyClass("A반",6);
		StudyClass studyClassB = new StudyClass("B반",12);
		studyClassA.showStudyClassInfo();
		studyClassB.showStudyClassInfo();
		StudyClass.showSchoolInfo();
	}

}
