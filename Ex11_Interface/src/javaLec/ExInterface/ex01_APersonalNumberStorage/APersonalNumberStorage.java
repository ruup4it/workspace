package javaLec.ExInterface.ex01_APersonalNumberStorage;

/* 100% 추상 메서드를 가진 추상 클래스는
 * Interface와 동일하다
 * */
// 추상클래스 
public abstract class APersonalNumberStorage {
	// 정보 추가 추상 메서드
	public abstract void addPersonalInfo(String name, String perNum);

	// 이름찾기 추상 메서드
	public abstract String searchName(String perNum);
}
