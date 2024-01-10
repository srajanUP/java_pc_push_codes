public class ArrayOfObjects {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];

        for (int i = 0; i < dates.length; i++) {
            dates[i]=new java.util.Date();
            
        }
        System.out.println(dates[0]);
        System.out.println(dates[0].toString());


    }
    
}

