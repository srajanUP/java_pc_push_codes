import java.util.Scanner;

public class repetitionofinteger {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] arr=new int[10];
            
            System.out.print("enter the digits = ");   // creating first array 
            for (int i=0 ; i<arr.length;i++){
                int y=input.nextInt();
                arr[i]=y;
            }

            int[] arr1=new int[arr.length];   // creating new array of occurance

            int temp=1;
            for (int i=0; i<arr.length ;i++){           // checking for multiple occurance
                
                for (int j = 1; j < arr.length ; j++) {
                    if (arr[i]==arr[j]){
                        temp+=1;

                    }
                    arr[j-1]=temp;

                }
                              


            }

            for (int i=0; i<=arr.length ;i++){
                System.out.println(arr[i]+" occurs "+arr1[i]+"times");

            }
        }


    }
    
}
