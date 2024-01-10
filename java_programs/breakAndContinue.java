package java_programs;

public class breakAndContinue {
    public static void main(String[] args) {
        for(int i=0; i<10;i++){
            System.out.printf("value of i is : %d\n",i);
            if (i==5){
                System.out.printf("value of i is : %d\n",i);
                continue;                                  // after the execution of continue keyword the next 
                //statement will not execute and cursor move to next iteration
                
            }
        }
        System.out.println("no. of available processors : "+Runtime.getRuntime().availableProcessors());
    }
    
}
