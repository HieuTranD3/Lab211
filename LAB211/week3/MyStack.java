
package week3;

import java.util.ArrayList;  

public class MyStack {  
    private ArrayList<Integer> stackValues;  

    public MyStack() {  
        stackValues = new ArrayList<>();  
    }  

    public void push(int value) {  
        stackValues.add(value);  
    }  

    public Integer pop() {  
        if (!stackValues.isEmpty()) {  
            return stackValues.remove(stackValues.size() - 1);  
        }  
        return null; // Stack is empty  
    }  

    public Integer get() {  
        if (!stackValues.isEmpty()) {  
            return stackValues.get(stackValues.size() - 1);  
        }  
        return null; // Stack is empty  
    }  

    @Override  
    public String toString() {  
        return stackValues.toString();  
    }  
}  