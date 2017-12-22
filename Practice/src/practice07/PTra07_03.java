package practice07;
/*
 * PTra07_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_03 {
	public static void main(String[] args) {

		// ★ char型の配列keywordを定義し 「'平', '島', '沼', '山', '森'」 で初期化してください
		char[] keyword = {'平', '島', '沼', '山', '森' };

		// ★ 配列keywordに格納されている値を後ろから順番に全て表示してください
		System.out.println(keyword[4]);
		System.out.println(keyword[3]);
		System.out.println(keyword[2]);
		System.out.println(keyword[1]);
		System.out.println(keyword[0]);
		
		System.out.println();
		
		
		//for(int i = 4; i>=0; i--) {//森山沼島平
		
		/*for(int i = 4; i<keyword.length; i--) {//森山沼島平+エラー
		
			i<keyword.length
			i<5
			4<5
			3<5
			2<5
			1<5
			0<5
			-1<5 マイナスまでいっちゃうからエラー
		
		*/
		
		//for(int i = keyword.length; i>=0; i--) {//エラー
		
		//for(int i = keyword.length-1; i>=0; i--) {//森山沼島平
		
			
		//	System.out.println(keyword[i]);
		//}
		
	}
}
