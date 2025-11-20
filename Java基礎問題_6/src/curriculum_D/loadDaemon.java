
package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class loadDaemon {

	// Daemon のステータスをテキストファイルから読み込むメソッド
	public static Character loaddaemon(String filename) throws IOException {

		// ファイルを1行ずつ読み込む
		BufferedReader br = new BufferedReader(new FileReader(filename));

		// daemon_status.txt の 1行目〜4行目を読み込む
		String name = br.readLine(); // 1行目：名前
		int hp = Integer.parseInt(br.readLine()); // 2行目：HP
		int at = Integer.parseInt(br.readLine()); // 3行目：AT
		int sp = Integer.parseInt(br.readLine()); // 4行目：SP

		br.close(); // ファイルを閉じる

		// Character インスタンスとして返す
		return new Character(name, hp, at, sp);
	}
}
