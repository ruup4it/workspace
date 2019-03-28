package exercise_190328_Middle_01;

import java.util.Random;

public class CarMain {
	public static void main(String[] args) {
		HyundaiCar hCar = new HyundaiCar();

		CarTestManager carTm = new CarTestManager(hCar);
		ICar[] cars = new ICar[] { hCar, new KiaCar(), new ToyotaCar() };
		String[] company = new String[] { "HyundaiCar", "KiaCar", "ToyotaCar" };
		int temp = 0;
		for (ICar car : cars) {
			System.out.println(company[temp] + "회사\n");
			carTm.setCar(car);
			carTm.engineTest();
			carTm.speedUpTest();
			carTm.speedDownTest();
			carTm.breakTest();
			System.out.println("--------------------");
			temp++;
		}

		Random rand = new Random();
		int sel = rand.nextInt(3);
		if (sel == 0)
			System.out.println("HyundaiCar를 선택");
		else if (sel == 1)
			System.out.println("KiaCar를 선택");
		else {
			System.out.println("ToyotaCar를 선택");
		}

	}
}
