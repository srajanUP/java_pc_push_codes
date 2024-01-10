package DSAandAlgorithmINJava;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PlaindromesungRecursion {

    static boolean plaindrome(String str ){
        //base case
        //it returns true if  only last(middle) character is remainging
        if (str.length()==1){
            return true;      
        }

         //base case
         //if the end characters are not equal then it returns false 
        else if  (str.charAt(0)!=str.charAt(str.length()-1)){
            return false;    
        }

        else {
            //recursive case
            //it removes the end characters and creates substring to check whether it is palindrome or not.
            return plaindrome(str.substring(1, str.length()-1)); 
        }
    }
    public static void main(String[] args) throws InputMismatchException{
        try (Scanner input=new Scanner(System.in)){
            //getting the string input from the user
            System.out.print("enter the string to check if it is plaindrome or not : ");
            String str=input.nextLine();
            //calling the method palindrome
            if(plaindrome(str)==true){
                System.out.println(str+" is palindrome ");
            }
            else{
                System.out.println(str+" is not palindrome");
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
