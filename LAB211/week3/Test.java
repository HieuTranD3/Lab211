package week3;  

import java.util.Arrays;
import java.util.Random;  
import java.util.Scanner;  

import java.util.Random;  
import java.util.Scanner;  

public class Test {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        Random random = new Random();  
        
        // Testing MyStack  
        MyStack stack = new MyStack();  
        stack.push(10);  
        stack.push(20);  
        System.out.println("Stack after push operations: " + stack);  
        System.out.println("Popped value: " + stack.pop());  
        System.out.println("Top value: " + stack.get());  
        
        // Testing BubbleSort  
        System.out.print("Enter number of elements for bubble sort: ");  
        int nBubble = scanner.nextInt();  
        int[] bubbleArray = random.ints(nBubble, 1, 100).toArray();  
        System.out.println("Unsorted Bubble Array: " + Arrays.toString(bubbleArray));  
        new Sort().bubbleSort(bubbleArray);  
        System.out.println("Sorted Bubble Array: " + Arrays.toString(bubbleArray));  
        
        // Testing QuickSort  
        System.out.print("Enter number of elements for quick sort: ");  
        int nQuick = scanner.nextInt();  
        int[] quickArray = random.ints(nQuick, 1, 100).toArray();  
        System.out.println("Unsorted Quick Array: " + Arrays.toString(quickArray));  
        new Sort().quickSort(quickArray, 0, quickArray.length - 1);  
        System.out.println("Sorted Quick Array: " + Arrays.toString(quickArray));  

        scanner.close();  
    }  
}  