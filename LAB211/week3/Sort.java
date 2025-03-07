/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;


import java.util.Arrays;  

public class Sort {  
    

    public void bubbleSort(int[] arr) {  
        int n = arr.length;  
        boolean swapped;  

        for (int i = 0; i < n - 1; i++) {  
            swapped = false;  
            for (int j = 0; j < n - i - 1; j++) {  
                if (arr[j] > arr[j + 1]) {           
                    int temp = arr[j];  
                    arr[j] = arr[j + 1];  
                    arr[j + 1] = temp;  
                    swapped = true;  
                }  
            }  
            
            if (!swapped) break;  
        }  
    }  
    

    public void quickSort(int[] arr, int low, int high) {  
        if (low < high) {  
            int pi = partition(arr, low, high);  
            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high);  
        }  
    }  

    private int partition(int[] arr, int low, int high) {  
        int pivot = arr[high];  
        int i = (low - 1);  

        for (int j = low; j < high; j++) {  
            if (arr[j] <= pivot) {  
                i++;  
    
                int temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }  
        }  
      
        int temp = arr[i + 1];  
        arr[i + 1] = arr[high];  
        arr[high] = temp;  

        return i + 1;  
    }  
}  
