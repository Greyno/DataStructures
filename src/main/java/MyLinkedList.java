/**
 * Created by gillianreynolds-titko on 2/25/17.
 */
public class MyLinkedList<T> {

    //See this site for more information on LinkedList:
    //https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html

    //Also see this site for implementation:
    //http://www.sanfoundry.com/java-program-implement-singly-linked-list/

    private static class Node<T>{
        private T data; //data value
        private Node<T> next; //next value in linked list (could be null)

        //Create an inner class
        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }


    public void add(T item){

    }

    public void remove(int index){

    }

    public boolean contains(T element){
        return false;
    }

    public int find(T element){
        return -10;
    }

    public int size(){
        return -10;
    }

    public T get(int index){
        return null;
    }

    //clone() returns a shallow copy (copy of first node and will share the rest). We want a deep copy
    // such that we have another actual copy of the original linked list.
    public T copy(){
        return null;
    }

    //toArray()
    public T[] sort(){
        return null;
    }
}
