package com.epam.mjc.stage0;

public class ArrayTasks {
    public String[] seasonsArray() {
        String[] seasonsArray = new String[4];
        seasonsArray[0] = "winter";
        seasonsArray[1] = "spring";
        seasonsArray[2] = "summer";
        seasonsArray[3] = "autumn";
        return seasonsArray;
    }

    public int[] generateNumbers(int length) {

        int[] generateNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            generateNumbers[i] = i + 1;
        }
        return generateNumbers;

    }

    public int totalSum(int[] arr) {

        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;


    }

    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public String[] reverseArray(String[] arr) {
        String[] reverseArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverseArr[arr.length - i - 1] = arr[i];

        }
        return reverseArr;
    }


    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int indexOfNewArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[indexOfNewArray] = arr[i];
                indexOfNewArray++;
            }
        }
        return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
      return null;
    }
}
