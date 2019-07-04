package com.xiv.samples.algorithms.search;

public class LinearSearch {
    public int search(int[] integerArray, int findThis){
        int lengthOfArray = integerArray.length;
        for(int i = 0; i < lengthOfArray; i++){
            if(integerArray[i] == findThis){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        LinearSearch linearSearch = new LinearSearch();
        int[] integerArray = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int findThis = 1000;
        int indexOfNumber = linearSearch.search(integerArray, findThis);
        System.out.println(indexOfNumber);
    }
}
