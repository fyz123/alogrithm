package com.alogrithm;

/**
 * 计数排序：
 * 思想：
 * 1.创建一个数据范围长度的计数数组
 * 2.将原数组每个数据的值对应计数数组的下标，计数数组内的值加1
 * 3.最后创建1个和原数组同样长度的数组，遍历计数数组存值即可
 */
public class CountSort {

    public static void main(String[] args) {
        int[] array = {5,2,1,2,3,6,4,9,7};
        sort(array);

    }

    /** 不稳定的 */
    static void sort2(int[] array){
        int[] count =new int[10];
        for (int i = 0; i < array.length; i++) {
            count[array[i]] ++;
        }
        print(count);
        int[] nArr = new int[array.length];
        int j =0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                for (int i1 = 0; i1 < count[i]; i1++) {
                    nArr[j] = i;
                    j++;
                }
            }
        }
        print(nArr);
    }

    /** 增加累计数组让它变稳定 */
    static void sort(int[] array){
        print(array);
        int[] count =new int[10];
        int[] nArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            count[array[i]] ++;
        }
        System.out.println("得到count数组");
        print(count);
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        System.out.println("得到累加数组");
        print(count);
        for (int i = array.length-1; i >=0; i--) {
            --count[array[i]];
            //print(count);
            //System.out.println(count[array[i]]);
            nArr[count[array[i]]] = array[i];
        }
        print(nArr);
    }

    static void print(int[] array){
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

}
