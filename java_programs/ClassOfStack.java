import java.net.http.HttpResponse.PushPromiseHandler;

class StackOfIntegers{
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY =16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);    // to call another constructor with parametre input
                
    }

    public StackOfIntegers(int capacity){
        elements = new int[capacity];

    }

    public boolean empty(){
        if (size==0){
            return true;
        }
        return false;

    }

    public int  peek(){
        return elements[size-1];

    }
    
    // push a new integer to the top of the stack
    public void push(int value){
        if (size >=elements.length){
            int[] temp = new int[elements.length*2];
            System.arraycopy(elements,0 ,temp, 0, elements.length);
            elements=temp;
        
        }
        elements[size++]=value;

    }

    public int pop(){
        return elements[--size];

    }

    public int getSize(){
        return size;

    }


}

public class ClassOfStack {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 10; i++){
            stack.push(i);
        }
        
        
        while (!stack.empty())
        System.out.print(stack.pop() + " ");
    }
    
}

