package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {

	//Daemon のステータスをテキストファイルから読み込むメソッド
	public static Character loadDaemon(String filename) throws IOException {
		//ファイルを1行ずつ読み込む
		BufferedReader bufferreader = new BufferedReader(new FileReader(filename));

		//daemon_status.txt の 1行目〜4行目を読み込む
		String name = bufferreader.readLine(); // 1行目：名前
		int hp = Integer.parseInt(bufferreader.readLine()); //2行目：HP
		int at = Integer.parseInt(bufferreader.readLine()); //3行目：AT
		int sp = Integer.parseInt(bufferreader.readLine()); //4行目：SP

		bufferreader.close(); //ファイルを閉じる

		//Character インスタンスとして返す
		return new Character(name, hp, at, sp);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();

		//プレイヤー名を入力
		System.out.print("プレイヤー名を入力してください：");
		String playerName = scanner.nextLine();
		scanner.close();
		//プレイヤーのステータスをランダムで生成
		Character player = new Character(
				playerName,
				1 + rand.nextInt(101), //HP:1～100
				1 + rand.nextInt(51), //AT:1～50
				1 + rand.nextInt(31) //SP:1～30
		);

		//Daemonの読み込み
		Character daemon;
		try {
			daemon = loadDaemon.loaddaemon("daemon_status.txt");
		} catch (IOException e) {
			System.out.println("Daemon ステータスを読み込めませんでした");
			return; //読み込めなければ終了
		}

		//バトルログのファイル書き込み準備
		try (PrintWriter log = new PrintWriter(new FileWriter("battle_log.txt"))) {

			log.println("バトル開始");
			log.println("Player: " + player);
			log.println("Daemon: " + daemon);
			log.println();

			Character attacker, defender;

			//先攻決定
			if (player.sp > daemon.sp) {
				attacker = player;
				defender = daemon;
			} else if (player.sp < daemon.sp) {
				attacker = daemon;
				defender = player;
			} else {
				//spが同じ場合はランダム
				if (rand.nextBoolean()) {
					attacker = player;
					defender = daemon;
				} else {
					attacker = daemon;
					defender = player;
				}
			}

			log.println("先攻は" + attacker.name);

			//バトル開始
			while (player.isAlive() && daemon.isAlive()) {

				//攻撃処理
				attacker.attack(defender);

				//ログに書き込み
				log.println(attacker.name + "の攻撃→" + defender.name + "のHP:" + defender.hp);

				//倒れたかどうか判定
				if (!defender.isAlive()) {
					log.println(defender.name + "は倒れた");
					break;
				}

				//攻撃者と防御者の交代（ターン交代）
				Character temp = attacker;
				attacker = defender;
				defender = temp;
			}

			log.println("終了");
			log.println("勝者: " + (player.isAlive() ? player.name : daemon.name));

			System.out.println("バトルが終了しました");

		} catch (IOException e) {
			System.out.println("battle_log.txt に書き込めませんでした");
		}
	}
}