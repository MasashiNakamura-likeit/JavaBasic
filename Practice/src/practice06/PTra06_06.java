package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
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
		
		
		/* i = 1 の間 j = 1,2,3,4,5 
		   j < 1 なので 全てelse □ */
		
		/* i = 2 の間 j = 1,2,3,4,5 
		   j < 2 なので j = 1 のとき ■ */
		
		/* i = 3 の間 j = 1,2,3,4,5 
		   j < 3 なので j = 1,2 のとき ■ */
		
		/* i = 4 の間 j = 1,2,3,4,5 
		   j < 4 なので j = 1,2,3 のとき ■ */
		
		/* i = 5 の間 j = 1,2,3,4,5 
		   j < 5 なので j = 1,2,3,4 のとき ■ */
	
		
	}
}
