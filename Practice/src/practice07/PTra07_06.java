package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
	/*	double sum = array[0][0]+array[0][1]+array[0][2]+array[1][0]+array[1][1]+array[1][2]+array[1][3] ;
		
		System.out.println(sum/7); */
		
	
		int sum = 0;
		
			for(int i = 0; i<array.length; i++ ) {// i<array.length;→i<2(縦) までループ
				//int sum = 0;
				for(int j = 0; j<array[i].length; j++) { //j<array[i].length;→j<3または4 までループ
					sum += array[i][j]; // i=0 のとき j=0～2  i=1 のとき j=0～3
			
			
				}//System.out.println(  (double)sum/(array[0].length + array[1].length) );//i=0合計 i=1合計 それぞれ/7で出力
				//System.out.println(  (double)sum/array[i].length  );// i=0  i=1 それぞれの平均を出力
			
			}
		
		System.out.println(  (double)sum/(array[0].length + array[1].length) );
		
	
		/*---------------------------------------------------------------------------
		int sum = 0;
		for(int i = 0; i<array.length; i++ ) {// i<array.length;→i<2(縦) までループ
			//int sum = 0;
			for(int j = 0; j<array[i].length; j++) { //j<array[i].length;→j<3または4 までループ
				sum += array[i][j]; // i=0 のとき j=0～2  i=1 のとき j=0～3
	
			}//System.out.println(  (double)sum/(array[0].length + array[1].length) );//ここだとi=0合計 i=1合計 それぞれ/7で出力
			
			System.out.println(  (double)sum/array[i].length  );// i=0  i=1 それぞれの平均を出力
		} 結果 (500+40+6)/3 = 182.0  と  (500+40+6 + 70+8+90+1000)/4 = 428.5
		---------------------------------------------------------------------------*/
		
	}
}
