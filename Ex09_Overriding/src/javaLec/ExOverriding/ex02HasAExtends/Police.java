package javaLec.ExOverriding.ex02HasAExtends;

public class Police extends Gun {
	int handcuffs; // 수갑의 개수

	Police(int bnum, int bcuff) {
		super(bnum);
		this.handcuffs = bcuff;
	}

	void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
}
