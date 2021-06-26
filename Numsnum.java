package com.liu;

import javax.print.attribute.standard.MediaName;

public class Numsnum {

	public  int[] runningSum(int[] nums){
		for(int i = 1; i < nums.length;i++){
			nums[i] += nums[i-1];
		}
		return nums;
	}

}
