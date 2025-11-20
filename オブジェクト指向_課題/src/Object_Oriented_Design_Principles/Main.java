package Object_Oriented_Design_Principles;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//インターフェース型のPayableのリストを作成
		List<Payable> employees = new ArrayList<>();
		//リストに追加
		employees.add(new FullTimeEmployee("山田太郎"));
		employees.add(new ContractEmployee("山田一郎"));
		employees.add(new FullTimeEmployee("山田次郎"));
		//SalaryReporterのインスタンス
		SalaryReporter reporter = new SalaryReporter();
		reporter.report(employees);
	}
}
