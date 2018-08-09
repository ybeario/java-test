package com.bear.offer.array;

import java.util.Scanner;

public class Express {
	static Point Start = new Point(0, 0);
	static int minPath = Integer.MAX_VALUE;

	public static int caculate(Point start, Point[] points, int sum, int count) {
		if (count == points.length) {
			minPath = Math.min(minPath, sum + start.getLength(Start));
			return minPath;
			// 所以的点都遍历完之后返回最小的路径
		}
		for (int i = 0; i < points.length; i++) {
			if (points[i].visted == false) {
				sum += points[i].getLength(start);
				if (sum < minPath) {
					points[i].visted = true;
					caculate(points[i], points, sum, count + 1);
				}
				sum -= points[i].getLength(start);
				points[i].visted = false;

			}

		}
		return minPath;

	}

	public static void main(String[] args) {

		int sum = 0, count = 0;
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		Point[] points = new Point[num];
		for (int i = 0; i < num; i++) {
			String str[] = input.nextLine().trim().split(",");
			points[i] = new Point(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}

		System.out.print(caculate(Start, points, sum, count));
	}
}

class Point {
	int x;
	int y;
	boolean visted;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.visted = false;
	}

	public int getLength(Point point) {
		return Math.abs(x - point.x) + Math.abs(y - point.y);
	}

}
