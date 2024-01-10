package java_programs;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ADD{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter any  number to add these but addition ends if you enter 0 ");
            int value=input.nextInt();
            int sum=0;
            while (value!=0){
                sum+=value;
                System.out.println("enter any  number to add these but addition ends if you enter 0");
                value=input.nextInt();
            }
            System.out.println("you have pressed 0 , so your sum is "+sum);
        }
        catch (InputMismatchException ime){
            System.out.println("enter the valid input in the input ");
            System.out.println("exception type : "+ime);
        }
    }
}