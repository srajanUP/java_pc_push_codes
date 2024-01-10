import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //creating the priority queue without comparator
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();

        //adding elements in the priority queue
        priorityQueue.add(51);
        priorityQueue.add(35);
        priorityQueue.add(56);
        priorityQueue.add(59);
        priorityQueue.add(85);


        System.out.println(priorityQueue);

        
        
        //creating the priority queue with comparator
        PriorityQueue<Integer> priorityQueue2=new PriorityQueue<>(5, Collections.reverseOrder());
        priorityQueue2.add(1);
        priorityQueue2.add(3);
        priorityQueue2.add(5);
        priorityQueue2.add(5);
        priorityQueue2.add(8);


        System.out.println("priorityQueue2 : "+priorityQueue2);

        while(priorityQueue2.size()>0){
            System.out.println(priorityQueue2.remove());
        }

        System.out.println("priorityQueue2 : "+priorityQueue2);
        

    }
    
}
