package com.bear.offer.string;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class SolutionReplaceSpace {
	public String replaceSpace(StringBuffer str) {
		StringBuffer buffer = new StringBuffer();		//复制到新的buffer当中
		int index = 0;									//下标
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
