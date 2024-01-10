public class dotEqualsMethodAndequalsOerator {
    public static void main(String[] args) {
        String s1=new String("srajan");
        String s2=new String("srajan");
        System.out.println(s1==s2);          //return false due to differnt reference of the string 
        System.out.println(s1.equals(s2));   //the equals method of the String class comapre the content of the reference
    }
    
}
