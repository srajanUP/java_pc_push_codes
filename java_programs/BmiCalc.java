class BMI{
    static String name;
    static int age ;
    static double weight;
    static double height;
    static int noOfPerson;


    BMI(String name, int age, double weight, double height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
        noOfPerson++;

    }

    BMI(String name, double weight ,double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
        noOfPerson++;


    }

    double getBMI(){
        return weight/(height*height);

    }

    String getStatus(){
        if (getBMI()>30){
            return "overweight";
        }
        return "normal";
    }


    static int getNoOfPerson(){
        return noOfPerson;

    }
}

public class BmiCalc {
    public static void main(String[] args) {
        BMI bmi1=new BMI("srajan", 18, 100,1.45);
        System.out.println("bmi of "+   bmi1.name+" is "+  bmi1.getBMI()+" and he is "+  bmi1.getStatus());

        BMI bmi2= new BMI("piyush", 55, 1.5);
        System.out.println("bmi of "+bmi2.name+" is "+bmi2.getBMI()+" and he is "+bmi2.getStatus());

            System.out.println(BMI.getNoOfPerson());
    }
    
}
