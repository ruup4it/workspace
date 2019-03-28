package javaLec.ExInterface.ex02_IPersonalNumberStorage;

/* 100% 추상 메서드를 가진 추상 클래스는
 * Interface와 동일하다
 * */
// 추상클래스 
//public abstract class IPersonalNumberStorage {
//	public abstract void addPersonalInfo(String name, String perNum); // 정보 추가 추상 메서드
//	public abstract String searchName(String perNum); // 이름찾기 추상 메서드
//}

// 인터페이스의 메서드는 자동으로 public abstract 가 부여된다.
// 인터페이스의 메서드는 자동으로 public static final이 부여된다.
interface IPersonalNumberStorage {
	// 정보 추가 추상 메서드 = public abstract void addPersonalInfo(String name, String
	// perNum);
	void addPersonalInfo(String name, String perNum);

	// 이름찾기 추상 메서드 = public abstract String searchName(String perNum);
	String searchName(String perNum);
}
