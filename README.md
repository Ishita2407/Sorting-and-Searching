# Sorting-and-Searching

# Bubble Sort
**Bubble Sort** is a simple comparison-based sorting algorithm that repeatedly steps through a list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

![image](https://github.com/user-attachments/assets/f2e00e8b-1b6f-460e-be95-2c58c2b7f141)

### How It Works:
1. Start at the beginning of the list.
2. Compare the first two adjacent elements. If the first element is greater than the second, swap them.
3. Move to the next pair of elements and repeat the comparison and swap if necessary.
4. Continue comparing and swapping for every adjacent pair in the list until you reach the end of the list.
5. After one pass through the list, the largest element will have "bubbled" up to the correct position (end of the list).
6. Repeat the process for the remaining list, ignoring the last sorted element, until no more swaps are needed.

### Example:
Consider sorting the list `[5, 3, 8, 4, 2]` in ascending order:
1. Compare `5` and `3`, swap -> `[3, 5, 8, 4, 2]`
2. Compare `5` and `8`, no swap -> `[3, 5, 8, 4, 2]`
3. Compare `8` and `4`, swap -> `[3, 5, 4, 8, 2]`
4. Compare `8` and `2`, swap -> `[3, 5, 4, 2, 8]` (largest element `8` is now in its correct place)

Next pass:
1. Compare `3` and `5`, no swap -> `[3, 5, 4, 2, 8]`
2. Compare `5` and `4`, swap -> `[3, 4, 5, 2, 8]`
3. Compare `5` and `2`, swap -> `[3, 4, 2, 5, 8]`

This process continues until the list becomes `[2, 3, 4, 5, 8]`.

### Time Complexity:
- **Worst-case time complexity**: O(n²)
- **Best-case time complexity**: O(n) (if the list is already sorted)
- **Average time complexity**: O(n²)

# Insertion Sort
**Insertion Sort** is a simple and intuitive comparison-based sorting algorithm that builds the final sorted array one element at a time. It works by dividing the input array into two parts: a sorted and an unsorted part. Initially, the sorted part contains just the first element, and the unsorted part contains the rest. The algorithm then repeatedly takes the first element from the unsorted part and inserts it into the correct position in the sorted part.
![image](https://github.com/user-attachments/assets/da967fd2-83fe-433c-8ad5-4f0380c2b8e2)

### How It Works:
1. Start with the second element of the array (since a single element is trivially sorted).
2. Compare this element with the previous elements in the sorted part of the array.
3. Shift all elements in the sorted part that are greater than the current element one position to the right.
4. Insert the current element into its correct position in the sorted part.
5. Move to the next element in the unsorted part and repeat until the entire array is sorted.

### Example:
Consider sorting the array `[5, 3, 8, 4, 2]` in ascending order using insertion sort:
1. Start with the second element `3`.
   - Compare `3` with `5`. Since `3 < 5`, shift `5` to the right and insert `3` in its place.
   - The array becomes `[3, 5, 8, 4, 2]`.

2. Move to the next element `8`.
   - Compare `8` with `5`. Since `8 > 5`, leave it in place.
   - The array remains `[3, 5, 8, 4, 2]`.

3. Move to the next element `4`.
   - Compare `4` with `8`, shift `8` to the right.
   - Compare `4` with `5`, shift `5` to the right.
   - Insert `4` in its correct position.
   - The array becomes `[3, 4, 5, 8, 2]`.

4. Move to the last element `2`.
   - Compare `2` with `8`, shift `8` to the right.
   - Compare `2` with `5`, shift `5` to the right.
   - Compare `2` with `4`, shift `4` to the right.
   - Compare `2` with `3`, shift `3` to the right.
   - Insert `2` in its correct position.
   - The array becomes `[2, 3, 4, 5, 8]`.

### Time Complexity:
- **Worst-case time complexity**: O(n²) (when the array is sorted in reverse order)
- **Best-case time complexity**: O(n) (when the array is already sorted)
- **Average time complexity**: O(n²)

### Key Points:
- **In-place algorithm**: It does not require extra space, so the space complexity is O(1).
- **Stable**: It preserves the relative order of equal elements.
- **Efficient for small datasets**: Though its time complexity is O(n²), insertion sort can be quite efficient for small datasets or nearly sorted arrays.

### Use Cases:
Insertion Sort is often used in scenarios where the data is nearly sorted, or for small datasets. It is also used as part of more complex algorithms like **Shell Sort** or **Timsort**.

# Selection Sort
**Selection Sort** is a simple, comparison-based sorting algorithm that divides the input array into two parts: a sorted part (built from left to right) and an unsorted part. The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted part and swaps it with the first element in the unsorted part, gradually growing the sorted portion of the array.
![image](https://github.com/user-attachments/assets/70235f46-1ff9-4b36-ab65-7e998676f64b)
### How It Works:
1. Start with the entire array as unsorted.
2. Find the smallest (or largest) element in the unsorted part of the array.
3. Swap this element with the first element of the unsorted part (moving it to the sorted part).
4. Repeat the process for the rest of the unsorted part until the entire array is sorted.

### Example:
Consider sorting the array `[5, 3, 8, 4, 2]` in ascending order using selection sort:
1. **First Pass**:
   - Find the smallest element in the array (`2`).
   - Swap `2` with the first element (`5`).
   - The array becomes `[2, 3, 8, 4, 5]`.

2. **Second Pass**:
   - Now look at the remaining unsorted part `[3, 8, 4, 5]`.
   - The smallest element is `3`, which is already in the correct position, so no swap is needed.
   - The array remains `[2, 3, 8, 4, 5]`.

3. **Third Pass**:
   - Now look at the remaining unsorted part `[8, 4, 5]`.
   - The smallest element is `4`.
   - Swap `4` with `8`.
   - The array becomes `[2, 3, 4, 8, 5]`.

4. **Fourth Pass**:
   - Now look at the remaining unsorted part `[8, 5]`.
   - The smallest element is `5`.
   - Swap `5` with `8`.
   - The array becomes `[2, 3, 4, 5, 8]`.

5. The array is now sorted.

### Time Complexity:
- **Worst-case time complexity**: O(n²)
- **Best-case time complexity**: O(n²)
- **Average time complexity**: O(n²)

This is because the algorithm always performs n - 1 comparisons for the first pass, n - 2 for the second pass, and so on, resulting in a quadratic number of comparisons.

### Space Complexity:
- **Space complexity**: O(1) (in-place sorting, no extra memory needed)

### Key Points:
- **In-place algorithm**: Selection sort sorts the array without needing extra space.
- **Not stable**: Selection sort is not stable, meaning that equal elements might not retain their relative order.
- **Easy to implement**: Though its time complexity is not optimal for large datasets, selection sort is simple to understand and implement.
  
### Use Cases:
Selection Sort is useful when memory writes are expensive (as it only performs O(n) swaps), but because of its O(n²) time complexity, it is generally inefficient for large datasets. It is typically used for small datasets or in cases where simplicity is more important than performance.


# Merge Sort
**Merge Sort** is a divide-and-conquer sorting algorithm that breaks down a list into smaller sublists, sorts each sublist, and then merges the sorted sublists to produce the final sorted list. It is highly efficient and guarantees a time complexity of O(n log n) in the worst case, making it one of the fastest general-purpose sorting algorithms.

![image](https://github.com/user-attachments/assets/f0bfd994-6159-4241-9ee2-a37291727f2b)

### How Merge Sort Works:
1. **Divide**: Split the array into two halves.
2. **Conquer**: Recursively sort each half using merge sort.
3. **Merge**: Merge the two sorted halves back into one sorted array.

### Steps in Detail:
1. **Divide** the unsorted array into two roughly equal parts (left and right) until each sublist contains a single element. Since a single element is inherently sorted, no further division is necessary at that point.
2. **Conquer** by recursively sorting the sublists. When sublists contain one element, they are merged in sorted order.
3. **Merge** the sublists together by comparing the elements from each sublist and arranging them in order. This step requires combining two sorted lists into one.

### Example:
Let’s sort the array `[38, 27, 43, 3, 9, 82, 10]` using merge sort.

1. **Step 1: Divide the array**:
   - `[38, 27, 43, 3, 9, 82, 10]` → `[38, 27, 43, 3]` and `[9, 82, 10]`
   - Further division: `[38, 27, 43, 3]` → `[38, 27]` and `[43, 3]`
   - Further division: `[9, 82, 10]` → `[9]` and `[82, 10]`
   - Continue dividing until all subarrays contain one element:
     - `[38, 27]` → `[38]`, `[27]`
     - `[43, 3]` → `[43]`, `[3]`
     - `[82, 10]` → `[82]`, `[10]`

2. **Step 2: Merge sorted subarrays**:
   - Merge `[38]` and `[27]` → `[27, 38]`
   - Merge `[43]` and `[3]` → `[3, 43]`
   - Merge `[82]` and `[10]` → `[10, 82]`
   
3. **Step 3: Merge the larger subarrays**:
   - Merge `[27, 38]` and `[3, 43]` → `[3, 27, 38, 43]`
   - Merge `[9]` and `[10, 82]` → `[9, 10, 82]`

4. **Step 4: Final merge**:
   - Merge `[3, 27, 38, 43]` and `[9, 10, 82]` → `[3, 9, 10, 27, 38, 43, 82]`

The array is now sorted.

### Time Complexity:
- **Worst-case time complexity**: O(n log n)
- **Best-case time complexity**: O(n log n)
- **Average time complexity**: O(n log n)

Merge sort’s time complexity is always O(n log n), regardless of the initial order of the elements.

### Space Complexity:
- **Space complexity**: O(n)
Merge sort requires additional space to store the temporary arrays used for merging. Therefore, it is not an in-place sorting algorithm.

### Key Points:
- **Stable**: Merge sort is a stable sorting algorithm, meaning that it preserves the relative order of equal elements in the sorted array.
- **Divide and Conquer**: The algorithm repeatedly splits the array in half and conquers by sorting the smaller arrays.
- **Efficient**: With a time complexity of O(n log n), it is efficient for large datasets compared to algorithms like bubble sort, selection sort, and insertion sort, which have O(n²) complexity.
- **Not in-place**: Unlike quicksort or heap sort, merge sort uses extra space to store the results of merging, so its space complexity is higher.

### Use Cases:
- **When stability is required**: Merge sort is a good choice when you need a stable sort.
- **For linked lists**: Merge sort is often preferred for sorting linked lists because it does not require random access to elements, and its O(n) space complexity is not an issue for linked structures.
- **For large datasets**: Merge sort is efficient for sorting large datasets because of its O(n log n) performance.

Merge sort is particularly useful when dealing with large data sets where efficiency and stability are critical, but the additional space requirement must be considered.


# Quick Sort
**Quick Sort** is a highly efficient and widely used sorting algorithm that employs the divide-and-conquer strategy. It works by selecting a "pivot" element from the array and partitioning the other elements into two subarrays according to whether they are less than or greater than the pivot. This process is repeated recursively for the subarrays, resulting in a sorted array.

![image](https://github.com/user-attachments/assets/bd2d0326-7ff5-441b-bdfa-7e8a25a9fa5b)

### How Quick Sort Works:
1. **Choose a Pivot**: Select an element from the array to serve as the pivot. The choice of the pivot can affect the performance of the algorithm.
2. **Partitioning**: Rearrange the array so that all elements less than the pivot come before it and all elements greater than the pivot come after it. The pivot is then in its final position.
3. **Recursively Sort Subarrays**: Recursively apply the above steps to the subarrays formed by partitioning.

### Steps in Detail:
1. **Choose a Pivot**: You can choose the pivot in various ways, such as the first element, the last element, a random element, or the median.
  
2. **Partitioning**: 
   - Rearrange the elements around the pivot. For example, if the pivot is the last element, you can iterate through the array and use two pointers: one for the current element and one for the last position of the smaller elements.
   - Swap elements so that smaller elements are on the left and larger elements are on the right.

3. **Recursive Sorting**: 
   - After partitioning, the pivot is in its correct position. Recursively apply quick sort to the left and right subarrays of the pivot.

### Example:
Consider sorting the array `[10, 7, 8, 9, 1, 5]` using quick sort:
1. **Choose a Pivot**: Let's select `5` as the pivot.
2. **Partitioning**:
   - Rearranging results in `[1, 5, 8, 9, 7, 10]`, where `1` is less than `5`, and the pivot `5` is in its final position.

3. **Recursively Sort Subarrays**:
   - Left subarray: `[1]` (already sorted)
   - Right subarray: `[8, 9, 7, 10]`
     - Choose a pivot (let's say `10`), partition, resulting in `[8, 9, 7, 10]`.
     - Choose pivot `7`, partition, resulting in `[7, 8, 9]`.
     - The final sorted array becomes `[1, 5, 7, 8, 9, 10]`.

### Time Complexity:
- **Worst-case time complexity**: O(n²) (occurs when the pivot is the smallest or largest element repeatedly)
- **Best-case time complexity**: O(n log n) (occurs when the pivot divides the array into two equal halves)
- **Average-case time complexity**: O(n log n)

### Space Complexity:
- **Space complexity**: O(log n) for the recursive stack in the average case, but O(n) in the worst case due to stack depth in an unbalanced partitioning scenario.

### Key Points:
- **In-place algorithm**: Quick sort does not require additional storage for sorting the elements; it rearranges elements in the original array.
- **Not stable**: Quick sort is not a stable sort, meaning that the relative order of equal elements might not be preserved.
- **Efficient**: Quick sort is often faster in practice compared to other O(n log n) algorithms (like merge sort) due to lower constant factors and cache efficiency.

### Use Cases:
- **General-purpose sorting**: Quick sort is often used for general-purpose sorting because of its efficiency and speed.
- **Large datasets**: Suitable for sorting large datasets in place without requiring significant additional memory.
- **When average-case performance is crucial**: Quick sort is preferred in many libraries and applications where average-case performance matters more than the worst-case scenario.

### Summary:
Quick sort is a powerful and efficient sorting algorithm, especially suitable for large datasets. Its efficiency comes from the way it partitions the array around a pivot, and its in-place nature makes it memory-efficient. However, care must be taken with pivot selection to avoid worst-case scenarios.

