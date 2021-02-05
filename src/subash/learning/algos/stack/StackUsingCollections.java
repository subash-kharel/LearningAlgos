package subash.learning.algos.stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingCollections {

    List<Integer> stackOfInt = new ArrayList<>();
    int index =-1;

    public boolean isEmpty(){
       return stackOfInt.isEmpty();
    }

    public void push(int data){
        stackOfInt.add(data);
        index++;
    }
    public int peek(){
        if(isEmpty()){
            return Integer.parseInt(null);
        }
       return stackOfInt.get(index);
    }
    public int pop(){
        if(stackOfInt.isEmpty()){
            throw new EmptyStackException("Stack is Empty");
        }
        int temp = index;
        index--;
        return stackOfInt.remove(temp);
    }
}
