package java_programs;



public class Test { 

   public static void main(String[] args) {
      int[] arr={8,6,3,5,6,8};
     
      int min=arr[0];

      for (int i = 0; i < arr.length; i++) {
         if(min>arr[i]){
            min=arr[i];
         }
         
      }
      System.out.println(min);
   }
    
}