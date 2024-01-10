public class MatchesFunc {
    public static void main(String[] args) {
        String[] arr= "java&is.good(programing%language".split("[&.(%]");
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
  
        }
  
    }
    
}
