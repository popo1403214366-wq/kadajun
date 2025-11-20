package Polymorphism;

public class ContractEmployee extends Employee {
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000; // 契約社員用の時給（例）
		return hoursWorked * hourlyRate;
	}
}