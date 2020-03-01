package com.cuiwjava.strategy;

public class Sorter <T> {
    /*选择排序算法,对数组进行排序*/
    public  void  sort(T[] arr,Comparator<T> comparator){ //这里去除了static

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                /*直接使用Comparator的里的方法*/
                minPos = comparator.compare(arr[j],arr[minPos])==-1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }

    }
    /*将类型进行修改*/
    void swap(T[] arr,int i,int j){ //这里也去除了static
        T  temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
