package Module1.seven;


import java.util.Arrays;

public class AllUseFullMethods {

    public static void main(String[] args) {

        // Initializing arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        String[] arr3 = {"apple", "banana", "cherry"};

        // toString example
        // Converts the contents of arr1 to a String and assigns it to arr1String
        String arr1String = Arrays.toString(arr1);
        // Prints the String representation of arr1
        System.out.println("arr1String: " + arr1String);

        // deepToString example
        // Converts the contents of arr2 to a String and assigns it to arr2String
        String arr2String = Arrays.deepToString(arr2);
        // Prints the String representation of arr2
        System.out.println("arr2String: " + arr2String);

        // equals example
        // Creates a copy of arr1 and assigns it to arr1Copy
        int[] arr1Copy = Arrays.copyOf(arr1, arr1.length);
        // Checks whether arr1 and arr1Copy are equal and assigns the result to areEqual
        boolean areEqual = Arrays.equals(arr1, arr1Copy);
        // Prints whether arr1 and arr1Copy are equal
        System.out.println("Are arr1 and arr1Copy equal? " + areEqual);

        // deepEquals example
        // Creates a copy of arr2 and assigns it to arr2Copy
        int[][] arr2Copy = Arrays.copyOf(arr2, arr2.length);
        // Checks whether arr2 and arr2Copy are deeply equal and assigns the result to areDeepEqual
        boolean areDeepEqual = Arrays.deepEquals(arr2, arr2Copy);
        // Prints whether arr2 and arr2Copy are deeply equal
        System.out.println("Are arr2 and arr2Copy deeply equal? " + areDeepEqual);

        // fill example
        // Creates an array of length 5 and assigns it to arr4
        int[] arr4 = new int[5];
        // Fills each element of arr4 with the value 10
        Arrays.fill(arr4, 10);
        // Prints the contents of arr4
        System.out.println("arr4: " + Arrays.toString(arr4));

        // copyOf example
        // Creates a copy of arr1 with a length of 7 and assigns it to arr5
        int[] arr5 = Arrays.copyOf(arr1, 7);
        // Prints the contents of arr5
        System.out.println("arr5: " + Arrays.toString(arr5));

        // copyOfRange example
        // Creates a copy of a portion of arr1 (starting at index 1 and ending at index 3) and assigns it to arr6
        int[] arr6 = Arrays.copyOfRange(arr1, 1, 4);
        // Prints the contents of arr6
        System.out.println("arr6: " + Arrays.toString(arr6));

        // sort example
        // Creates an unsorted array and assigns it to arr7
        int[] arr7 = {5, 2, 8, 3, 1};
        // Sorts the elements of arr7 in ascending order
        Arrays.sort(arr7);
        // Prints the contents of arr7
        System.out.println("arr7: " + Arrays.toString(arr7));

        // binarySearch example (continued)
        // Searches for the value 4 in arr7 using binary search and assigns the result to index
        int index = Arrays.binarySearch(arr7, 4);
        // Prints the index of the value 4 in arr7
        System.out.println("Index of 4 in arr7: " + index);

        // binarySearch example with custom comparator
        // Creates an array of strings and assigns it to arr8
        String[] arr8 = {"apple", "banana", "cherry"};
        // Searches for the value "banana" in arr8 using binary search and a custom comparator that sorts strings in reverse alphabetical order
        int index2 = Arrays.binarySearch(arr8, "banana", (a, b) -> b.compareTo(a));
        // Prints the index of the value "banana" in arr8 when sorted in reverse alphabetical order
        System.out.println("Index of 'banana' in arr8 sorted in reverse alphabetical order: " + index2);

    }
}


