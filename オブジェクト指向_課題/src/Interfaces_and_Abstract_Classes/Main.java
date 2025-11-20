package Interfaces_and_Abstract_Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Billable リストを作成
		List<Billable> employees = new ArrayList<>();

		// 正社員と契約社員を複数追加
		employees.add(new FullTimeEmployee("F001", "山田太郎"));
		employees.add(new FullTimeEmployee("F002", "山田一郎"));
		employees.add(new ContractEmployee("C001", "山田二郎"));
		employees.add(new ContractEmployee("C002", "山田三郎"));

		// for-each ループで日給を計算・出力
		for (Billable emp : employees) {
			int dailyWage = emp.costForDay(9); // 9時間
			// 名前を表示する
			String name = ((Employee) emp).getName();
			System.out.println(name + "の給与:" + dailyWage + "円");
		}
	}
}
