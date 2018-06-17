package com.bear.offer.array;

/**
 * 
 * 2018年6月17日
 * 
 * @author Y.bear
 * @describe 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *           例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *           NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class MinNumberInRotateArray {
	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		return coreMinNumberInRotateArray(array, 0, array.length - 1);
	}

	public static int coreMinNumberInRotateArray(int[] array, int start, int end) {
		int mid = start; // 移动0位数字
		while (array[start] >= array[end]) {
//			if (start == end) {				提供举例发现无法退出
//				return array[start];
//			}
			if (end-start==1) {				//退出的条件
				mid=end;
				break;
			}
			mid = (start + end) / 2;
			if (array[start] == array[mid] && array[mid] == array[end]) {
				return findMin(array, start, end);
			} else if (array[mid] >= array[end]) {
				start = mid;
			} else if (array[mid] <= array[end]) {
				end = mid;
			}
		}
		return array[mid];

	}

	public static int findMin(int[] array, int start, int end) {
		int min = array[start];
		for (int i = start; i <= end; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
