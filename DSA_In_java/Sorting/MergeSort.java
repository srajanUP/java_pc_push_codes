package DSA_In_java.Sorting;



public class MergeSort {
    
    //recursive function for merge sort i.e it breakdown the array
    public static void mergesort(int[] arr) {

        //base case
        if(arr.length>1){
            //seperate and merge first half
            int[] arr1=new int[arr.length/2];
            System.arraycopy(arr, 0, arr1,0, arr.length/2);
            mergesort(arr1);
            
            
            
            //seperate and merge second half
            int secondhalflength=arr.length-arr.length/2;
            int[] arr2=new int[secondhalflength];
            System.arraycopy(arr,arr.length/2 , arr2,0, secondhalflength);
            mergesort(arr2);

            merge(arr1,arr2,arr);
            
        }

        
    }
    //merging sorted array
    public static void merge(int[] arr1,int[] arr2,int[] arr3) {
        int i=0;
        int j=0;
        int k=0;
        
        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }

            else{
                arr3[k]=arr2[j];
                j++;
                k++;
                
            }
            
        }

        // if there are extra elements in the array1
        while (i<arr1.length) {
            arr3[k]=arr1[i];
            j++;
            i++;
            
            
            
        }
        
        // if there are extra elements in the arary2
        while (j<arr2.length) {
            arr3[k]=arr2[j];
            j++;
            i++;
            
            
        }
        

        
    }
    
    public static void main(String[] args) {
        int[] arr={8,6,9,3,2,1,5,7,10};

        mergesort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
    
}
