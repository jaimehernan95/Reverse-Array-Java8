//problem:
// The input string is given as an array of characters char[]
// Reverse the string
// Input: ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]

import java.io.*;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {

        String [] array = {"h","e","l","l","o"};
        System.out.println( "before :" + Arrays.toString(array));

        for (int i=0; i<array.length/2; i++) {
            String temp = array[i];
            array[i] = array [array.length -i -1];
            array[array.length -i -1] = temp;

        }
        System.out.println("After: " + Arrays.toString(array));

    }
}

//we used a temp variable to reverse the array, we swap the elements of the array.
// The first element is swapped with the last element.
// The second element id swapped with the last but one element and so on.
// For instance, consider array [1, 2, 3, …., n-2, n-1, n]. We swap 1 with n, 2 with n-1, 3 with n-2 and so on
//Href: