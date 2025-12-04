package object_oriented_design_principles;

import java.util.List;

public class SalaryReporter {
	// Payable インターフェイスに依存し、出力
	public void report(List<Payable> employees) {
		for (Payable e : employees) {
			int hour = 10;
			System.out.println(e.getName() + "の給料は" + e.calculateSalary(hour) + "円");
		}
	}
}
