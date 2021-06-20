package com.alogrithm;

/**
 * 从第二个元素开始，依次往前比较，直到找到左边的数据比它小，在这个数的后面插入
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {5,2,8,1,6,4,3,9,7};

        for (int i = 1; i < array.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }else{
                    break;
                }
            }
            print(array);
        }
        System.out.println("最终结果：");
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
