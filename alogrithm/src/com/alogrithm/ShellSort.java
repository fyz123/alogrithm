package com.alogrithm;

/**
 * 希尔排序
 * 思路：
 * 给定时间间隔，将在间隔挑出的数组成的数组进行插入排序，逐渐减少间隔
 * 最后一次做间隔为1的插入排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {5,2,8,1,6,4,3,9,7};

        for(int gap = 4; gap > 0 ;gap = gap/2){
            for (int i = gap; i < array.length ; i++) {
                for (int j = i; j - gap >= 0 ; j = j - gap) {
                    if(array[j] < array[j-gap]){
                        swap(array,j,j-gap);
                    }else{
                        break;
                    }
                }
            }
        }

        print(array);
    }

    static void print(int[] array){
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    static int[] swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        return a;
    }
}
