package com.prabeshpaudel;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers(5);
        int [] newarr = sortIntegers(arr);
        printArray(newarr);

    }

    public static int[] sortIntegers(int [] array) {
        int [] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        boolean flag = true;
        int temp = 0;
        while(flag) {
            flag = false;
            for (int i = 0; i < newArray.length-1; i++) {
                if (newArray[i] < newArray[i+1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i+1];
                    newArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }

    public static int[] getIntegers(int number) {
        int[] myArray = new int[number];
        for(int i = 0; i < myArray.length; i++) {
            System.out.println("Enter a number!");
            myArray[i] = scan.nextInt();
        }
        return myArray;
    }

    public static void printArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("The " + i + "th element was " + array[i]);
        }
    }
}
