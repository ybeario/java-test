package com.bear.newcoder.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class GrammaTree {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine().trim();
		char[] charArray = readLine.toCharArray();
		if (checkIfLegal(charArray)) {
			Stack<Integer> stack=new Stack<>();
			int result=0;
			int pre;
			int behind;
			for(int i=0;i<charArray.length;i++) {
				if (charArray[i]=='(') {
					stack.add(i);
				}else if (charArray[i]==')') {
					 pre = stack.pop();
					 behind=i;
					 
				}
				
			}
			
			
		}

	}

	private static boolean checkIfLegal(char[] charArray) {
		if (charArray[0] != '(' || charArray[1] == ')') {
			System.out.println(-1);
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(') {
				stack.add(charArray[i]);
			} else if (charArray[i] == ')') {
				stack.pop();
			}
			if (stack.isEmpty()) {
				break;
			}
			if (i == charArray.length - 1 && !stack.isEmpty()) {
				System.out.println(-1);
				return false;
			}
		}
		return true;
	}

	public static int operation(char opration, int num1, int num2) {
		switch (opration) {
		case '+':
			return num1 + num2;
		case '*':
			return num1 * num2;
		case '^':
			return num1++;
		}
		return num2;
	}
}
