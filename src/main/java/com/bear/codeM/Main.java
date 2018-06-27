package com.bear.codeM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int k = Integer.parseInt(str[2]);

		// Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int m = in.nextInt();
		// int k = in.nextInt();
		int[][] table = new int[k][3];
		String[] time = new String[k];
		Map<String, int[]> map = new TreeMap<>();

		for (int i = 0; i < k; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < 3; j++) {
				table[i][j] = Integer.parseInt(str[j]);
			}
			time[i] = str[3];
			map.put(time[i], table[i]);
		}

		int[][] result = new int[n][m];
		int max = 0;
		int flag = 0;
		int[][] temp = new int[n][m];
		// Set<Entry<String, int[]>> entrySet = map.entrySet();
		Collection<int[]> values = map.values();
		for (int[] is : values) {
			int x = is[0] - 1;
			int y = is[1] - 1;
			int val = is[2];
			if (val == 0) {
				result[x][y]++;
				if (result[x][y] == 1) {
					flag++;
				}
			}
			if (val == 1) {
				result[x][y]--;
				if (result[x][y] == 0) {
					flag--;
				}
			}
			if (max <= flag) {
				max = flag;
				for (int j = 0; j < temp.length; j++) {
					for (int j2 = 0; j2 < temp[0].length; j2++) {
						temp[j][j2] = result[j][j2];
					}
				}
			}
		}
		// for (Entry<String, int[]> entry : entrySet) {
		// int x = entry.getValue()[0] - 1;
		// int y = entry.getValue()[1] - 1;
		// int val = entry.getValue()[2];
		// if (val == 0) {
		// result[x][y]++;
		// if (result[x][y] == 1) {
		// flag++;
		// }
		// }
		// if (val == 1) {
		// result[x][y]--;
		// if (result[x][y] == 0) {
		// flag--;
		// }
		// }
		// if (max <= flag) {
		// max = flag;
		// for (int j = 0; j < temp.length; j++) {
		// for (int j2 = 0; j2 < temp[0].length; j2++) {
		// temp[j][j2] = result[j][j2];
		// }
		// }
		// }
		// }
		// for (int i = 0; i < table.length; i++) {
		// int x = table[i][0]-1;
		// int y = table[i][1]-1;
		// int val = table[i][2];
		// if (val == 0) {
		// result[x][y]++;
		// if (result[x][y]==1) {
		// flag++;
		// }
		// }
		// if (val == 1) {
		// result[x][y]--;
		// if (result[x][y]==0) {
		// flag--;
		// }
		// }
		// if (max <= flag) {
		// max = flag;
		// for (int j = 0; j < temp.length; j++) {
		// for (int j2 = 0; j2 < temp[0].length; j2++) {
		// temp[j][j2]=result[j][j2];
		// }
		// }
		// }
		// }
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[0].length; j++) {
				if (temp[i][j] >= 1) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
