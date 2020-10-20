package LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LinkedList<Type> implements List {
    Node head;

    public int countNodes() {

        int numOfNodes = 0;
        Node currentNode = head;

        while(currentNode != null) {
            currentNode = currentNode.next;
            numOfNodes += 1;
        }
        System.out.printf("Number of nodes = " + String.valueOf(numOfNodes));
        System.out.println();
        return numOfNodes;
    }

    public void insert(Type data) {
        Node node = new Node(data);

        if(head==null) {
            head = node;
        }
        else {
            Node newNode = head;
            while(newNode.next != null) {
                newNode = newNode.next;
            }
            newNode.next =  node;
        }
    }

    public void insertAtStart(Type data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAt(int index,Type data) {
        Node node = new Node(data);

        if(index == 0) {
            insertAtStart(data);
        }
        else {
            Node n = head;
            for(int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index) {
        if(index == 0) {
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for(int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Deleted node - " + n1.data + " at index " + index);
            n1 = null;
        }
    }

    public int show() {
        Node node = head;

        while(node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
        return 0;
    }

    @Override
    public int size() {
        return countNodes();
    }

    @Override
    public boolean isEmpty() {
        return head == null ? true : false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        if (index < countNodes()) {
            Node result = head;
            for (int i = 0; i < index; i++)
                result = head.next;

            return result;
        } else throw new IndexOutOfBoundsException();
    }


    @Override
    public Object set(int i, Object o) {
        return null;
    }

    @Override
    public void add(int i, Object o) {

    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }
}



