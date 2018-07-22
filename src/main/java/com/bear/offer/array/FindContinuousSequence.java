package com.bear.offer.array;

import java.util.ArrayList;

/**
 * 
 * 2018年7月21日
 * 
 * @author Y.bear
 * @describe 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 *           但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 *           没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 *           现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
public class FindContinuousSequence {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = findContinuousSequence(15);
		for (ArrayList<Integer> arrayList : result) {
			for (Integer integer : arrayList) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int s = 1;
		int b = 2;
		while (s < ((sum + 1) / 2)) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int currentSum = ((s + b) * (b - s + 1)) / 2;
			if (currentSum == sum) {
				int temp=s;
				while (s <= b) {
					list.add(s);
					s++;
				}
				b++;
				s=temp;
			}
			if (currentSum < sum)
				b++;
			if (currentSum > sum)
				s++;
			if (list.size() != 0)
				result.add(list);
		}
		return result;
	}
}
