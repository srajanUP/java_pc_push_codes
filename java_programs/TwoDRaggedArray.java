package java_programs;

public class TwoDRaggedArray {
    public static void main(String[] args) {
        int[][] list1=new int[5][];
        
        
         list1[0]=new int[5];
         list1[1]=new int[4];
         list1[2]=new int[3];
         list1[3]=new int[2];
         list1[4]=new int[1];
  
         System.out.println(list1.length);
  
         System.out.println(list1[2].length);
  
         for (int i = 0; i < list1.length; i++) {
           for (int j = 0; j < list1[i].length; j++) {
              System.out.printf("%2d",list1[i][j]);
              
           }
           System.out.println(  );
  
  
         }
  
           
     }
    
}
