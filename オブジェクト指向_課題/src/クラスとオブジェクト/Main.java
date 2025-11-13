package クラスとオブジェクト;

public class Main {

	public static void main(String[] args) {
		// Employeeクラスのインスタンスを生成
		Employee employee = new Employee();

		// フィールドに値を設定
		employee.employeeId = "E001";
		employee.name = "佐藤太郎";

		// showInfoメソッドを呼び出す
		employee.showInfo();
	}

}
