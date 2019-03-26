package javaLec.ExOverriding.ex02HasAExtends;

public class Gun {
	int bullet;

	Gun(int bnum) {
		bullet = bnum;
	}

	void shot() {
		System.out.println("BBANG!");
		bullet--;
	}
}
