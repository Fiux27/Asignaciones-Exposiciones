/* Give an implementation of the stack ADT using an array list for storage. */

import java.util.ArrayList;
import java.util.List;

public class Ejer7_2 {
    List<Integer> stackList;
    Ejer7_2() {
        stackList = new ArrayList<>();
    }

    void push(int value) {
        stackList.add(value);
    }

     int pop() {

         if (!isEmpty()) { 
              int popValue = stackList.get(stackList.size() - 1);
              stackList.remove(stackList.size() - 1);             
              return popValue;
         } else {
              System.out.print(" La pila ya está vacía ");
              return -1;
         }
    }

     boolean isEmpty() {
          if (stackList.isEmpty()){
               return true;
          } else {
                return false;
          }
     }

    int peek() {
         return stackList.get(stackList.size() - 1);
    }

    public static void main(String[] args) {
     Ejer7_2 myStack = new Ejer7_2(); 
         myStack.push(5);
         myStack.push(8);
         myStack.push(2);
         myStack.push(9);

         System.out.println("\n* * * * * * * * * * *Implementacion de ArrayList de pila* * * * * * * * * * *\n");
         System.out.println(myStack.isEmpty()); 
         System.out.println(myStack.peek()); 
         System.out.println(myStack.pop()); 
         System.out.println(myStack.peek()); 
         System.out.println(myStack.pop()); 
    }
}