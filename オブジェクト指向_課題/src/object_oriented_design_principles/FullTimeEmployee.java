package object_oriented_design_principles;

//抽象クラスFullTimeEmployeeにPayableを実装する

public class FullTimeEmployee implements Payable {
	private String name;
	//時給１２００円の定数
	private static final int HOURLYRATE = 1200;

	// nameとhoursをコンストラクタ
	public FullTimeEmployee(String name) {
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
	public int calculateSalary(int hourWorked) {
		return hourWorked * HOURLYRATE;
	}
}
