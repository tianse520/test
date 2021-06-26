package com.liu.scanner;

import java.util.Scanner;

public class demo3 {
	public static void main(String[] args) {
		//可以输入多个数据，求其总和与平均数，输入一个数字就回车确认，通过输入非数字结束
		Scanner scanner = new Scanner(System.in);
		//和 
		double sum = 0;
		//输入了多少数字
		int m = 0;
		//通过循环判断是否还有输入，并在里面每一次进行统计
		while (scanner.hasNextDouble()){
			//每次输入的数字用x去接收
			double x = scanner.nextDouble();
			m = m + 1;
			sum = sum + x;
			System.out.println("你输入了"+m+"个数字,当前结果是： "+sum);
		}
		System.out.println(m+"个是数字的和是："+sum);
		System.out.println(m+"个数字的平均值是"+sum / m);
		
		scanner.close();
	}
}
