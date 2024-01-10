public class PassByRefAndVal {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5,6,7,8,9,10};
        int i=0;
        int n=0;
        System.out.println("n before call : "+n);
        changeInt(n);
        System.out.println("n after call: "+n);


        System.out.print("array before call :");
        for (int c:a1) {
            System.out.print(c+" ");
            
        }
        System.out.println();
            
        
        arrChange(a1,i,n);
         
        System.out.print("array after call :");
        for (int c:a1) {
            System.out.print(c+" ");
            
        }

    }

    static int[] arrChange(int[] a,int i,int n) {
        a[i]=n;
        return a;
        
    }

    static int changeInt(int n){
        return n+1;
        
    }
    
}
