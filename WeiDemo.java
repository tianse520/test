package com.liu;

public class WeiDemo {
 /*
  * A = 0011 1100
  * B = 0000 1101 
  * 
  * 那么 A&B = 0000 1100 //都有1才是1
  *  A|B = 0011 1101 //有1是1，没1是0
  *  A^B = 0011 0001  //相同是0，不相同1
  *  
  *  ~B = 1111 0010 //取反
  */
	/**
	 * 位运算，效率极高
	 *   <<   左移  *2
	 *   >>   右移  /2
	 *   
	 *   0000 0000 0
	 *   0000 0001 1
	 *   0000 0010 2
	 *   0000 0100 4
	 *   0000 1000 8
	 *   0001 0000 16
	 */
	//更快地计算 2*8
	public static void main(String[] args) {
		System.out.println(2<<3); //2向左移3位   即在2进制中移动
		
		//字符串连接 +， String
		int a = 10;
		int b = 20;
		System.out.println(""+a+b); //结果1020
		System.out.println(a+b+""); //结果30
		
		//三元运算符
		// X ? y : z
		//如果 x==true ,则结果为y，否则为z
		int score = 80;
		String type = score<60 ? "不及格":"及格";
		System.out.println(type);
		
	
		//java中运算符的优先级

//优先级记忆方法：单目乘除为关系，逻辑三目后赋值。（前辈总结的）
//
//单目运算符:一次作用一个变量的运算符，又叫一元运算符
//单目：单目运算符+ –(正负数) ，++ –，！（逻辑非），~（按位取反）
//乘除：算数运算符：* / % + - （* / %优先级肯定是大于+-的）
//为：位运算符：~（按位取反）<<(左移) >>(右移)，^（也可以位运算，二进制异或）
//关系：关系运算符：> < >= <= == !=
//逻辑：逻辑运算符（除！）&& || & | ^
//三目：条件运算符A > B ? X : Y
//后：无意义，仅仅为了凑字数
//赋值：= += -= *= /= %= |= &= ^=
//说明：前优先级大于后，比如单目运算符~也是位运算符，~的优先级是单目级别的。至于赋值运算符中没有见过的自行测试
//
//所谓优先级，就是在表达式中的运算顺序。Java 中常用的运算符的优先级如下表所示：
	}
	
	

}
