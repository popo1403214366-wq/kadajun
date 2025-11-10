package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		//Q1	for内限定のint型の変数numを初期値1にしてnumが10以下の時numに+1をループ	
		for (int num = 1; num <= 10; num += 1) {
			//繰り返し処理　コンソール出力 num	
			System.out.println(num);
		}

		//Q2	for内限定のint型の変数evenを初期値2にしてnumが20以下の時numに+2をループ
		for (int even = 2; even <= 20; even += 2) {
			//繰り返し処理　コンソール出力 even	
			System.out.println(even);
		}

		//Q3	for内限定のint型の変数downを初期値10にしてdownが1以上の時downに-1をループ		
		for (int down = 10; down >= 1; down -= 1) {
			//繰り返し処理　コンソール出力 even	
			System.out.println(down);
		}

		//Q4	合計を入れていくためにint型の変数sumを作り。初期値0を代入する		
		int sum = 0;
		//for内限定のint型の変数xを初期値1にしてnumが100以下の時xに+1をループ
		for (int x = 1; x <= 100; x += 1) {
			//繰り返し処理　sumにxを足していく
			sum += x;
		}
		//コンソール出力 sum	
		System.out.println(sum);

		//Q5	外側のforループで5回まで繰り返す
		for (int i = 1; i <= 5; i++) {
			// 内側のループ：i の数だけループ
			for (int j = 1; j <= i; j++) {
				//コンソール出力 "*"
				System.out.print("*");
			}
			// 改行のためコンソール出力 ""
			System.out.println();
		}

		//Q6    int型の変数countに1を代入    
		int count = 1;
		//countが10以下の時コンソール出力count をしてからcountに1を足す
		while (count <= 10) {
			System.out.println(count);
			count += 1;
		}

		//Q7	int型の変数evenに2を代入 	
		int even = 2;
		//countが20以下の時コンソール出力even をしてからevenに2を足す
		while (even <= 20) {
			System.out.println(even);
			even += 2;
		}

		//Q8	int型の変数downに10を代入 
		int down = 10;
		//countが1以上の時コンソール出力down をしてからdownに1を引く
		while (down >= 1) {
			System.out.println(down);
			down -= 1;
		}

		//Q9	合計を入れていくためにint型の変数sumxを作り。初期値0を代入する			
		int sumx = 0;
		//int型の変数xに1を代入 
		int x = 1;
		//xが100以下の時sumxにxを足す,そしてxに1を足す
		while (x <= 100) {
			sumx += x;
			x += 1;
		}
		//コンソール出力sumx
		System.out.println(sumx);

		//Q10	コンソールに入力された値を使うためキーボードからの入力を受け取る Scanner クラスのインスタンスを作成する	
		Scanner scanner = new Scanner(System.in);
		//int型の変数numに初期値1を与える（数字は0以外なんでもいい）
		int num = 1;
		//numが0じゃないときにループする
		while (num != 0) {
			//コンソール出力"数値を入力してください："
			System.out.print("数値を入力してください：");
			//numに入力された情報をint型として与える      
			num = scanner.nextInt();
		}
		//繰り返し処理を抜けた時にコンソール出力"終了しました"
		System.out.println("終了しました");

		//Q11	外側のforのループは〇 * 〇の最初の〇の数字を変えるループ	     
		for (int i = 1; i <= 9; i += 1) {
			//内側のforのループは後の〇の数字を変えるループ         
			for (int j = 1; j <= 9; j += 1) {
				//フォーマットを決めてコンソール出力　%dは整数を表し、02は二桁で表示することを指定している（二桁に満たない場合0が頭に追加される:例1→01)		
				System.out.printf("%02d * %02d = %02d", i, j, i * j);
				//右端(*9)以外の処理の後にに仕切りの線" || "を出力する    
				if (j < 9) {
					System.out.print(" || ");
				}
			}
			//1の段ごとに改行のためコンソール出力""      
			System.out.println();
		}

		//Q12	ランダムな値を生成するためRandomクラスをインスタンス    	         
		Random rand = new Random();
		//コンソール出力 "商品を入力してください"       
		System.out.println("商品を入力してください");
		//Q10でのnextIntの残り改行を消費
		scanner.nextLine();
		//String型の変数objに入力されたscannerの文字列を代入            	               
		String obj = scanner.nextLine();
		//String型の配列nyuuryokuに入力されたobjの文字列をわけて代入            
		String[] nyuuryoku = obj.split("、");
		//int型の変数tvを0～11のランダムな数字を代入
		int tv = rand.nextInt(12);
		//int型の変数displayをtvと足して11になる値を代入        
		int display = 11 - tv;

		//nyuuryokuの配列を一つずつ処理するためString型の変数itemにする
		for (String item : nyuuryoku) {
			//テレビとディスプレイの場合一緒に処理をする　すでに値があるのでそのまま出力	                
			switch (item) {
			case "テレビ":
			case "ディスプレイ":
				System.out.println(item + "の残り台数は " + (item.equals("テレビ") ? tv : display) + " 台です");
				break;
			//パソコンと冷蔵庫と扇風機と洗濯機と加湿器はそれぞれで処理する                 
			//int型の変数num2～num6に0～11のランダムな数を代入する       
			case "パソコン":
				int num2 = rand.nextInt(12);
				System.out.println(item + "の残り台数は " + num2 + " 台です");
				break;
			case "冷蔵庫":
				int num3 = rand.nextInt(12);
				System.out.println(item + "の残り台数は " + num3 + " 台です");
				break;
			case "扇風機":
				int num4 = rand.nextInt(12);
				System.out.println(item + "の残り台数は " + num4 + " 台です");
				break;
			case "洗濯機":
				int num5 = rand.nextInt(12);
				System.out.println(item + "の残り台数は " + num5 + " 台です");
				break;
			case "加湿器":
				int num6 = rand.nextInt(12);
				System.out.println(item + "の残り台数は " + num6 + " 台です");
				break;
			//それ以外の商品の場合
			default:
				System.out.println("『" + item + "』は指定の商品ではありません");
			}
		}

		scanner.close();

	}

}
