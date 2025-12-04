package inheritance;

//EmployeeクラスをPartTimeEmployeeクラスに継承
public class PartTimeEmployee extends Employee {
	//1000円を定数として定義
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public PartTimeEmployee(String employeeId, String name) {
		super(employeeId, name);// 親クラスのメソッドを呼ぶ
	}

	//親クラスに返す計算メソッド
	@Override
	public int calculateDailyWage(int hoursWorked) {
		//;計算して返す
		return hoursWorked * HOURLY_RATE;
	}
}
