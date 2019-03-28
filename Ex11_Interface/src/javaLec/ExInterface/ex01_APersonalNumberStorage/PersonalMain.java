package javaLec.ExInterface.ex01_APersonalNumberStorage;

public class PersonalMain {
	public static void main(String[] args) {
		PersonalNumberStorageImpl storage = new PersonalNumberStorageImpl(100);
		APersonalNumberStorage sto = storage;

		storage.addPersonalInfo("홍길동", "112211-332255");
		storage.addPersonalInfo("임꺽정", "332211-775555");
		System.out.println(sto.searchName("112211-332255"));
		System.out.println(sto.searchName("332211-775555"));

	}
}
