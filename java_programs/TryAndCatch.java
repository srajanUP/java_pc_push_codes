import java.util.*;
public class TryAndCatch {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        try {
            System.out.println("enter ant integer number");
            int number=input.nextInt();
            int array[]={10,0,3,4};
            System.out.println(array[3]);
            System.out.println((float)array[0]/array[1]);
         }
         
         
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please enter the index less than 4");
         }
         catch (ArithmeticException b){
            System.out.println("denominator can not be zero ");
         }
         catch (InputMismatchException c){
            System.out.println("please enter the valid integer input");
         }

         //for exit the code (terminate the progarm)
         // System.exit(1); 
         System.out.println("ok thankyou");
         
    }
    
}
