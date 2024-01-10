public class InternedString {
    public static void main(String[] args) {
        String s1="hello to my world";
        String s2="hello to my world"; // interned string ie. both s1 and s2 points to the same object 
                                        // this is helpful for memory saving 
        String s3=new String("hello to my world");  // creates new object and referenced to s3
        System.out.println(s2==s3);
    }
    
}
