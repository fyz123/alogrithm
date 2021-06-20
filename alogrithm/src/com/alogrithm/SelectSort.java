package com.alogrithm;

/**
 * 选择排序
 * 思路：
 * 第一次：找到最小的值的位置,然后和第一个数交换
 * 第二次：找到第二小的位置，然后第二个数据交换
 * 如此循环直到倒数第二个
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] array = {5,2,8,1,6,4,3,9,7};

        for (int i = 0; i < array.length -1 ; i++) {
            int minLoc = i;
            for (int j = i+1; j < array.length ; j++) {
                minLoc = array[j] < array[minLoc] ? j : minLoc;
            }
            System.out.println("本次最小数："+array[minLoc]);
            int tmp = array[i];
            array[i] = array[minLoc];
            array[minLoc] = tmp;
        }

        for (int i : array) {
            System.out.print(i+"\t");
        }
    }
}
