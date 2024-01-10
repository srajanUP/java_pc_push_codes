package Method_Overriding;

class Super extends Object{
    // overriding method
    public void display(){
        System.out.println(" this is Super method");
    }
}


class Sub extends Super{
    //overridden method 
    @Override
    public void display(){
        System.out.println(" this is sub method");
    }
}

class GrandSuper extends Sub {
    public void display(){
        System.out.println("this is GrandSuper class");
    }

}



// main class
public class MethodOverriding{
    public static void main(String[] args) {
        // invoking the Super class's method
        Super su=new Super();
        su.display();

        // invoking the sub class method  but the  
        Sub sb=new Sub();
        sb.display();

        Super o=new GrandSuper();
        o.display();
        
        GrandSuper b=(GrandSuper)o;     // casting the reference of the subclass
        b.display();                    // invoking the display function of the subclass from new refrerence variable



        System.out.println(o instanceof GrandSuper);  /*instanceof operator to check whether 
                                                        the insatnce we have created refer to that
                                                         particular object or not. 
                                                        */
        System.out.println(o instanceof Super);
        
        
    }    
}

