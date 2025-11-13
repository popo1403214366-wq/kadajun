package インターフェイスと抽象クラス;

//EmployeeクラスをContractEmployeeクラスに継承
public class ContractEmployee extends Employee {
	//1000円を定数として定義
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	//親クラスに返す計算メソッド
	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * HOURLY_RATE; // 
	}
}
