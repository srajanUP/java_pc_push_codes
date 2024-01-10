import java.util.Scanner;
public class primeNo {
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // System.out.print("enter any no. to check prime or not :");
        // int number=input.nextInt();

        for (int i=0; i<=1000;i++){
            if(prime(i)){
                System.out.printf("%-4d",i);
                System.out.println(" prime");

                
            }
            else {
                System.out.printf( "%-4d",i);
                System.out.println(" not prime");
            }
        }
        
    }

    public static boolean prime(int number ) {
        if (number==1){
            return false;
        }
        else if (number%2!=0 || number==2){
            return true;
        }
        
        else {
            return false;
        }
        
    }
    
}
