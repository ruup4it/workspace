package javaLec.ExOverriding.ex03HasA;

public class NursingPolice extends Police {
	int thermometer;
	NursingPolice(String hat, String cloth, int tnum) {
		super(hat, cloth);
		thermometer = tnum; 
	}
	void calcThermometer() {
		System.out.println("check Temperature!");
		thermometer--;
	}
}


