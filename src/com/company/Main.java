package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int [5][5];
        arr = RandomArray(arr);
        System.out.print("Array: \n");
        PrintArray(arr);
        int [] sd = new int [5];
        sd = SideDiagonal(arr);
        System.out.print("Event numbers side diagonal: \n");
        PrintEventNumbers(sd);
        System.out.print("fillArray(0,10,2) -> [");
        PrintFillArray(fillArray(0,10,2));
        System.out.print("fillArray(-20,-6,3) -> [");
        PrintFillArray(fillArray(-20,-6,3));



    }
    private static int[][] RandomArray(int [][]arr){
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                arr[i][j] = (int) (Math.random()*10);
            }
        }
        return arr;
    }
    private static void PrintArray(int [][]arr){
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
    private static int[] SideDiagonal(int [][]arr){
        int [] sd = new int [5];
        int j=4;
        for(int i = 0; i<5; i++){
            sd[i] = arr[i][j];
            j--;
        }
        return sd;
    }
    private static void PrintEventNumbers(int []arr){
        int test=0;
        for(int i=0; i<5; i++){
            if(arr[i]%2==0)
                System.out.print(arr[i] + " ");
            else
                test++;
        }
        if(test==5)
            System.out.print("The side diagonal hasn't event numbers!");
        else
            System.out.print("\n");
    }
    private static int[] fillArray(int begin, int end, int step){
        int size=(end-begin)/step+1;
        int [] arr=new int [size];
        int j=0;
        for(int i=begin;i<=end;i=i+step){
            arr[j]=i;
            j++;
        }
        return arr;
    }
    private static void PrintFillArray(int[]arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("] end - begin \n");
    }
}
