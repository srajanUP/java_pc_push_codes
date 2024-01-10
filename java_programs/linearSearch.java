public class linearSearch {
    static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;            
            }

        }return -1;
        
    }
    
    
    public static void main(String[] args) {
        long time1=System.currentTimeMillis();
        int key=85;
        int[] arr={1,5,4,6,8,6,2,7,85};
        if(LinearSearch(arr,key)==-1){
            System.out.println("sorry! not such number is found");

        }
        else{
            System.out.println("elemrnt "+key+" found at index = "+LinearSearch(arr,key));
        }
        long time2=System.currentTimeMillis()-time1;
        System.out.println("time taken : "+time2+" milliseconds ");

        
    }
    
}
