package curriculum_B;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		//Q1	int型の配列numに1, 2, 3, 4, 5を格納		
		int[] num = { 1, 2, 3, 4, 5 };
		//numの要素を処理ごとにaに代入して表示する
		for (int a : num) {
			System.out.println(a);
		}

		//Q2	int型の配列num2に10, 20, 30, 40, 50を格納		
		int[] num2 = { 10, 20, 30, 40, 50 };
		//num2の要素を処理ごとにaに代入して表示 
		//要素数から-1していき要素が0以上のときだけ処理して表示する
		for (int a = num2.length - 1; a >= 0; a -= 1) {
			System.out.println(num2[a]);
		}

		//Q3	int型の配列num2に3, 5, 7, 9, 11を格納			  
		int[] num3 = { 3, 5, 7, 9, 11 };
		//合計の入れ物のsum
		int sum = 0;
		//num3の要素をaとし全てsumに足していく  
		for (int a : num3) {
			sum += a;
		}
		//sumの表示  
		System.out.println(sum);

		//Q4	int型の配列num4に12, 7, 9, 21, 5, 18を格納	  
		int[] num4 = { 12, 7, 9, 21, 5, 18 };
		//最大値をmax 最小値をminとし、初期値を与える(初期値は後から全ての要素と比べるためどの要素でもいい）
		int max = num4[0];
		int min = num4[0];
		//num4の要素をnとし、maxとminとの大小関係を比べそれぞれ大きかったり里依紗かったらmaxとminに代入する  
		for (int n : num4) {
			max = (n > max) ? n : max;
			min = (n < min) ? n : min;
		}
		//maxとminの表示    
		System.out.println(max);
		System.out.println(min);

		//Q5	int型の配列num5に1, 2, 3, 4, 5を格納	        
		int[] num5 = { 1, 2, 3, 4, 5 };
		//num5の要素をint型の変数aとし、処理ごとにを2倍にする処理
		for (int a = 0; a < num5.length; a += 1) {
			num5[a] *= 2;
		}
		// 拡張for文で表示
		for (int a : num5) {
			System.out.println(a);
		}

		//Q6	int型の配列num6に4, 7, 10, 15, 20を格納	        
		int[] num6 = { 4, 7, 10, 15, 20 };
		//入力のためのscanner
		Scanner scanner = new Scanner(System.in);
		// "数値を入力してください："を表示
		System.out.print("数値を入力してください：");
		//入力されたものをint型の変数nyuuryokuに代入    
		int nyuuryoku = scanner.nextInt();
		//真偽のためにboolean型の変数hanteiを初期値falseとして代入
		boolean hantei = false;
		//num6の要素をint型の変数aとしてnyuuryokuと同値ならhanteiにtrueを返す
		for (int a : num6) {
			if (a == nyuuryoku) {
				hantei = true;
				break;
			}
		}
		//変数hanteiがtrueの場合とfalseの場合の表示
		if (hantei) {
			System.out.println(nyuuryoku + "は配列に含まれています");
		} else {
			System.out.println(nyuuryoku + "は配列に含まれていません");
		}

		//Q7		2次元配列arrayに{{1, 2}, {3, 4}, {5, 6}}を格納する	                	        	        
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		//2次元配列arrayをそれぞれ1次元配列retuに入れ、1次元配列retuを変数num7にそれぞれ代入し表示する    
		for (int[] retu : array) {
			for (int num7 : retu) {
				System.out.println(num7);
			}
		}

		//Q8	    2次元配列arrayに{{1, 2}, {3, 4}, {5, 6}}を格納する
		int[][] array2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		//合計を入れるsum2
		int sum2 = 0;

		//int型の変数aでarray2の列の処理
		for (int a = 0; a < array2.length; a += 1) {
			//int型の変数nでarray2の行の処理
			for (int b = 0; b < array2[a].length; b += 1) {
				sum2 += array2[a][b];
			}
		}
		//sum2の表示
		System.out.println("合計値は" + sum2);

		//Q9	//2次元配列array3に {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}を格納する	        
		int[][] array3 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		//最大値をmax 最小値をminとし、初期値を与える(初期値は後から全ての要素と比べるためどの要素でもいい)
		int max2 = array3[0][0];
		int min2 = array3[0][0];
		//2次元配列array3をそれぞれ1次元配列aに入れ、1次元配列aを変数bにそれぞれ代入しmaxとminにそれぞれ比べbがmaxより大きいときbをmaxに代入、bがminそり小さいときbをminに代入する 
		for (int[] a : array3) {
			for (int b : a) {
				if (b > max2) {
					max2 = b;
				}
				if (b < min2) {
					min2 = b;
				}
			}
		}
		//maxとminの表示        
		System.out.println("最大値" + max2);
		System.out.println("最小値" + min2);

		//Q10	3次元配列array4に{{{1, 2}, {3, 4}},{{5, 6}, {7, 8}}}を格納する            
		int[][][] array4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		//3次元配列array4を2次元配列aに2次元配列aを1次元配列bに1次元配列bを変数ｃに入れる
		for (int[][] a : array4) {
			for (int[] b : a) {
				for (int c : b) {
					//変数cの表示
					System.out.println(c);
				}
			}
		}

		scanner.close();
	}

}
