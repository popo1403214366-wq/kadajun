package インターフェイスと抽象クラス;

public abstract class Employee implements Billable {
	protected String id;
	protected String name;

	// コンストラクタで初期化
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// costForDay はサブクラスでオーバーライドする
}
