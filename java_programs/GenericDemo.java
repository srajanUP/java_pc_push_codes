import java.util.ArrayList;

public class GenericDemo {


    public static void main(String[] args) {
        GenericStack<Integer> stack=new GenericStack<>();
        stack.push(1);
        stack.push(5);
        stack.push(9);
        stack.push(7);
        stack.push(6);


        System.out.println(stack);


        System.out.println(stack.getSize());

        stack.pop();
        stack.pop();

        System.out.println(stack.toString());


        System.out.println(stack);


        System.out.println("last element : "+stack.peek());


        System.out.println("is stack is empty : "+stack.isEmpty());
        
    }
    
}

//creating generic class
class GenericStack<E>{
    //generic list
    private ArrayList<E> arrayList=new ArrayList<>();
    

    //getting the size of the list
    public int getSize(){
        return arrayList.size();
    }

    //getting the last element
    public E peek(){
        return arrayList.get(getSize()-1);
    }

     //adding element to the list
    public void push(E o){
        arrayList.add(o);
    }


    //deleting element 
    public E pop(){
        return arrayList.remove(getSize()-1);

    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
    
    @Override
    public String toString(){
        return "stack : "+arrayList.toString();
    }
}
