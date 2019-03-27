package javaLec.ExAbstract.ex02AbstractEmployee;

public class TempEmployee extends Employee {

	private int hireYear;

	public TempEmployee(String empno, String name, int pay, int hireYear) {
		super(empno, name, pay);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		double mPay = pay / (double) 12 ;
		return mPay;
	}

}
