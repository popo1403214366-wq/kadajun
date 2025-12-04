package basic_concepts;

public class Main {

	public static void main(String[] args) {

		// Employeeクラスのインスタンスを生成
		Employee employee = new Employee();

		// nameに山田太郎を設定
		employee.name = "山田太郎";

		// workメソッドを呼び出す
		employee.work();

	}

}
