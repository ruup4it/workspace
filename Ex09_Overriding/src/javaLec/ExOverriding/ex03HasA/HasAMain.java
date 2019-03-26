package javaLec.ExOverriding.ex03HasA;

public class HasAMain {
	public static void main(String[] args) {
		ForcePolice fman = 
				new ForcePolice("No Hat", "Black Jacket", 10, 3);
		fman.putOnCloth();
		fman.shot();
		fman.putHandcuff();
		
		NursingPolice nurse = 
				new NursingPolice("White Hat", 
						"White Uniform", 3);
		nurse.putOnCloth();
		nurse.calcThermometer();
	}
}







