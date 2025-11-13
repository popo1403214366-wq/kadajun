package オブジェクト指向の設計原則;

//抽象クラスContractEmployeeにPayableを実装する
public class ContractEmployee implements Payable {
	private String name;
	private int hours;

	// nameとhoursをコンストラクタ
	public ContractEmployee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
	//計算ロジックを分離
	//親クラスに返すメソッド
	@Override
	public String getName() {
		return name;
	}

	//親クラスに返す計算メソッド
	@Override
	public int calculateSalary() {
		int hourlyRate = 1000;
		return hours * hourlyRate;
	}
}
