package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};

        int index=0;
        for (int i=0; i<array.length;i++){
            if (array[i]>=number){
                index =i;
                break;
            }
            else index=array.length;
        }

        int[] result= new int[array.length+1];

        for (int a= array.length;a>index;a--){
            result[a]=array[a-1];
        }

        for (int b=0;b<index;b++){
            result[b]=array[b];
        }

        result[index]=number;

        return result;
    }
}
