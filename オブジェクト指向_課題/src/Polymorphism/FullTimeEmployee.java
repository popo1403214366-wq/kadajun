package Polymorphism;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name); // 親クラスのコンストラクタ呼び出し
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;

		return (regularHours * hourlyRate)
				+ (int) (overtime * hourlyRate * 1.25);
	}
}