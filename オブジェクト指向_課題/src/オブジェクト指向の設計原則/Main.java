package オブジェクト指向の設計原則;


	import java.util.ArrayList;
import java.util.List;

	public class Main {
	    public static void main(String[] args) {
	    	//インターフェース型のPayableのリストを作成
	        List<Payable> employees = new ArrayList<>();
//リストに追加
	        employees.add(new FullTimeEmployee("山田太郎", 7));
	        employees.add(new ContractEmployee("山田一郎", 8));
	        employees.add(new FullTimeEmployee("山田次郎", 9));
//SalaryReporterのインスタンス
	        SalaryReporter reporter = new SalaryReporter();
	        reporter.report(employees);
	    }
	}


