class circle {                                  // circle  as a object
        
    public int radius;                                 // property of a method  with private access modifier
        
        
    
    
        public circle(){                                  // constructor with default value of radius is 10
            radius=1;
    
        }
    
        public circle(int r){                              // constructor with radius r
            radius=r;
        }
        
        
        
        public int area(){                                   // behaviour of an object or methods
            return (int)Math.PI*radius*radius;
    
        }
        public int circumference(){                           // behaviour of an object or methods
            return (int)Math.PI*radius*2;
        }
    
    }
    
    
public class circleobj {                                   // main class
    public static void main(String[] args) {                     // main method

        circle x=new circle(10);                                // creating object 
        

        System.out.println("area:"+x.area());                      
        System.out.println("circumference:"+x.circumference());
        
        new circle(5);
        
        
        
    }
}   
    
    

