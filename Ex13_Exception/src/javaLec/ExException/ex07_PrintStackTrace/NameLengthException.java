package javaLec.ExException.ex07_PrintStackTrace;

public class NameLengthException extends Exception {
	String wrongName;

	public NameLengthException(String name) {
		super("잘못된 이름이 삽입되었습니다");
		wrongName = name;
	}

	public void showWrongName() {
		System.out.println("잘못 입력된 이름: " + wrongName);
	}
}
