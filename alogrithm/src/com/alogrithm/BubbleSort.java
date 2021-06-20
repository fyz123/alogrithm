package com.alogrithm;

/**
 * 冒泡排序
 * 思路：
 * 第一次将在将前面n-1个数中最大的挪到最后一个位置
 * 第二次将在前面n-2个数中最大的挪到最后第二个位置
 * 循环往复
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,2,8,1,6,4,3,9,7};

        for (int j = array.length -1 ; j >0 ; j--) {
            for (int i = 0; i < j; i++) {
                if(array[i+1] < array[i]){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }

        for (int i : array) {
            System.out.print(i + "\t");
        }

    }
}
