package DSA_In_java.Sorting;

import java.util.*;

import DSA_In_java.Sorting.insertionSort;;

public class heapInsertion {

    static void insertionInHeap(int n,int[] arr){
        int len2=arr.length+1;
        int[] arr1=new int[len2];

        System.arraycopy(arr, 0, arr1, 0,arr.length);
        
        // adding element
        arr1[len2-1]=n;
        int nodeIndex=len2-1;
        while(arr1[(nodeIndex-1)/2]<arr1[nodeIndex]){
            int temp=arr1[nodeIndex];
            arr1[nodeIndex]=arr1[(nodeIndex-1)/2];
            arr1[(nodeIndex-1)/2]=temp;
            nodeIndex=(nodeIndex-1)/2;
        }

        for (int i : arr1) {
            System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr1={60,50,40,30,20};
        

        System.out.println("enter the element to enter : ");

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        // inserting element
        insertionInHeap(n,arr1);


    }
    
}
