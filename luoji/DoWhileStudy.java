package com.liu.luoji;

/**
 * 
 * @author 悠远的苍穹
 * 
 * 对于while语句而言。如果不满足条件，就不能进入循环，但有时候我们需要不满足条件也必须执行一次循环体。
 * do..while循环和while循环类似，不同的是，do...while会至少循环一次
 * 
 * while和do...while的区别：
 * 1.while先判断后执行，dowhile先执行后判断
 * 2.dowhile保证至少循环体执行一次，这是主要区别。
 *
 */
public class DoWhileStudy {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do{
			
			sum = sum+i;
			i++;
		}while(i<=100);
		
		System.out.println(sum);
			
	}
}
