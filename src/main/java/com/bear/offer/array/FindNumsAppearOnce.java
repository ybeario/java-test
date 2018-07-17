package com.bear.offer.array;
/**
 * 
 *  2018年7月17日
 *  @author Y.bear
 *  @describe
 *  一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class FindNumsAppearOnce {
	  public void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        int result=0;
	        for(int i=0;i<array.length;i++){
	            result=array[i]^result;		//异或运算，相同的数值被抵消为0
	        }
	        int flag=1;
	        for(int i=0;i<32;i++){
	            if((result&flag)!=0){		//与运算，寻找1的位置
	                break;
	            }
	            flag=flag<<1;
	        }
	        for(int i=0;i<array.length;i++){
	        if((array[i]&flag)!=0){
	            num1[0]=array[i]^num1[0];
	        }else{
	            num2[0]=array[i]^num2[0];
	        }
	        }
	      
	    }
}
