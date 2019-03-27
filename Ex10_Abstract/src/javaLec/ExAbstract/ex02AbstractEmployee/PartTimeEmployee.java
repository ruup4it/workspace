package javaLec.ExAbstract.ex02AbstractEmployee;

public class PartTimeEmployee extends Employee {
	int workDay;

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		double mPay = pay * workDay;
		return mPay;
	}

}
