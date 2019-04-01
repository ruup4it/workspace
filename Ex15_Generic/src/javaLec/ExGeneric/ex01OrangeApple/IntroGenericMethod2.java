package javaLec.ExGeneric.ex01OrangeApple;

class CCC {
	public String toString() {
		return "Class CCC";
	}
}

class DDD {
	public String toString() {
		return "Class DDD";
	}
}

class InstanceTypeShower2 {
	
	public <T,U> void showInstType2(T inst1,U inst2 ) {
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

public class IntroGenericMethod2 {
	public static void main(String[] args) {
		InstanceTypeShower2 its = new InstanceTypeShower2();
		CCC ccc = new CCC();
		DDD ddd = new DDD();
		its.<CCC,DDD>showInstType2(ccc,ddd);
	}
}
