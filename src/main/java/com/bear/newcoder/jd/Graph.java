package com.bear.newcoder.jd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Graph {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().trim());
		while (n > 0) {
			String[] split = reader.readLine().trim().split(" ");
			int[][] graph = new int[Integer.parseInt(split[0]) + 1][Integer.parseInt(split[0]) + 1];
			for (int i = 0; i < Integer.parseInt(split[1]); i++) {
				String[] splt2 = reader.readLine().trim().split(" ");
				graph[Integer.parseInt(splt2[0])][Integer.parseInt(splt2[1])]++;
				graph[Integer.parseInt(splt2[1])][Integer.parseInt(splt2[0])]++;
			}
			check(graph);
			n--;
		}
	}

	public static void check(int[][] graph) {
		for (int i = 1; i < graph.length; i++) {
			
		}
	}
}
