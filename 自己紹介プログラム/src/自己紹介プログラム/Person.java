package 自己紹介プログラム;

class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight; // ← 追加（問題4）
	static int count = 0; // 人数を数えるクラス変数

	// コンストラクタを定義しインスタンスフィールドに値をセット
	// 問題2: 引数付きコンストラクタを定義
	Person(String name, int age, double height, double weight) {
		// 各フィールドに値をセット（問題3）
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; // ← 追加（問題4）
		count++; //問題10 人数カウント
	}

	// 問題6：bmiメソッドの定義（戻り値：double）
	double bmi() {
		//問題7　BMIの計算はweight/height^2
		return this.weight / (this.height * this.height);
	}

	// 問題8：printメソッド（戻り値はvoid）
	void print() {
		//問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "歳です");
		System.out.println( ("BMIは" + ( String.format("%.2f", this.bmi()) + "です")));//有効数字は小数点第2位まで
		System.out.println("合計" + this.count + "人です"); // 問題10 合計人数を出力するメソッド

	}
}
