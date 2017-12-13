package practice02;
/*
 * PTra02_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_07 {
	public static void main(String[] args) {
		int num = 97;
		System.out.println("num:" + num);

		// ★ int型の変数targetを宣言して、97未満の数字を代入してください（値は任意です）
		int target ;
		target = 95;
		

		// ★ 変数numを、変数targetの数字で割った商と余りを出力してください
		
		int num1 = num / target; //商
		int num2 = num % target; //余り
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
