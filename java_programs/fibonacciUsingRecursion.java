import java.util.Scanner;
public class fibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the range of the series :");
        int range=input.nextInt();
        for (int i=0; i<range;i++){
            System.out.println(fib(i));
        }

    }

    static int fib(int range){
        if (range<=0){
            return 0;
        }
        else if (range==1) {
            return 1;
        }
        else {
            return fib(range-2)+fib(range-1);
        }

    } 
    
}
