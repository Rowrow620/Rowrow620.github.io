package com.example.Calculator;

import java.util.Collections;
import java.util.List;

/********************************************************************************
 * Sort Operation
 * Description: sorts a list of numbers in ascending or descending order based
 * on the user's choices using the Collections.sort() method, which is a hybrid merge/insertion sort
 * Time Complexity: O(n log n) for both ascending and descending orders
 ********************************************************************************/

class SortOperation  {

    // time complexity:
    // O(n log n)
    public List<Double> performSortOperation(List<Double> numbers, boolean ascending) {
        if (ascending) {
            Collections.sort(numbers); // Sort in ascending order
        } else {
            numbers.sort(Collections.reverseOrder()); // Sort in descending order
        }
        return numbers;
    }
}