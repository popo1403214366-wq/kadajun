package ポリモーフィズム;

//抽象クラス Employeeでemployeeidとnameをフィールドとして定義
abstract class Employee {
	protected String employeeid;
	protected String name;

	// コンストラクタ（employeeidとnameを初期化）
	public Employee(String id, String name) {
		this.employeeid = id;
		this.name = name;
	}

	// 抽象メソッド（勤務時間を受け取って日給を計算）
	public abstract int calculateDailyWage(int hoursWorked);
}
//EmployeeクラスをFullTimeEmployeeクラスに継承
class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String id, String name) {
		super(id, name);// 親クラスのメソッドを呼ぶ
	}
	//親クラスに返す計算メソッド
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}
}
//EmployeeクラスをContractEmployeeクラスに継承
class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);// 親クラスのメソッドを呼ぶ
	}
	//親クラスに返す計算メソッド
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}
