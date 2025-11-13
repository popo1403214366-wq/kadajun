package curriculum_B;

public class Main {

	public static void main(String[] args) {
//		Q4 Greetingクラスのインスタンスを作成
		Greeting greeting = new Greeting();
		greeting.sayHello();
//Q5
		// Animalクラスのインスタンスを作成
		Animal animal = new Animal();

		// setterを使って値を設定
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		// getterを使って出力
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}
