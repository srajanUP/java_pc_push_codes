import java.util.*;

public class twodArrayCreation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.print("enter the row value = ");                  // getting row and column from user
        int row = input.nextInt();
        System.out.print("enter the column value = ");
        int column = input.nextInt();
        
        int[][] array= new int[row][column];                         // declaring 2d array
        
        for (int i=0; i<array.length; i++){                                 
            for(int j=0; j<array[i].length;j++){
                System.out.print("Enter "+i+" row "+j+" column element = ");
                array[i][j]=input.nextInt();
            }
            
        }

        for (int i=0; i<array.length; i++){                                 // printing values to 2d array
            for(int j=0; j<array[i].length;j++){
                System.out.printf("%-3d",array[i][j]);
            }
            System.out.println();
            
        }



    }
    
}
