package com.liu.luoji;

public class ForDemo {

	public static void main(String[] args) {
		//计算0-100的奇数偶数和
		int a = 0;
		int b = 0;
		
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				a+=i;
			}else{
				b+=i;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
}
