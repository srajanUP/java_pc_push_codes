class Student{
    private int id=101;
    private String name="srajanup";
    private java.util.Date dateCreated;

    public Student(int ssn, String newName){
        id=ssn;
        name =newName;
        dateCreated=new  java.util.Date();

    }

    public  int getId(){
        return id;

    }

    public String getName(){
        return name;

    }

    public java.util.Date getdateCreated(){
        return dateCreated;
    }
}


public class ImmutableObjAndClass {
    public static void main(String[] args) {
        Student student = new Student(22110076,"Srajan");
        java.util.Date dateCreated = student.getdateCreated();
        dateCreated.setTime(20000000);
        
    }
    
}
