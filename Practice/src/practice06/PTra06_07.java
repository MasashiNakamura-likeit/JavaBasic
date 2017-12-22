package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		
		int i;
		int j;
		
		for(i = 1; i <= 5; i++){ //行 縦
			for(j = 1;j <= 5; j++){ //列 横
				if(j < i){
					System.out.print("■");
				}else{
					System.out.print("□");
				}
			}
			System.out.println();
		}
		
		for(i = 1; i <= 5; i++){ //行 縦
			for(j = 5;j >= 1; j--){ //列 横
				if(j >= i){
					System.out.print("■");
				}else{
					System.out.print("□");
				}
			}
			
			System.out.println();
		}
	}
}
