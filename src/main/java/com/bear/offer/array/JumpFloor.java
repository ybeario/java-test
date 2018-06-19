package com.bear.offer.array;
/**
 * 
 *  2018年6月17日
 *  @author Y.bear
 *  @describe
 *  一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor {
    public int frogJumpFloor(int target) {
        if (target==0) {
			return 0;
		}else if (target==1) {
			return 1;
		}else if (target==2) {
			return 2;
		}
        int one=1;
        int two=2;
        int num=0;
        for (int i = 0; i < target-2; i++) {
			num=one+two;
			one=two;
			two=num;
		}
        return num;
    }
}
