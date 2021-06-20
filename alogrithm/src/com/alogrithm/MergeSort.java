package com.alogrithm;

/**
 * 归并排序 * 思路：
 *  *  递归执行：
 *  *   先分成两半
 *  *   左边排序
 *  *   右边排序
 *  *   合并左右

 */
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {5,2,4,7,8,3,6,9,1};

        sort(a,0,a.length-1);
        //print(a);
    }

    static void sort(int[] a,int left,int right){
        if( left == right)
            return ;
        //分成两半
        int mid = left + ( right - left ) / 2 ;
        //System.out.println("mid:"+mid);
        //左边排序
        sort(a,left,mid);
        //右边排序
        sort(a,mid+1,right);
        System.out.println("left:"+left+" right："+right);
        //合并
        merge(a,left,mid+1,right);
        print(a);
    }



    static void merge(int[] a,int left,int right,int bound){
        int mid = right - 1;
        int i = left,j=right,k=0;
        int[] tmp = new int[bound - left + 1];

        while(i<= mid && j <= bound){
            if(a[i] <= a[j]){
                tmp[k] = a[i];
                i++;
            }else{
                tmp[k] = a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            tmp[k++] = a[i++];
        }
        while(j<=bound){
            tmp[k++] = a[j++];
        }
        for (int l = left; l <= bound ; l++) {
            a[l] = tmp[l - left];
        }
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
