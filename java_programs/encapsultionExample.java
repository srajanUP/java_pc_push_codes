class circles{
    private double radius=1;
    static int numberOfObjects=0;

    circles(){
        numberOfObjects++;

    }

    circles(double radius){
        radius=1;
        numberOfObjects++;

    }

    double getradius(){
        return radius;
    }

    void radius(double newradius){
        radius=(newradius>=0)?newradius:0;


    }

    static int getnumberOfObjects(){
        return numberOfObjects;
    }
    
    double getarea(){
        return Math.PI*radius*radius;
    }


}


public class encapsultionExample {
    public static void main(String[] args) {
        circles c1 =new circles();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("the area of the circle of radius "+c1.getradius()+" is "+c1.getarea());
        System.out.println("");



        circles c2=new circles(1.1*c1.getradius());
        System.out.println("area of the circle of radius 10% i.e "+c2.getradius()+" greater than the radius of the circle having radius "+c1.getradius()+" is "+c2.getarea());
        System.out.println();

        System.out.println("no. of circles or objects created are "+circles.getnumberOfObjects());
    }
    

    
}

