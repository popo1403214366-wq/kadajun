package curriculum_B;

public class Question5 {
//Q1 helloWorldメソッドの定義（Hello, World!と表示するメソッド）
	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

//Q2 doubleValueメソッド （引数の2倍の値を戻り値にして表示するメソッド）
	public static int doubleValue(int num) {
		int result = num * 2;
		System.out.println(num + "を2倍すると" + result + "です。");
		return result;
	}
//Q3 isEvenメソッド （奇数、偶数によってtrue,falseを返すメソッド）
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {

//Q1	helloWorldメソッドを呼び出す
		helloWorld();

//Q2	メソッドを呼び出して
		doubleValue(10);

//Q3	        		
		int num1 = 7;
		int num2 = 10;

		//num1の判定表示
		if (isEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else {
			System.out.println(num1 + "は奇数です。");
		}

		//num2の判定表示

		if (isEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		} else {
			System.out.println(num2 + "は奇数です。");
		}
//Q4		
		// Greetingクラスのインスタンスを作成
		Greeting greeting = new Greeting();

		// インスタンスを使ってsayHelloメソッドを呼び出す
		greeting.sayHello();

		
		
		
		

	}

}
