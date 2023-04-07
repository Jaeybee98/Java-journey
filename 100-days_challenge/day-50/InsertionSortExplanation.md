The insertion-sort algorithm sorts a list of values by repeatedly inserting a new element into a sorted sublist until the whole list is sorted.
The algorithm can be described as follows: 
 for (int i = 1; i < list.length; i++) {
     insert list[i] into a sorted sublist list[0..i-1] so that list[0..i] is sorted.
}

To insert list[i] into list[0..i-1], save list[i] into a temporary variable, say currentElement. Move list[i-1] to list[i] if list[i-1] > currentElement, move list[i-2] to list[i-1] if list[i-2] > currentElement, and so on, until list[i-k] <= currentElement or k>i (we pass the first element of the sorted list). Assign currentElement to list[i-k+1]. For example, to insert 4 into {2, 5, 9} in Step 4 in Figure 23.2, move list[2] (9) to list[3] since 9>4, and move list[1] (5) to list[2] since 5 > 4. Finally, move currentElement (4) to list[1].
