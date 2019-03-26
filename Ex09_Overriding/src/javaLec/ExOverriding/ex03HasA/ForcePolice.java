package javaLec.ExOverriding.ex03HasA;

public class ForcePolice extends Police {
	Gun pistol;
	int handcuff;

	ForcePolice(String hat, String cloth, int bnum, int bcuff) {
		super(hat, cloth);
		if (bnum > 0)
			this.pistol = new Gun(bnum);
		this.handcuff = bcuff;
	}

	void shot() {
		if (pistol != null)
			pistol.shot();
		else
			System.out.println("Hut BBANG!");
	}

	void putHandcuff() {
		System.out.println("SNAP!");
		handcuff--;
	}

}
