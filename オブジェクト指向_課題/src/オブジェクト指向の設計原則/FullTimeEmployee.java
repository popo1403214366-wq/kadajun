package オブジェクト指向の設計原則;

//抽象クラスFullTimeEmployeeにPayableを実装する

public class FullTimeEmployee implements Payable {
	private String name;
	private int hours;

	// nameとhoursをコンストラクタ
	public FullTimeEmployee(String name, int hours) {
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
		int hourlyRate = 1200;
		return hours * hourlyRate;
	}
}
