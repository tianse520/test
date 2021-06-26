package com.liu.scanner;

import java.util.Scanner;

import javax.print.attribute.standard.MediaName;

public class Demo1 {

	public static void main(String[] args) {
		//创建一个扫描对象，用于接受键盘数据
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("使用next方式接受键盘数据: ");
		
		//判断用户有没有输入字符串
		if(scanner.hasNext()){
			//使用next方式接收
			String str = scanner.next();
			System.out.println("输出的内容: "+str);
		}
		//凡是使用IO流的类，都要关闭，否则会一直占用资源
		scanner.close();
	}
}
