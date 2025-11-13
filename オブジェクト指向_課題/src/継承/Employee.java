package 継承;

public abstract class Employee {
	private String employeeId;
	private String name;

	// コンストラクタ
	public Employee(String Id, String name) {
		this.employeeId = Id;
		this.name = name;
	}

	//employeeIdのgetter
	public String getEmployeeId() {
		return this.employeeId;
	}
	//nameのgetter
	public String getName() {
		return this.name;
	}

	// 抽象メソッド（残業計算をサブクラスで実装する）
	public abstract int calculateDailyWage(int hoursWorked);
}
