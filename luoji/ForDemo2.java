package com.liu.luoji;

public class ForDemo2 {

	public static void main(String[] args) {
		//输出1-1000能被5整除的数，并且，每行3个
		
		for(int i=0;i <= 1000;i++){
			if(i%5==0){
				System.out.print(i+"\t"); //print输出时不换行,println 输出时换行
			} 
			if(i%15 == 0){ //当能被15整除的时候换行
				System.out.println();
			}
		}
	}
}
