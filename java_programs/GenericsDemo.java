import java.util.Date;

public class GenericsDemo {
    public static void main(String[] args) {
        Object[] obj=new Object[3];
        obj[0]="srajan";
        obj[1]="hy";
        obj[2]=10;
        
        // System.out.println((String)obj[2]); //creates a runtime error

        System.out.println((String)obj[1]);


        Comparable c=new Date();
        System.out.println(c.compareTo(""));
    }
    
}
