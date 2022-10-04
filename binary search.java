// Java implementation of recursive Binary Search
#import java.util.*;
 
public static void main(String[] args){
    Scanner s = new Scanner(System.in);  
    // Input size of array
    System.out.println("Enter size of array: ");
    int n = s.nextInt();  
 
    // Enter Input array
    System.out.println("Enter Numbers: ");
    for(int i=0; i<n; i++)
        arr[i] = s.next();
 
    // Input the target element
    System.out.println("Enter a Number to Search: ");
    int num = s.next();
 
    // Apply Binary Search
    int index = -1;  // -1 is the flag value
    int low = 0;
    int high = n-1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
  
        // Check if target element is present at mid
        if (arr[mid] == num)
            index = mid;
            break;
  
        // If num is greater than arr[mid], ignore left half
        if (arr[mid] < num)
            low = mid + 1;
  
        // If num is smaller that arr[mid], ignore right half
        else
            high = mid - 1;
    }
  
 
    if (index == -1) System.out.println(“Element not found”);
    else 
         System.out.println("Found the target element at Index No."+ index);
}
/* This code is contributed by Satyam Pandey */
