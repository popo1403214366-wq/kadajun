package curriculum_A;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		
//Q1	変数の宣言
		
		//-128～127の整数 byte
		byte byteNum;
		//-32,768～32,767の整数 short
		short shortNum;
		//-2,147,483,648～2,147,483,657の整数 int
		int intNum;
		//非常に大きな整数 long
		long longNum;
		//少数（精度が低い） float
		float floatNum;
		//少数（精度が高い double
		double doubleNum;
		//1つの文字（'A','あ'など）
		char letter;
		//複数の文字 String
		String letters;
		//trueまたはfalse boolean
		boolean isBoolean;
		
		
		
		
//Q2	変数の初期化
		
		//変数byteNumに10を代入
		byteNum = 10;		
		//変数shortNumに100を代入
		shortNum = 100;
		//変数intNumに1000を代入
		intNum = 1000;
		//変数longNumに10000を代入
		longNum = 10000;
		//変数floatNumに9.5fを代入
		floatNum = 9.5f;
		//変数doubleNumに10.5を代入
		doubleNum = 10.5;
		//変数letterに"a"を代入
		letter = 'a';
		//変数lettersに"ハロー"を代入
		letters = "ハロー";
		//変数isBooleanにtrueを代入
		isBoolean = true;
		
		
		
		
//Q3	値を代入した変数を用いて出力
		
		//変数を用いて右記を出力 11110
		System.out.println(longNum + intNum + shortNum + byteNum);
		//変数を用いて右記を出力 20
		System.out.println(byteNum + byteNum);
		//変数を用いて右記を出力(間に半角スペース入れる) a ハロー true
		System.out.println(letter + " " + letters + " " + isBoolean);
		//数字を全て足して右記を出力 11130
		System.out.println(longNum + intNum + shortNum + byteNum + byteNum + byteNum);
		//小数点以外の数字を全てかけて右記を出力 1E+30
		System.out.println(longNum * intNum * shortNum * byteNum * 1E+20);
		//10.5 割る100をして右記を出力 0.105
		System.out.println(doubleNum / 100);
		//10 引く100をして右記を出力 -90
		System.out.println(10 - 100);
		
		
		
		
//Q4    name という String型の変数を宣言
		String name;
		//変数に "山田太郎" という値を代入
		name = "山田太郎";
		//name変数を使用してコンソールに こんにちは、山田太郎さん! を出力
		System.out.println("こんにちは、" + name + "さん！");
		
//Q5	age という int型の変数 を宣言
		int age;
		//25 を代入
		age = 25;
		//age変数を使用してコンソールに  年齢: 25歳 を出力
		System.out.println("年齢:" + age + "歳");
		
		
		
		
//Q6	int型の変数 num1に10を代入
		int num1 = 10;
		//int型の変数 num2に5を代入
		int num2 = 5;
		//int型の変数,sumにnum1とnum2を足した数を代入
		int sum = num1 + num2;
		//コンソール出力 sum
		System.out.println(sum);
		
		
		
		
//Q7    int型の変数 scoreに80を代入
		int score = 80;
		//scoreに20を足す
		score = score + 20;
		//コンソール出力 score
		System.out.println("最終スコア:" + score);
		
		
		
		
//Q8	double型の変数 priceに99.99を代入
		double price = 99.99;
		//priceをint型のintpriceに変換
		int intprice = (int) price;
		//コンソール出力 intprice
		System.out.println("整数価格:" + intprice);

		
		
		
		
//Q9	String 型の変数 numStrに123を代入	
		String numStr = "123";
		//String 型の変数 numStr を int 型に変換
		int intnumStr = Integer.parseInt(numStr);
		//コンソール出力 intnumStr + 10
		System.out.println("変換後の値:" + (intnumStr + 10));
		
		
		
		
		
//Q10	int 型の変数 numに50を代入	
		int num = 50;
		//int 型の変数 numをString 型のstnumに変換
		String stnum = String.valueOf(num);
		//コンソール出力 stnum+ 10
		System.out.println("得点:" + stnum + "点");
		
		
		
		
		
//Q11	int 型の変数 a に 10 を代入
		int a = 10;
		//int 型の変数 b に 20 を代入
		int b = 20;
		//a が b より小さいかどうかを boolean 変数 result に代入
		boolean result = (a < b);
		//コンソール出力 result
		System.out.println(result);
		

		
		
//Q12   int 型の変数 x に 15 を代入
		int x = 15;
		//String型の変数okornoにxが10以上のときOK、そうでなければNGを代入
		String okorno =(x >= 10) ? "OK" : "NO";		
		//コンソール出力 okorno
		System.out.println(okorno);
		
		
		
		
//Q13	String型の変数textに"私はJavaが好きです。Javaは楽しい!"を代入
		String text = "私はJavaが好きです。Javaは楽しい!";
		//textの中からreplaceによってJavaをPythonに変えてString型の変数replacedTextに代入する
		String replacedText = text.replace("Java", "Python");
		//コンソール出力 replacedText
		System.out.println(replacedText);
		
//終了
		
	}

}
