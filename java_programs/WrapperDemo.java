public class WrapperDemo {
    public static void main(String[] args) {
        Integer intObject=Integer.valueOf(16);  //wrapping or boxing 
        System.out.println("value of wrapper object ater boxing "+intObject);
        int y= intObject;
        System.out.println("value of primitive ater unboxing "+y);


    }
    
}
