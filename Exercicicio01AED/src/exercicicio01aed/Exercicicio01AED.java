/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicicio01aed;
import java.util.*;
import exercicicio01aed.Stack;
import exercicicio01aed.Queue;
import exercicicio01aed.LinkedList;
public class Exercicicio01AED {
   
    public static void main(final String[] args) {
        
        // Stack Struture
        System.out.println("--------------------------------------------");
        Stack s = new Stack();
        System.out.println(s.whoIAm);
        System.out.println("Including elements with the push function: ");
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Showing elements using the show function: ");
        s.show();
        System.out.println("Removing elements with pop: ");
        System.out.println(s.pop()+" Valor retirado");
        System.out.println("Showing elements using the show function: ");
        s.show();
        System.out.println("--------------------------------------------");
        
        // Queue Struture
        Queue q = new Queue();
        System.out.println(q.whoIAm);
        System.out.println("Putting elements using the enqueue function: 1,2,3,4,5 ");
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("Removing elements using the deQueue function 2 times... ");
        q.deQueue();
        q.deQueue();
        System.out.println("Putting elements using the enqueue function: 1 and 6 ");
        q.enqueue(1);
        q.enqueue(6);
        System.out.println("Removing elements using the deQueue function... ");
        q.deQueue();
        System.out.println("Showing elements using the show function: ");
        q.show();
        System.out.println("--------------------------------------------");
        // LinkedList Struture
        final LinkedList l = new LinkedList();
        System.out.println(l.whoIAm);
        System.out.println("including elements using the insert function: 5 and 2 ");
        l.insert(5);
        l.insert(2);
        System.out.println("including elements using the insertAt function: putting 10 in the index 1");
        l.insertAt(1, 10);
        System.out.println("Deleting elements using the delete function: deleting the element of index 1");
        l.deleteAt(1);
        System.out.println("Showing elements using the show function: ");
        l.show();
        System.out.println("--------------------------------------------");

    }
    
}
