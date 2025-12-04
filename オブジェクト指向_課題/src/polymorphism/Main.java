package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Employee リストを作成
		List<Employee> employees = new ArrayList<>();

		// FullTimeEmployee と ContractEmployee を複数追加
		employees.add(new FullTimeEmployee("F001", "山田太郎"));
		employees.add(new FullTimeEmployee("F002", "山田一郎"));
		employees.add(new ContractEmployee("C001", "山田二郎"));
		employees.add(new ContractEmployee("C002", "山田三郎"));

		// forループで給料を計算・出力
		for (Employee emp : employees) {
			int wage = emp.calculateDailyWage(9); // 9時間勤務
			System.out.println(emp.name + "の給与:" + wage + "円");
		}
	}
}
