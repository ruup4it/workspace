package javaLec.ExException.ex07_PrintStackTrace;

public class PersonalInfo {
	String name;
	int age;

	public PersonalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showPersonalInfo() {
		System.out.println("이름 :" + name);
		System.out.println("나이 : " + age);
	}
}
