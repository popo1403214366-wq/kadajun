package Encapsulation;

public class Employee {

	// フィールド
	private String employeeId;
	private String name;

	// employeeIdのsetter
	public void setEmployeeId(String id) {
		this.employeeId = id; // thisでフィールドに代入
	}

	// employeeIdのgetter
	public String getEmployeeId() {
		return this.employeeId;
	}

	// nameのsetter
	public void setName(String name) {
		this.name = name;
	}

	// nameのgetter
	public String getName() {
		return this.name;
	}
}
