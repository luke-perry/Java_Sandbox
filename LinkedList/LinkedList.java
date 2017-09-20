/*
   Author: luke Perry
  Purpose: Controller class for linked list
     date: 9/19/2017
*/

public class LinkedList<T>{
  private int size = 0;
  private Node<T> head;
  private Node<T> tail;

  // Add methods
  public void add(T val){
      Node<T> temp = new Node<T>(val);

      if(size == 0) {
        head = temp;
        tail = temp;
      }else{
        tail.set_next(temp);
        tail = temp;
      }

      upSize();
  }

  // Get Methods
  public T get(int index){
      Node<T> curr = head;
      for(int i = 0; i < index; i++){
        curr = curr.get_next();
      }

      return curr.get_payload();
  }
  public T get_head(){
    return get(0);
  }
  public T get_tail(){
    return get(size-1);
  }

  // Remove Methods
  public void remove(int index){
    Node<T> prev = head;
    Node<T> curr = head;

    for(int i = 0; i < index; i++){
      prev = curr;
      curr = curr.get_next();
    }

    prev.set_next(curr.get_next());

    if(index == 0){
        head = curr.get_next();
    }
    if(index == size-1){
        tail = prev;
    }
    downSize();
  }
  public void remove_head(){
    remove(0);
  }
  public void remove_tail(){
    remove(size-1);
  }

  // Contains and Index of
  public boolean contains(T val){
    int index = indexOf(val);
    if(index != -1) {
      return true;
    }
    return false;
  }
  public int indexOf(T value){
      int temp;
      Node<T> curr = head;

      for(int i = 0; i < size; i++){
        if(curr.get_payload().equals(value)){
          return i;
        }
        curr = curr.get_next();
      }

      return -1;
  }

  // Clear
  public void clear(){
    head = null;
    tail = null;
    size = 0;
  }

  // Methods for size
  public int size(){
      return size;
  }
  private void upSize(){
      size++;
  }
  private void downSize(){
      size--;
  }
}
