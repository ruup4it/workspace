package javaLec.ExInterface.ex01_APersonalNumberStorage;

public class PersonalNumberStorageImpl extends APersonalNumberStorage {

	PersonalNumInfo[] perArr;
	int numOfPerInfo;

	PersonalNumberStorageImpl(int sz) {
		perArr = new PersonalNumInfo[sz];
		numOfPerInfo = 0;
	}

	@Override
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;
	}

	@Override
	public String searchName(String perNum) {
		for (int i = 0; i < numOfPerInfo; i++) {
			if (perNum.compareTo(perArr[i].getNumber()) == 0)
				return perArr[i].getName();
		}
		return null;
	}
}
