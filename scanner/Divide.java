package com.liu.scanner;

import java.text.StringCharacterIterator;
import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("请输入要测试的数字：");
		int a  = scanner.nextInt();
		
		//
		
		
		if(a >= 50 && a <= 100){
			if(a>= 50 && a <= 60){
				System.out.println(a+"在50和60之间");
			}else if(a > 60 && a<= 70){
				System.out.println(a+"在60和70之间,不包含60");
			}
			else if(a > 70 && a<= 80){
				System.out.println(a+"在70和80之间,不包含70");
			}else if(a > 80 && a<= 90){
				System.out.println(a+"在80和90之间,不包含80");
			}else if(a > 90 && a<= 100){
				System.out.println(a+"在80和90之间,不包含90");
			}
		}else if (a>= 0 && a < 50){
			if(a>= 0 && a <= 10){
				System.out.println(a+"在0和10之间");
			}else if(a > 10 && a<= 20){
				System.out.println(a+"在10和20之间,不包含10");
			}
			else if(a > 20 && a<= 30){
				System.out.println(a+"在20和30之间,不包含20");
			}else if(a > 30 && a<= 40){
				System.out.println(a+"在30和40之间,不包含30");
			}else if(a > 40 && a< 50){
				System.out.println(a+"在40和50之间,不包含40和50");
			}
		}else{
			System.out.println("输入的数不在100");
		}
		scanner.close();
	}
	
}
