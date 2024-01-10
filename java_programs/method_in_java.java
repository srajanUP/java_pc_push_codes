


public class method_in_java {
    
    
    public static int max(int num1, int num2){    // function for returning the maximum no.
        int result;
        if (num1 > num2){
            result=num1;
        }
        else {
            result = num2; 
        }

        return result;
    }


    public static void main(String[] args) {        //  main function
        
        System.out.println(max(23,96));   //calling  max function in print function

    }
    
}
