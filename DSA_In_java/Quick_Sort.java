package DSA_In_java;

public class Quick_Sort {
    
    //sorting
    static void Quicksort(int[] arr,int s, int e){
        //base case
        if(e<=s){
            return;
        }

        ////partition
        int partitionIndex=partition(arr,s,e);

        //sorting first half
        Quicksort(arr, s, partitionIndex-1);
        
        //sorting second half
        Quicksort(arr, partitionIndex+1, e);
    }


    //partition function
     static int partition(int[] arr,int s,int e){
        int pivot=arr[s];

        //placing the pivot element on it's position
        //determining the position of the pivot by coounting the elements lesser then pivot

        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<pivot){
                count++;
            }
            
        }

        int pivotindex=count;


        //swapping the pivotindex element with pivot
        int temp=arr[pivotindex];
        arr[pivotindex]=pivot;
        arr[s]=temp;


        //checking if the elements left and right side are at right sides

        int i=s;
        int j=e;

        while (i<pivotindex && j>pivotindex) {
            //if arr[i] is at right position 
            while (arr[i]<pivot) {
                i++;
            }
            
            //if arr[j] is at right position 
            while (pivot<arr[j]) {
                j--;
                
            }
            
            // swapping if the elements are at wrong position
            if (arr[i]>pivot && arr[j]<pivot){
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;

            }
            
        }
        //returning the pivot index
        return pivotindex;


    }



    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1,9,10};

        Quicksort(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
