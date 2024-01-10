package DSA_LOVE_BABBAR;

public class insertionSort {


    public static void insertion_Sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j = i-1;
            for (; j>=0; j--) {   //shifting loop
                if (temp>arr[j]){
                    arr[j+1]=arr[j];
                                                            
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }


        //printing array
        for (int i : arr) {
            System.out.print(i+" ");
            
           }
    }



    public static void main(String[] args) {
        int[] arr={8,7,6,9,3,4};
        insertion_Sort(arr);
        
    }
    
}
