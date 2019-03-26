package javaLec.ExOverriding.ex02HasAExtends;

public class NursingPolice extends Police {
	int thermometer; // 체온계 개수

	NursingPolice(int bnum, int bcuff, int tnum) {
		super(bnum, bcuff);
		this.thermometer = tnum;
	}

	void calcThermometer() {
		System.out.println("36.5℃");
		thermometer--;
	}
}
