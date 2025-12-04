package interfaces_and_abstract_classes;

public abstract class Employee implements Billable {
	protected String id;
	protected String name;

	// コンストラクタで初期化
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
}