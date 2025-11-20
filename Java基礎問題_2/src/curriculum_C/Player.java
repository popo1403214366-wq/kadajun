package curriculum_C;

public class Player {

	// Playerの手をセットする
	private int hand; //playerの手

	public void setHand(int hand) {
		this.hand = hand;
	}

	// Playerの手を取得する
	public int getHand() {
		return hand;
	}

	// Playerの手を文字列で返す
	public String getHandName() {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return ""; // 0～2以外
		}
	}
}
