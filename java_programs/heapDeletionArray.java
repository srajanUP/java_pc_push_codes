import java.util.*;

import DSA_In_java.Sorting.insertionSort;

public class heapDeletionArray   {

    static void insertionInHeap(int[] arr){
        
        // putting the last node to the top
        arr[0]=arr[arr.length-1];
        // deleting element
        
        int nodeIndex=0;
        while(nodeIndex<arr.length-1){

           if((2*nodeIndex+1)<arr.length-1 && arr[2*nodeIndex+1]>arr[nodeIndex]){
            int temp=arr[nodeIndex];
            arr[nodeIndex]=arr[2*nodeIndex+1];
            arr[2*nodeIndex+1]=temp;
            nodeIndex=2*nodeIndex+1;
           }
        

           else if((2*nodeIndex+2)<arr.length-1 && arr[2*nodeIndex+2]>arr[nodeIndex]){
            int temp=arr[nodeIndex];
            arr[nodeIndex]=arr[2*nodeIndex+2];
            arr[2*nodeIndex+2]=temp;
            nodeIndex=2*nodeIndex+2;
           }

           else{
            break;
           }
        }
        

       
        int len2=arr.length-2;
        int[] arr1=new int[len2];

        System.arraycopy(arr, 0, arr1, 0,arr.length-2);
        
        for (int i : arr1) {
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr1={60,50,40,30,20};

        // inserting element
        insertionInHeap(arr1);


    }
    
}

    

