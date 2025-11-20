package Polymorphism;

//抽象クラス Employeeでemployeeidとnameをフィールドとして定義
abstract class Employee {
	protected String id;
	protected String name;

	// コンストラクタ（employeeidとnameを初期化）
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// 抽象メソッド（勤務時間を受け取って日給を計算）
	public abstract int calculateDailyWage(int hoursWorked);

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
