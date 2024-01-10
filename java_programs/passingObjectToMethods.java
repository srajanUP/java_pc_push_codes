public class passingObjectToMethods{
    public static void main(String[] args) {

        int p=1;
        System.out.println("value of p "+p);
        int x=++p;
        System.out.println("++p = "+x);
        System.out.println("value of p is "+p+"\n");


        int q=1;
        System.out.println("value of q "+q);
        int y=q++;
        System.out.println("q++ = "+y);
        System.out.println(q+p);
        System.out.println("value of q is "+q+"\n");

        int r=1;
        System.out.println("value of r "+r);
        int z=--r;
        System.out.println("--r = "+z);
        System.out.println("value of r is "+r+"\n");

        int s=1;
        System.out.println("value of s "+s);
        int w=s--;
        System.out.println("s-- = "+w);
        System.out.println("value of s is "+s+"\n");

    }
    
}