package Object_Oriented_Design_Principles;

//抽象クラスContractEmployeeにPayableを実装する
public class ContractEmployee implements Payable {
	private String name;
	//時給１０００円の定数
	private static final int hourlyRate = 1000;

	// nameとhoursをコンストラクタ
	public ContractEmployee(String name) {
		this.name = name;

	}

	//計算ロジックを分離
	//親クラスに返すメソッド
	@Override
	public String getName() {
		return name;
	}

	//親クラスに返す計算メソッド
	@Override
	public int calculateSalary(int hour) {
		return hour * hourlyRate;
	}
}
