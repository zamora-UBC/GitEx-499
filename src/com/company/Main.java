package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 5 numbers to sort:");
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter 1 if you wish to sort an int array in ascending order, " +
                "press 2 if you want it in descending order:");
        int answer = in.nextInt();
        if(answer == 1){
            sortAsc(arr);
        }else{
            sortDesc(arr);
        }
        System.out.println("Here is the sorted array ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void sortAsc(int[] intArray){
        for(int i = 0; i < intArray.length-1; i++) {
            for (int j = i+1; j< intArray.length; j++) {
                if(intArray[i] > intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    public static void sortDesc(int[] intArray){
        for(int i = 0; i < intArray.length-1; i++) {
            for (int j = i+1; j< intArray.length; j++) {
                if(intArray[i] < intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

}
