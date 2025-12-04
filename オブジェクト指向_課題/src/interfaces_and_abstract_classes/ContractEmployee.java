package interfaces_and_abstract_classes;

//EmployeeクラスをContractEmployeeクラスに継承
public class ContractEmployee extends Employee {
	//1000円を定数として定義
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public ContractEmployee(String getId, String getName) {
		super(getId, getName);
	}

	//親クラスに返す計算メソッド
	@Override
	public int costForDay(int hoursWorked) {
		return hoursWorked * HOURLY_RATE; // 
	}
}
