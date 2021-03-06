package practice03;
/*
 * PTra03_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_09 {
	public static void main(String[] args) {
		/*
		 * ★ 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力型プログラミングとしてください
		 * ●０～６までの数字を入力してもらいます
		 * ●０：日曜～６：土曜を、それぞれ入力された数字から判断して出力します
		 * ●０～６以外の場合は、「0～6の整数を入力してください」と出力します
		 *
		 * ※ プログラムは何行書いても良いです
		 */
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		//入力型プログラミング
		System.out.println("0～6までの数字を入力してください");
		System.out.println("------------------------------------------");
		System.out.println("0.日曜");
		System.out.println("1.月曜");
		System.out.println("2.火曜");
		System.out.println("3.水曜");
		System.out.println("4.木曜");
		System.out.println("5.金曜");
		System.out.println("6.土曜");
		System.out.println("------------------------------------------");

		
		
		// コマンドプロンプトで入力した数値が変数numに代入される
		int num = scanner.nextInt();
		
		switch( num ) {
		
		case 0:
			System.out.println("日曜");
			break;
		
		case 1:
			System.out.println("月曜");
			break;
		
		case 2:
			System.out.println("火曜");
			break;
		
		case 3:
			System.out.println("水曜");
			break;
		
		case 4:
			System.out.println("木曜");
			break;
		
		case 5:
			System.out.println("金曜");
			break;
		
		case 6:
			System.out.println("土曜");
			break;
		
		default:
			System.out.println("0～6の整数を入力してください");
		}
	}
}
