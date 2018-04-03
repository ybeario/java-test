package com.bear.newcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainJuxin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] x1 = new String[n];
		String[] y1 = new String[n];
		String[] x2 = new String[n];
		String[] y2 = new String[n];

		x1 = br.readLine().split(" ");
		y1 = br.readLine().split(" ");
		x2 = br.readLine().split(" ");
		y2 = br.readLine().split(" ");
		List< Reac> reacs=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Reac reac=new Reac(Integer.parseInt(x1[i]), Integer.parseInt(y2[i]), Integer.parseInt(x2[i])-Integer.parseInt(x1[i]), Integer.parseInt(y2[i])-Integer.parseInt(y1[1]));
			reacs.add(reac);
		}
		boolean flag=false;
		int num=1;
		int max=1;
		for (Reac reac : reacs) {
			for (Reac rea : reacs) {
				if (reac!=rea) {	
					if (isOverlap(reac, rea)) {
						num++;
						flag=true;
					}
				}
			}
			if (num>max) {
				max=num;
			}
		}
		if (flag) {
			System.out.println(max);
		}else {
			System.out.println(1);
		}
	}

	public static boolean isOverlap(Reac ac1,Reac ac2) {
			if (ac1.x+ac1.width  >ac2.x  &&
					ac2.x + ac2.width  > ac1.x &&
					ac1.y + ac1.height > ac2.y &&
					ac2.y + ac2.height > ac1.y
					)
				return true;
			else
				return false;
		}
	}
	class Reac{
		int x;
		int y;
		int width;
		int height;
		public Reac(int x, int y, int width, int height) {
			super();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
	}

