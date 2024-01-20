package DSA_In_java.Sorting;

public class mergeSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,5,6,7,9};
        int arr2[]={2,4,8,10};
        int arr3[]=new int[arr1.length+arr1.length-1];
        
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



        for (int l : arr3) {
            System.out.print(l+" ");
            
        }
    }
    
}
