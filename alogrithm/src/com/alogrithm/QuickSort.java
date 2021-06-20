package com.alogrithm;

/**
 * 快速排序
 * 思路：
 * 1.找到1个轴
 * 2.从左往右找比轴大的数，从右往左找比轴小的数，交换
 * 3.把轴和最后的位置交换
 * 4.递归，轴左边作为一部分做一次，轴右边做一部分做一次
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5,2,8,1,6,4,3,9,7};
//        int[] array = {1,3,2};

        sort(array,0,array.length-1);
        print(array);
    }

    static void sort(int[] array,int left,int right){
        //int partition = partition(array, 0, 8);

        if(left >= right) {
            return;
        }
        int mid = partition(array,left,right);
        //System.out.println("下一次轴的位置：" + array[mid]);
        sort(array,left,mid-1);
        sort(array,mid+1,right);
    }

    static int partition(int[] array,int left,int right){
        //System.out.println("left:"+left+"\t right:"+right);
        int provid = array[right] ;
        System.out.println("轴是：" + provid);
        int i = left,j = right -1;
        //System.out.println("左指针:" + i + "\t右指针：" + j);


        while(i <= j){
            while(i <= j && array[i] <= provid) i++;
            while(i <= j && array[j] > provid) j--;
//            System.out.println("交换："+array[i]+"\t" + array[j]);
            if(i<j){
                swap(array,i,j);
            }
        }
        swap(array,i,right);

        System.out.print("单次排序完成：\t");
        print(array);
        return i;
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
