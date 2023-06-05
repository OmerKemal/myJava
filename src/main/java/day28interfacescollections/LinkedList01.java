package day28interfacescollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1)When you use ArrayList removing an element or adding an element makes the other elements re-indexed.
        This is not good because reindexing many elements needs too many tasks.
        As a result; ArrayList is not successful in removing and adding elements.
        2)When you use LinkedList to remove or add elements, it will change just the pointers,
        it will not need to reindex all the other elements that is why removing and adding elements in LinkedList will be so easy.
        As a result, LinkedList is so successful in removing and adding elements.
        3)Search Operations are so easy in ArrayLists because every element has index like an address
        4)LinkedList is not successful in Search Operations because LinkedList does not use indexes I mean elements do not have addresses
     */
    public static void main(String[] args) {
        //How to create a LinkedList:
        LinkedList<Character> m = new LinkedList<>();

        // How to add node's in a LinkedList;
        m.add('A');
        m.add(0,'H');
        m.addFirst('K');
        m.addLast('R');
        System.out.println(m);

        LinkedList<Character> n = new LinkedList<>();
        m.add('s');
        m.add('b');
        m.add('z');
        m.addAll(n);
        m.addAll(2,n);


        System.out.println(m.remove()); // it removes the first node and returns the removed node
        m.remove((Character)'R'); // this method returns true if the character can be removed // otherwise it returns false
        m.remove(4); // it removes the data of the index
        m.removeFirstOccurrence('s'); // the first occurence of the caharacter is removed
        m.removeFirst();// it removes the first character and returns the removed element
        m.removeLast(); // opposite of removefirst


        LinkedList<Integer> r = new LinkedList<>();
        r.pop(); // it is the same with removefirst method
        r.element(); // Retrieves but does not remove the element
        r.poll(); //Retrieves and removes the first element of this list // cut Paste
        r.peek(); // Retrieves but does not remove // if the list is empty gives null

    }
}
