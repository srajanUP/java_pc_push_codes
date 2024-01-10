
import java.util.Arrays;
public class ComparatorDemo {
    public static void main(String[] args) {
        String[] cities={"agra","ludhina","amritsar","mumbai","patna","lucknow"};
        java.util.Arrays.sort(cities,new MyComparator());



        for (String city : cities) {
            System.out.println(city);
        }

        


    }



    public static class MyComparator implements java.util.Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if(s1.length()>s2.length()){
                 return 1;
            }
            else if(s1.length()<s2.length()){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    
}
