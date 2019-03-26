package javaLec.ExOverriding.ex02HasAExtends;

public class HasAExtendsMain {

	public static void main(String[] args) {
		Police forceMan = new Police(5,3);
		forceMan.shot();
		forceMan.putHandcuff();
		
		NursingPolice angelGirl = new NursingPolice(10, 5, 3);
		angelGirl.calcThermometer();
		angelGirl.putHandcuff();
		angelGirl.shot();
		
	}

}
