package com.bear.newcoder.offer;

public class SolutionReplaceSpace {
	public String replaceSpace(StringBuffer str) {
		StringBuffer buffer = new StringBuffer();		//���Ƶ��µ�buffer����
		int index = 0;									//�±�
		while (index < str.length()) {
			if (str.charAt(index) == ' ') {
				buffer.append('%');
				buffer.append('2');
				buffer.append('0');
			} else {
				buffer.append(str.charAt(index));
			}
			index++;
		}
		return buffer.toString();
	}
}
