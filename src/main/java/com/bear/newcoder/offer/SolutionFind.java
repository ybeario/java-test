package com.bear.newcoder.offer;

public class SolutionFind {
	public boolean Find(int target, int[][] array) {
		int length = array.length - 1; //���򳤶�
		int i = 0;						//���򳤶�
		while (length >= 0 && i < array[0].length) {   //��֤�߽簲ȫ
			if (target < array[length][i]) {			//���Ͻǿ�ʼ
				length--;
			} else if (target > array[length][i]) {
				i++;
			} else {
				return true;							//�߽��ڣ�ȴ������ǰ��������������target == array[length][i]
			}
		}
		return false;
	}
}