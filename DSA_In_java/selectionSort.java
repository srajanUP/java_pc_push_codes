package DSA_In_java;

public class selectionSort {


    public static void selection_Sort(int[] arr){
        // find the minimum number from the array
        for (int i = 0; i < arr.length; i++) {
            
            //assigning the min to the initial element
            int min=arr[i];
            int minindex=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    minindex=j;
                }
                
            }
            //swapping the min element with arr[i] element 
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }

       //printing the array
       for (int i : arr) {
        System.out.print(i+" ");
        
       }

    }
    public static void main(String[] args) {
        int[] arr={8,7,6,9,3,4};
        selection_Sort(arr);
        
        
        
    }
    
}
