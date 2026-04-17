package com.example;

import java.util.Scanner;

public class PeakElementBinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Elements of an Array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Elements of an Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = peakElement(size, arr);

        if (!flag) {
            System.out.println("Peak element does not exist");
        }

        sc.close();
    }

    private static boolean peakElement(int size, int arr[]) {

        int low = 0;
        int high = size - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // Check peak condition
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                (mid == size - 1 || arr[mid] >= arr[mid + 1])) {

                System.out.println("Peak element is: " + arr[mid]);
                return true;
            }

            // Move left
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            }
            // Move right
            else {
                low = mid + 1;
            }
        }

        return false;
    }
}