package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public void sortAsc(int[] intArray){
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

    public void sortDesc(int[] intArray){
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
