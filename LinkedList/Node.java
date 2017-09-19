/*
   Author: luke Perry
  Purpose: Simple node class for linked list
     date: 9/19/2017
*/

public class Node<T>{
    // Value Storage
    private T payload;
    private Node next;

    // Constructors, one of each possible input type
    public Node(T value){
      payload = value;
    }
    public Node(T value, Node ref){
      payload = value;
      next = ref;
    }

    // setter and getter for payload
    public void set_payload(T value){
      payload = value;
    }
    public T get_payload(){
      return payload;
    }

    // setter and getter for next reference
    public void set_next(Node ref){
      next = ref;
    }
    public Node get_next(){
      return next;
    }
}
