package com.liu;

public class Mathdemo {
	public static void main(String args[]){
		//与（&&）     或 （||）  非（取反）
		boolean a = true;
		boolean b= false;
		
		System.out.println("a&&b:"+(a&&b)); //逻辑运算：两个变量都为真，结果才为真
		System.out.println("a || b"+(a || b));//逻辑或运算： 两个变量有一个为真，则结果为真
		System.out.println("!(a&&b)"+ !(a&&b));//如果是真，则变成假，如果为假则变成真。
		
		//短路运算
		int c = 5;
		boolean d = (c<4)&&(c++<4); //前一个条件判断为假，后面就不运行
		System.out.println(c);//5
		System.out.println(d);//false
		
	}
}
