package com.bear.offer.string;
/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class StringBufferFunction {
	public static void main(String[] args) {
		StringBuffer aBuffer = new StringBuffer("aasdffzs a  a qwheqio");
		StringBuffer bBuffer = new StringBuffer("b");
		operater(aBuffer, bBuffer);
		System.out.println(aBuffer);
		System.out.println(bBuffer);
		System.out.println(replaceSpace(aBuffer));
		System.out.println(aBuffer.toString().replaceAll("\\s", "%20"));
	}

	public static void operater(StringBuffer x, StringBuffer y) {
		x = x.append(y); // 改变了原值
		y = y.insert(0, x);
		y = new StringBuffer("asd"); // 未改变原值
		System.out.println("y=" + y);
		System.out.println(y.capacity());
	}
	//剑指offer 替换空格
	public static String replaceSpace(StringBuffer str) {
		StringBuffer buffer = new StringBuffer();
		int index = 0;
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
