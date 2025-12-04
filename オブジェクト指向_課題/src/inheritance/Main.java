package inheritance;

public class Main {

	public static void main(String[] args) {
		// 正社員の出力
		FullTimeEmployee fullTime = new FullTimeEmployee("F001", "山田太郎");
		int fullTimeWage = fullTime.calculateDailyWage(9); // 9時間
		System.out.println("正社員の給与: " + fullTimeWage + " 円");

		// パート社員の出力
		PartTimeEmployee partTime = new PartTimeEmployee("P001", "佐藤花子");
		int partTimeWage = partTime.calculateDailyWage(9); // 9時間
		System.out.println("パート社員の給与: " + partTimeWage + " 円");
	}

}
