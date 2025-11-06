package curriculum_B;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		
//Q1 int型の変数scoreに75を代入		
	int score = 75;
	//scoreが60以上の時コンソールに"合格です"を出力
	if(score >= 60) {System.out.println("合格です！");}
	
	
	
	
//Q2 int 型の変数 age に 25 を代入	
	int age = 25;
	//age が 20 以上 30 以下なら "適正年齢です" を出力
	if (age >= 20 && age <= 30) {System.out.println("適正年齢です");
	//それ以外の場合は "対象外です" を出力
		}else {System.out.println("対象外です");
			}
	
	
	
//Q3 int 型の変数 age に 18 を代入	
	age = 18;
	//age が 20 以上なら "成人です" を出力
	if (age >= 20) {System.out.println("成人です");
	//age が 13 以上かつ 19 以下なら "ティーンエイジャーです" を出力
		}else if (age >= 13 && age <= 19) {System.out.println("ティーンエイジャーです");
	//age が 12 以下なら "子供です" を出力	
			}else if (age <=12) {System.out.println("子供です");
			}
	
	
	
	
//Q4 int 型の変数 x, y, z に 30, 15, 50 を代入
	int x = 30;
	int y = 15;
	int z = 50;
	
	//xがyより大きいかつzより大きい場合xが一番大きいのでxを出力
	if (x > y && x > z) {System.out.println("一番大きい数値は" + "x" + "で" + x );
	//yがxより大きいかつzより大きい場合yが一番大きいのでyを出力
	}else if (y > x && y > z) {System.out.println("一番大きい数値は" + "y" + "で" + y );
	//zがxより大きいかつyより大きい場合zが一番大きいのでzを出力
	}else if (z > x && z > y) {System.out.println("一番大きい数値は" + "z" + "で" + z );
	}
	
	


//Q5  コンソールに入力された値を使うためキーボードからの入力を受け取る Scanner クラスのインスタンスを作成する
    Scanner scanner = new Scanner(System.in);
	//コンソール出力 "数値を入力してください："
    System.out.print("数値を入力してください：");
	//int型の変数numに入力されたscannerをint型にして代入する        
    int num = scanner.nextInt();
    
    //num の値が 0 より大きければ "正の数です"を出力
     if (num > 0) {System.out.println("正の数です");
	// num の値が 0 なら "0 です" を出力する   
    } else if (num == 0) {System.out.println("0 です");
	//num の値が 0 より小さければ "負の数です" を表示する
    } else if (num < 0) {System.out.println("負の数です");
    }

    

//Q6 コンソール出力 "数値を入力してください："
    System.out.print("数値を入力してください：");
    //int型の変数valueに入力されたscannerをint型にして代入する
    int value = scanner.nextInt();
    //valueを2で割った時余りがないなら偶数なので"偶数です"と出力
    if (value % 2 == 0) {System.out.println("偶数です");
    //valueを2で割った時余りがあるなら奇数なので"奇数です"と出力
    } else if (value % 2 == 1){System.out.println("奇数です");
    }

	
    
    
    
//Q7 コンソール出力"0〜100の数値を入力してください："
    System.out.print("0〜100の数値を入力してください：");
    //Q1のint型の変数 scoreに入力されたscannerをint型にして代入する
    score = scanner.nextInt();
   
    //90 以上なら "優"   70 以上なら "良"    50 以上なら "可"   50 未満なら "不可"　を出力
    if (score >= 90) { System.out.println("優");
    } else if (score >= 70) {System.out.println("良");
    } else if (score >= 50) {System.out.println("可");
    } else if (score < 50){System.out.println("不可");
    }	        
	
    
	
    
//Q8 コンソール出力 "文字を入力してください："
    System.out.print("文字を入力してください：");
	//String型の変数lettersに入力されたscannerの文字列を代入
    String letters = scanner.nextLine();
    //コンソール入力が null または空文字（""）のときに「入力が無効です」と出力する
    if (letters == null || letters.equals ("")) {
    	System.out.println("入力が無効です");   
    } 
	
    
    
//Q9 コンソール出力	"1～7を入力してください"
    System.out.println("1～7を入力してください");
    //int型の変数dayに入力されたscannerをint型にして代入する
    int day = scanner.nextInt();
	//dayの値によって分岐するswitch文        
    switch (day) {
	//dayが1の時"月曜日"を出力する
    	case 1: {System.out.println("月曜日");
    	} break;
    //dayが2の時"火曜日"を出力する
    	case 2: {System.out.println("火曜日");
    	} break;
    //dayが3の時"水曜日"を出力する
    	case 3: {System.out.println("水曜日");
    	} break;
    //dayが4の時"木曜日"を出力する
    	case 4: {System.out.println("木曜日");
    	} break;
	//dayが5の時"金曜日"を出力する 
    	case 5: {System.out.println("金曜日");	
    	} break;
	//dayが6の時"土曜日"を出力する 
    	case 6: {System.out.println("土曜日");
    	} break;
	//dayが7の時"日曜日"を出力する
    	case 7: {System.out.println("日曜日");
		} break;
	//dayが上記以外のとき"無効な入力です"を出力する
    		default : {System.out.println("無効な入力です");
    			}
    		}
	
    
	        
//Q10 コンソール出力"1～12を入力してください"
    System.out.println("1～12を入力してください");
    //int型の変数monthに入力されたscannerをint型にして代入する
    int month = scanner.nextInt();
    //monthの値によって分岐するswitch文    
    switch (month) {
    //monthが1,2,12の時"冬"を出力する
    	case 1: case 2: case 12: {System.out.println("冬");
    	} break;
    //monthが3,4,5の時"春"を出力する
    	case 3: case 4: case 5: {System.out.println("春");
    	} break;
    //monthが6,7,8の時"夏"を出力する
    	case 6: case 7: case 8: {System.out.println("夏");     
    	} break;
    //monthが9,10,11の時"秋"を出力する
    	case 9: case 10: case 11: {System.out.println("秋");
    //monthが上記以外の時"無効な月です"を出力する
    	} break;
    		default : {System.out.println("無効な月です");
				}	        
    	}
    scanner.close();
//終了    
	
    
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	

