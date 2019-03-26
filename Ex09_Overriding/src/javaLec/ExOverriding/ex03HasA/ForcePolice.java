package javaLec.ExOverriding.ex03HasA;

public class ForcePolice extends Police {
	Gun pistol = new Gun();	// 필드로 객체가 존재하는 것(포함관계)
	int handcuff;
	ForcePolice(String hat, String cloth, int bnum, int bcuff) {
		super(hat, cloth);
		pistol.setBullet(bnum);
		this.handcuff = bcuff;
	}
	void shot() {
		if(pistol.getBullet() > 0)
			pistol.shot();
		else
			System.out.println("Hut BBANG!");
	}
	void putHandcuff() {
		System.out.println("SNAP!");
		this.handcuff--;
	}

}
