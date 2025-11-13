package curriculum_C;

import java.util.Random;

public class CPU {
	private int hand;  //CPUの手
	private Random rand = new Random(); // 乱数を生成するためのインスタンス

	// CPUの手をランダムに決定する
	public void setRandomHand() {
		this.hand = rand.nextInt(3); // 0〜2のランダムな整数を取得
	}

	// CPUの手を取得する
	public int getHand() {
		return hand;
	}

	// CPUの手を文字列で返す
	public String getHandName() {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "不明";
		}
	}
}
