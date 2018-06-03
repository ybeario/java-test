package com.bear;

import java.util.Random;

public class SumArray {

    public final static int X = 5;
    public final static int Y = 5;

    private static int[][] baseData;

    private static void init(){
        baseData = new int[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                Random rand = new Random();
                baseData[i][j] = rand.nextInt(10);
                System.out.print(baseData[i][j]);
                System.out.print(" ");
                if(j==baseData[0].length-1){
                    System.out.println();
                }
            }
        }
        System.out.println(baseData[0][3]);
    }

    public static void main(String[] args) {
        init(); 
        testAdd();
    }

    private static void testAdd() {
        int result = addMax(0,0,baseData[0][0]);
        System.out.println("运算结果："+result);
    }

    /**
     * 
     * @param i 横向向右移动
     * @param j 纵向向下移动
     * @param sum 当前最优和
     * @return
     */
    private static int addMax(int i, int j,int sum) {
        if(i+1<X && j+1<Y){
            if(baseData[i+1][j]>=baseData[i][j+1]){
                //当前位置，右侧比下方的数大，则向右移步
                i++;
            }else{
                //当前位置，右侧比下方的数小，则向下移步
                j++;
            }
        }else if(i+1==X&&j+1<Y){
            //到达最右侧
                j++;
        }else if(i+1<X&&j+1==Y){
            //到达最下方
            i++;
        }else{
            //遍历完数组
            return sum;
        }
        sum+=baseData[i][j];
        return addMax(i, j, sum);
    }
}