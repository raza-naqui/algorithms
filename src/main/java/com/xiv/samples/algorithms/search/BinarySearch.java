package com.xiv.samples.algorithms.search;

public class BinarySearch {
    private int search(int[] sortedArray, int firstIndex, int lastIndex, int findThis){
        int middleIndex = (firstIndex + lastIndex)/2;
        int newerFirstIndex;
        int newerLastIndex;
        if(findThis > sortedArray[lastIndex] || findThis < sortedArray[firstIndex]){
            return -1;
        }else if(findThis == sortedArray[middleIndex]){
            return middleIndex;
        } else if (findThis < sortedArray[middleIndex]){
            newerFirstIndex = firstIndex;
            newerLastIndex = middleIndex;
            return search(sortedArray, newerFirstIndex, newerLastIndex, findThis);
        }else if (findThis > sortedArray[middleIndex]){
            newerFirstIndex = middleIndex;
            newerLastIndex = lastIndex;
            return search(sortedArray, newerFirstIndex, newerLastIndex, findThis);
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedArray = { 2, 3, 4, 10, 40, 56, 98, 106 };
        int findThis = 56;
        int lastIndex = sortedArray.length - 1;
        int indexOfNumber = binarySearch.search(sortedArray, 0, lastIndex, findThis);
        System.out.println(indexOfNumber);
    }
}
