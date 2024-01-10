public class StringToArray{
    public static void main(String[] args) {
        String str="srajan upadhyay";          // string 
        char[] chars= str.toCharArray();       // string to array using ("string").toCharArray() method
        
        System.out.print("[");                    // printing  array of the characters 
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if (i<chars.length-1){
                System.out.print(",");
            
            }
        }
        System.out.print("]");
        System.out.println();



        //arary to characters using String(char[]) method or  valueOf(char[]) method
        String newstr= new String(new char[]{'j','a','v','a'});
        System.out.println(newstr);

        
        





        //getchars(int srcbegin, int srcend, array[], dstbegin) method
        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 4);

        for (int i = 0; i < dst.length; i++) {
            System.out.println(dst[i]);
            
        }


        //numbers to string using valueOf(number) method
        int a=2456;
        String srt2= String.valueOf(a);
        System.out.println("after conversion of integer value to string "+a);

        double b=24586.03211;
        String srt1= String.valueOf(b);
        System.out.println("after conversion of number to string "+b);

        boolean c=true;
        String srt3= String.valueOf(c);
        System.out.println("after conversion of number to string "+c);


    }

}