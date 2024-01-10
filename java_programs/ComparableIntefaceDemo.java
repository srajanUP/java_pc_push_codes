import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableIntefaceDemo {
    public static void main(String[] args) {
        Person person=new Person();
        List<Person> people = new ArrayList<>();
        people.add(0,new Person("srajan", 20));
        people.add(1,new Person("sra", 23));
        people.add(2,new Person("aaksh", 53));
        // Add some people to the list
        Collections.sort(people);

        for (int i = 0; i < 2; i++) {
            person.getPerson();
        }
    }
    
}



class Person implements Comparable<Person> {

    private String name;
    private int age;

    Person(String namein,int agein){
        this.name =namein;
        this.age=agein;        
    }
    Person(){
        this.age=age;
        this.name=name;
    }


    void getPerson(){
        System.out.println(this.name+this.age);
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare based on a specific criteria, e.g., age
        return Integer.compare(this.age, otherPerson.age);
    }
    
}
