package javaLec.ExOverriding.ex03HasA;

public class Gun {
	private int bullet;
	Gun(){
		bullet = 0;
	}
	Gun(int bnum){
		bullet = bnum;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bnum) {
		this.bullet = bnum;
	}
	void shot() {
		System.out.println("BBANG!");
		bullet--;
	}
}



