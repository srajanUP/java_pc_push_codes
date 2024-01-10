package java_programs;

public class binarySearch {
    
    public static int BinarySearch(int[] arr, int key) {
        
        int low = 0;
        int high = arr.length-1;
        
        
        while (high>=low){
            int mid = (low+high)/2;
            
            if(key == arr[mid]){
                return mid;
                
            }
            
            else if (key<arr[mid]){
                high= mid-1;
            }
            
            else if (key>arr[mid]){               
                low=mid+1;
            }
            
        }
        
        return -1;
        
    }
    
    
    public static void main(String[] args) {
        long time1=System.currentTimeMillis();
        binarySearch bs=new binarySearch();
        
        int key=79 ;
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("the index of key "+key+" is "+BinarySearch(arr,key));
        long time2=System.currentTimeMillis()-time1;
        System.out.println("time taken : "+time2+" milliseconds ");


    }

    
    
}
