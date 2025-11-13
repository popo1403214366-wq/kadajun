package curriculum_B;

public class Animal {
	// フィールド
	private String name; // 動物名
	private double length; // 体長
	private int speed; // 速度

	// setterで値を設定する
	public void setName(String name) {
		// thisは自分自身のインスタンス
		this.name = name; 
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//getterで値を取得するして返す
	public String getName() {
		return this.name;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}
}