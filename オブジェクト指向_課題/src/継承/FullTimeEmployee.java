package 継承;

//EmployeeクラスをFullTimeEmployeeクラスに継承
public class FullTimeEmployee extends Employee {
	//1200円を定数として定義
	private static final int HOURLY_RATE = 1200;

	// コンストラクタ
	public FullTimeEmployee(String employeeId, String name) {
		super(employeeId, name);// 親クラスのメソッドを呼ぶ
	}
	//親クラスに返す計算メソッド
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int Hours = Math.min(hoursWorked, 8); // 基本は8時間まで
		int overHours = Math.max(hoursWorked - 8, 0); // 残業時間
		double overRate = 1.25; // 残業は時給1.25倍
		//計算
		int wage = (int)(Hours * HOURLY_RATE + overHours * HOURLY_RATE * overRate);
		//計算結果を返す
		return wage;
	}
}
