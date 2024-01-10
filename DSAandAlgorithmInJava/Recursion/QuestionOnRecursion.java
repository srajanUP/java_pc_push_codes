package DSAandAlgorithmInJava.Recursion;
import java.math.BigInteger;
import java.util.Scanner;

public class QuestionOnRecursion {
    
    
    
//------------------------------------------------------------------------------------------------------------------------------   
    
    //factorial of a number using recursion and BigInteger class
    // public static void main(String[] args) {
    //     try (Scanner input = new Scanner(System.in)) {
    //         //getting input from the user
    //         String sc=input.nextLine();
    //         //creating Biginteger class object
    //         BigInteger fact=new BigInteger(sc);
    //         System.out.println(factorial(fact));
    //     }
    // }
    
    // //recursive method to get the factorial of large numbers
    // static BigInteger factorial(BigInteger fact){
    //     //intialising the value of Zero using BigInteger class
    //     BigInteger zero=BigInteger.ZERO;
        
    //     //base case 
    //     if (fact==zero){
    //         return BigInteger.ONE;
    //     }
    //     //rec1ursive case
    //     else {
    //         //substraction in Biginteger class
    //         BigInteger sub=fact.subtract(BigInteger.ONE);
    //         //recursive call
    //         return fact.multiply(factorial(sub));
    //     }
    // }






//--------------------------------------------------------------------------------------------------------------------    
    
    
    
    
    
    
    
    
    
    
    // //fibonaci using loops
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     //getting the input of range from user
    //     System.out.print("enter the range : ");
    //     int range=input.nextInt();
    //     //invoking the 
    //     fibonaci(range);
        
    // }
    
    // static void fibonaci(int n){
    //     int x=0;
    //     int y=1;
    //     int z=0;
    //     System.out.println(x);
    //     System.out.println(y);
    //     for(int i=0;i<n-2;i++){
    //         z=(x+y);
    //         x=y;
    //         y=z;
    //         System.out.println(z);
    //     }
    // }


    
    
    
    
 //--------------------------------------------------------------------------------------------------------------------   
    
    
    
    
    
    
    
    // //gcd using recursion
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     System.out.print("enter the first integer : ");
    //     int first=input.nextInt();
    //     System.out.print("enter the first integer : ");
    //     int second=input.nextInt();
        

    //     //invoking the method gcd
    //     System.out.println("gcd of "+first+" and "+second+" is : "gcd(first,second));
    // }

    // public static int gcd(int m,int n){
    //     //base case
    //     if (m%n==0){
    //         return n;
    //     }

    //     //recursive case
    //     else{
    //         return gcd(n,m%n);
    //     }
    // }




  //---------------------------------------------------------------------------------------------------------------------  
    
    
    
    
    
    
    
    // m(i) = 1+1/2+1/3+...+1/i  using recursion
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     //getting input from the user
    //     System.out.print("enter the range of the series : ");
    //     int range=input.nextInt();
    //     //invoking the function
    //    System.out.println(seriesSum(range));
    // }
    
    // public static double seriesSum(double range){
    //     if (range==1){
    //         //base case
    //         return 1;
    //     }

    //     else {
    //         // recursive case
    //         return seriesSum(range-1)+(1/range);
    //     }        
    // }



  //-------------------------------------------------------------------------------------------------------------------------
  
  


    
    
    
    
    
    //(Sum series) Write a recursive method to compute the following series:
    //m(i)=1/3+2/5+...+i/(2i+1)
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     System.out.print("enter the range : "); 
    //     int range=input.nextInt();
    //     //invoking the function 
    //     System.out.println(sumSeries(range));
    // }

    // public static double sumSeries(double range){
    //     if (range==1){
    //         //base case
    //         return 1/3.0;
    //     }

    //     else {
    //         //recursive case
    //         return sumSeries(range-1)+range/(2*range+1);
    //     }
    // }



//------------------------------------------------------------------------------------------------------------------------------

    
    
    
    
    
    
    /*(Fibonacci series) Modify Listing 18.2, ComputeFibonacci.java, so that the program finds the
     number of times the fib method is called. (Hint: Use a static 
     variable and increment it every time the method is called.)
    **/

    // private static int  counter=0;
    
    // public static int fib(int n){
    //         counter++;
    //     if (n<=0){
    //         return 0;
    //     }
    //     else if(n==1){
    //         return 1;
    //     }
    //     else {
    //         return fib(n-1)+fib(n-2);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     System.out.print("enter the range of the series : ");
    //     int range=input.nextInt();
    //     for (int i=0; i<range;i++){
    //         System.out.println(fib(i));
    //     }
    //     System.out.println("the method fib is called : "+counter+" times");        
    // }
    



    //--------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    //(Print the digits in an integer reversely) Write a recursive method that displays 
    // an int value reversely on the console using the following header

    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     //getting input from the user
    //     System.out.print("enter the integer : ");
    //     int integer=input.nextInt();
    //     // invoking the method to reverse the integer
    //     if(integer>0){
    //         reverseDisplay(integer);
    //     }
    //     else{
    //         System.out.print("-");
    //         reverseDisplay(integer);
    //     }
    // }

    // public static void reverseDisplay(int n){
    //     if(n>0){ //base case
    //         System.out.print(n%10);  //getting the last digit of the integer
    //         reverseDisplay(n/10);   //recursive case  for   reducing the number by one digit from the last
    //     }
    //     else{
    //         n=(-1*n*2+n);
    //         negativeReverse(n);          
            
    //     }
    // }

    // public static void negativeReverse(int n){
    //     if(n>0){ //base case
    //         System.out.print(n%10);  //getting the last digit of the integer
    //         reverseDisplay(n/10);   //recursive case  for   reducing the number by one digit from the last
    //     }

    // }





    //---------------------------------------------------------------------------------------------------------------







    /*(Print the characters in a string reversely) Write a recursive method that
        displays a string reversely on the console using the following header:
        public static void reverseDisplay(String value) 
     */


//     public static void main(String[] args) {
//        //getting input from the user
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter the string : ");
//        String str=input.nextLine();
//        countAcc(str);

//    }

//    public static void countAcc(String str){
//        //base case
//        if (str.length()==1){
//            System.out.print(str.charAt(0));
//        }
//        else{
//            //rceursive case
//            System.out.print(str.charAt(str.length()-1));
//            countAcc(str.substring(0, str.length()-1));  //recursive call
//        }
//    }
    
   
   
   
   
   
   //-----------------------------------------------------------------------------------------------------------------
   
   
   
   
   
   
// static int count=0;
//    public static void main(String[] args) {
//        //getting input from the user
//        Scanner input=new Scanner(System.in);
//        System.out.print("enter the string : ");
//        String str=input.nextLine();
//        System.out.print("enter the character : ");
//        char charcter=input.next().charAt(0);
//        System.out.println("the occurrence of "+charcter+" in "+str+" are : "+countAcc(str, charcter));

//    }

//    public static int countAcc(String str,char character){
//     int i=str.length()-1;
//        //base case
//        if (str.length()==1){
//             if(str.charAt(i)==character){
//                 count++;
//             }
//         }
       
//        //rceursive case
//        else{
//           //increment the counter if the character is matched
//             if (str.charAt(i)==character){
//                 count++;            
//             }
//             //invoking the method
//             countAcc(str.substring(0, str.length()-1),character);  //recursive call
//         }
//        return count;
//    }
    








//-------------------------------------------------------------------------------------------------------










//(Sum the digits in an integer using recursion) Write a recursive method that 
//computes the sum of the digits in an integer. Use the following method header:
//public static int sumDigits(long n)

// static int sum=0;
//   public static void main(String[] args) {

//       //getting input from the user
//       try (Scanner input=new Scanner(System.in);){

//         System.out.print("enter the integer : ");
//         int sumint=input.nextInt();
        

//         //invoking the method 
//         sumInt(sumint);
//         //returning the sum
//         System.out.println("The sum of the digits of the integer "+sumint+" is "+sum);
//       }
//   }


//   public static int  sumInt(int n){
//     //base case
//     if(n<=0){
//       return 0;      

//     }
//     //recursive case
//     else{
//       sum+=(n%10);
//       return sumInt(n/10);

//     }
//   }







//-------------------------------------------------------------------------------------------------------------









/*(Print the characters in a string reversely) Rewrite Programming Exercise 18.9 
using a helper method to pass the substring high index to the method. The 
helper method header is
*/



  // public static void main(String[] args) {
  //   //getting input from the user
  //   Scanner input=new Scanner(System.in);
  //   System.out.println("entre the string : ");
  //   String str=input.nextLine();
  //   revstr(str);
  // }



 
  // public static void revstr(String str){
  //    revstr(str,str.length()-1);
  // }

  // //recursive helper method
  // public static void revstr(String str,int lastindex){
  //   //base case
  //   if (lastindex==0){
  //     System.out.print(str.charAt(lastindex));
  //   }
  //   //recursive case  
  //   else{
  //     System.out.print(str.charAt(lastindex));
  //     revstr(str, lastindex-1);
  //   }
  // }







  //----------------------------------------------------------------------------------------------------







  /*(Find the largest number in an array) Write a recursive method that returns the 
largest integer in an array. Write a test program that prompts the user to enter a 
list of eight integers and displays the largest element. */

// static int max=0;

// public static void main(String[] args) {
//   Scanner input=new Scanner(System.in);
//   int[] arr={1,5,6,3,2,4,9,7,2,3,5,410,5};


//   System.out.println(largestNum(arr,arr.length-1));
// }

// //recursive method

// public static int largestNum(int[] arr   ,  int lastindex){
//   //base case
//   if(lastindex<0){
//     return max;
//   }
//   //recursive case
//   else {
//     if (arr[lastindex]>max){
//       max=arr[lastindex];
//     }
//     return largestNum(arr, lastindex-1);
//   }

// }






//--------------------------------------------------------------------------------------------------------







/*(Find the number of uppercase letters in a string) Write a recursive method 
to return the number of uppercase letters in a string. Write a test program that 
prompts the user to enter a string and displays the number of uppercase letters in 
the string */

   
  //  static int upperLetterCount=0;  
  // public static void main(String[] args) {
  //     Scanner input=new Scanner(System.in);
  //     System.out.print("enter the string : ");
  //     String str=input.nextLine();
      
  //     //invokng the method

  //     System.out.println(upperStr(str,str.length()-1));
    
  // }

  // public static int upperStr(String str,int lastIndex){
  //   //base case
  //   if (lastIndex<0) {
  //     return upperLetterCount;
  //   }   
    
  //   //recursive case
  //   else {
  //     if (Character.isUpperCase(str.charAt(lastIndex))){
  //       upperLetterCount++;
  //     }
  //     //recursive Call
  //     return upperStr(str, lastIndex-1);
  //   }
  // }









  //-------------------------------------------------------------------------------------------------------





/*(Occurrences of a specified character in a string) Rewrite Programming 
Exercise 18.10 using a helper method to pass the substring high index to the method. 
The helper method header is */



// static int countChar=0;
//   public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);

//     System.out.print("enter the string : ");
//     String str=input.nextLine();
    
//     System.out.print("enter the character : ");
//     char ch=input.next().charAt(0);
    
//     //invoking the method
//     System.out.println("the charcater "+ ch+" occurs "+countChar(str,ch)+" times ");


//   }
  
//   public static int countChar(String str,char ch){
//       int high=str.length()-1;
//       return countChar(str, ch,high);
//   }
  
//   //recursive helper method
//   public static int countChar(String str, char ch,int high){
//     //base case
//     if (high<0){
//       return countChar;
//     }
//     //recursive case
//     else{
//       if (str.charAt(high)==ch){
//         countChar++;
//       }
//       //
//       return countChar(str, ch, high-1);
//     }

//   }







//-------------------------------------------------------------------------------------------------------








/*(Tower of Hanoi) Modify Listing 18.8, TowerOfHanoi.java, so the program finds 
the number of moves needed to move n disks from tower A to tower B. (Hint: 
Use a static variable and increment it every time the method is called.) */


  // static int count=0;
  // public static void main(String[] args) {
  //   Scanner input=new Scanner(System.in);
  //   System.out.print("enter the number of discs : ");
  //   int n=input.nextInt();

  //   System.out.print("enter the to char : ");
  //   char fromchar=input.next().charAt(0);
  //   System.out.print("enter the from char : ");
  //   char tochar=input.next().charAt(0);
  //   System.out.print("enter the aux char : ");
  //   char auxchar=input.next().charAt(0);

  //   countMoves(n,fromchar,tochar,auxchar);
  //   System.out.println(count);
  // }


  // public static void countMoves(int n,char fromchar,char tochar,char auxchar){
  //   count++;  //counter for moves

  //   //base case
  //   if (n==1){
  //     System.out.println("move "+n +" from "+fromchar+" to "+tochar);
  //   }

  //   //recursive case
  //   else{
  //     countMoves(n-1, fromchar, auxchar, tochar);
  //     System.out.println("move "+n+" from "+fromchar+" to "+tochar);
  //     countMoves(n-1, auxchar,  tochar, fromchar);
  //   }
  // }








  //-----------------------------------------------------------------------------------------------------






 /*(Decimal to binary) Write a recursive method that converts a decimal number 
into a binary number as a string. The method header is
public static String dec2Bin(int value) */

  // public static void main(String[] args) {
  //   Scanner input =new Scanner(System.in);
  //   System.out.println("enter any integer number : ");
  //   int decimal=input.nextInt();
  //   decToBin(decimal);
  // }

  // public static String decToBin(int n){
  //   if (n==0){
  //     return "0";
  //   }
     
  //   else {
  //     int y=n%2;
  //     System.out.print(Integer.toString(y));
  //     return decToBin(n/2);
  //   }
  // }











  //-----------------------------------------------------------------------------------------------------









 /*(String permutation) Write a recursive method to print all the permutations of a 
  string. For example, for the string abc, the permutation is */

  // public static void main(String[] args) {
  //   Scanner input=new Scanner(System.in);
  //   System.out.println("enter the string : ");
  //   String str=input.nextLine();
  //   permutation(str);

    
  // }

  // public static void permutation(String str){
  //   permutation(" ", str);
    
  // }

  // public static void permutation(String s1,String s2){
  //   //base case
  //   if (s2.length()==0){
  //     System.out.println(s1);
  //   }
  //   //recursive case
  //   else{
  //     for (int i = 0; i < s2.length(); i++) {
  //       char ch=s2.charAt(i);
  //       String news1=s1+ch;
  //       String newS2=s2.substring(0, i)+s2.substring(i+1);
  //       permutation(news1, newS2);
  //     }
  //   }
  // }







  //------------------------------------------------------------------------------------------------------









  




}