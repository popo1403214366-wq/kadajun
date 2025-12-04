package curriculum_C;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);//入力を受け取るためのScanner
		Player player = new Player();//Playerのインスタンス作成
		CPU cpu = new CPU(); //CPUのインスタンス作成

		while (true) {
			System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
			int playerHand = scanner.nextInt(); // playrの出した手をplayerhandに(後から勝敗判定に使うため)
			//入力チェック（0～2以外ならやり直し)
			if (playerHand < 0 || playerHand > 2) {
				System.out.println("0～2の数字を入力してください！");
				continue; // ループの先頭に戻る
			}
			// プレイヤーとCPUの手を設定
			player.setHand(playerHand);// Playerからメソッド呼び出し
			cpu.setRandomHand(); // CPUからメソッド呼び出し
			// それぞれの手を出力
			System.out.println("あなたの手:" + player.getHandName());
			System.out.println("CPUの手:" + cpu.getHandName());
			//勝敗判定
			// Player vs CPUで勝ちは：グー vs チョキ、チョキ vs パー、パー vs グー
			if (((player.getHand() == 0 && cpu.getHand() == 1) ||
					(player.getHand() == 1 && cpu.getHand() == 2) ||
					(player.getHand() == 2 && cpu.getHand() == 0))) {
				System.out.println("あなたの勝ち！");
				break; // 勝ったら終了
			}

			else if (player.getHand() == cpu.getHand()) {
				System.out.println("あいこです！");
			}
			// それ以外は負け
			else {
				System.out.println("あなたの負け！");
			}

		}
		scanner.close();

	}
}
