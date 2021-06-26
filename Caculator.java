package com.liu;

import java.util.Scanner;

import javax.swing.plaf.multi.MultiButtonUI;
import javax.swing.plaf.multi.MultiMenuItemUI;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Caculator {
	//java编写的简单的计算器，实现加减乘除
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要计算的第一个数字： ");
		int num1 = 0;
		int num2 = 0;
		int d = 0;
		num1 = scanner.nextInt();
		System.out.println("请输入运算符");
		String c = scanner.next();
		System.out.println("请输入要计算的第二个数字: ");
		num2 = scanner.nextInt();
		
		switch(c){
		case "+": d =add (num1,num2);
		break;
		
		case "-": d =reduce(num1,num2);
		break;
		
		case "*": d =multi(num1,num2);
		break;
		
		case "/": d = division(num1,num2);
		break;
		
		
		}
		System.out.println("运算结果： "+ d);
		scanner.close();
	}
	public static int add(int a, int b){
		return a+b;
	}
	public static int reduce(int a, int b){
		return a-b;
	}
	public static int multi(int a, int b){
		return a*b;
	}
	public static int division(int a, int b){
		return a/b;
	}

}
