package DSA_In_java;

public class Bubble_sort {


    public static void bubble_Sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }

        for (int i : arr) {
            System.out.print(i +" ");
            
        }

    }


    public static void main(String[] args) {
        int[] arr={8,7,6,9,3,4};
        bubble_Sort(arr);
        
    }
    
}
