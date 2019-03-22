package javaLec._class.ex11Static;

class StudyClass {
	static int schoolNum = 0;	// �б� ��ü �л� ��
	int cNum=0;					// �ش� �� �л� �� 
	String className;			// �ش� �� �̸�
	

	StudyClass(String cName, int num) {
		className = cName;
		cNum = num;
		schoolNum += num;
	}
	
	void showStudyClassInfo() {
		System.out.println(String.format("%s �л� �� : %d ��",className,cNum));
	}
	
	static void showSchoolInfo() {
		System.out.println(String.format("�� �л� �� : %d ��", schoolNum));
	}
}

public class School {
	public static void main(String[] args) {
		StudyClass studyClassA = new StudyClass("A��",6);
		StudyClass studyClassB = new StudyClass("B��",12);
		studyClassA.showStudyClassInfo();
		studyClassB.showStudyClassInfo();
		StudyClass.showSchoolInfo();
	}

}
