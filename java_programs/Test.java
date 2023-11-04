package java_programs;

public class Test {    
   public static void main(String[] args) {
      System.out.println(circle.getArea());
         
   }
}



class circle{
   public static  int radius;

   public circle(){
      radius=1;
   }

   public circle(int radius){
      circle.radius=radius;

   }

   public static double getArea(){
      return radius*radius*Math.PI;
   }

   public static double getPeremeter(){
      return 2*Math.PI*radius;
   }
}