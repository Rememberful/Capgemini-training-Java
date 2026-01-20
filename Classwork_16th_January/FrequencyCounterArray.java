package Classwork_16th_January;

import java.util.Scanner;

public class FrequencyCounterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Step 1: Take array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean[] counted = new boolean[n]; // To track if we've already counted this element
        // Step 2: Take array elements input
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            counted[i] = false; // Initialize
        }
        boolean hasDuplicates = false;
        // Step 3: Count frequency of each element
        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            if (!counted[i]) { // Only count if not already counted
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true; // Mark duplicate as counted
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " time(s).");
                if (count > 1) {
                    hasDuplicates = true;
                }
            }
        }
        // Step 4: Report duplicates
        if (hasDuplicates) {
            System.out.println("Duplicates are present in the array.");
        } else {
            System.out.println("No duplicates in the array.");
        }

        scanner.close();
    }
}

