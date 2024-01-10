public class StringClass {
    public static void main(String[] args) {
        String check="welcome to java";
        String message=new String("Welcome To Java");
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.compareToIgnoreCase(check));

    }    
}
