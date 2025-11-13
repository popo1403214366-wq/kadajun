package オブジェクト指向の設計原則;


	import java.util.List;

	public class SalaryReporter {
	    // Payable インターフェイスに依存し、出力
	    public void report(List<Payable> employees) {
	        for (Payable e : employees) {
	            System.out.println(e.getName() + "の給料は" + e.calculateSalary() + "円");
	        }
	    }
	}


