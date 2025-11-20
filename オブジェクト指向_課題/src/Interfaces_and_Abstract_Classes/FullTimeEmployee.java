package Interfaces_and_Abstract_Classes;

//EmployeeクラスをFullTimeEmployeeクラスに継承
public class FullTimeEmployee extends Employee {
	//1250円を定数として定義
	private static final int HOURLY_RATE = 1250;

	// コンストラクタ
	public FullTimeEmployee(String getId, String getName) {
		super(getId, getName);
	}

	//親クラスに返す計算メソッド
	@Override
	public int costForDay(int hoursWorked) {
		int regularHours = Math.min(hoursWorked, 8);
		int overtimeHours = Math.max(hoursWorked - 8, 0);
		double overtimeRate = 1.25; // 残業1.25倍
		return (int) (regularHours * HOURLY_RATE + overtimeHours * HOURLY_RATE * overtimeRate);
	}
}
