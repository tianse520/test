package com.liu.luoji;

public class ContinueDemo {

	/**
	 * 
	 * @param args
	 * 
	 * break在任何循语句的主体部分，均可以使用break控制循环流程。break用于强制退出循环，不执行循环中剩余
	 * 的语句。（break与也在switch语句中使用）
	 * 
	 * continue语句用在循环与具体中，用于终止某次循环流程，即调出循环体中尚未执行的语句，
	 * 接着进行下一次是否执行循环的判定。
	 */
	public static void main(String[] args) {
		int i = 0;
		while(i<100){
			i++;
			if(i%10==0){
				System.out.println();
				continue; //跳过取模等于10的整数，然后关键字continue继续循环
			}
			System.out.print(i);
		}
	}
}
