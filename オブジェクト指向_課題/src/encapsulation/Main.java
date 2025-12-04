package encapsulation;

public class Main {

	public static void main(String[] args) {
		// Employeeクラスのインスタンスを生成
		Employee emp = new Employee();

		// setterで値を設定
		emp.setEmployeeId("E002");
		emp.setName("田中花子");

		// getterで値を取得して出力
		System.out.println("社員ID:" + emp.getEmployeeId() + ",名前:" + emp.getName());
	}

}
