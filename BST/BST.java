
public class BST<T extends Number>{
  Element<T> root;
  int size = 0;

  // add method
  public void add(T val){
    if(size() == 0){
      root = new Element<T>(val);

    }else{
      Element<T> spot;
      spot = search(val, root);
      int loc = spot.compareTo(val);

      if(loc == 0){
        System.out.println("Element already in tree");
      }else if(loc == -1){
        spot.set_right(new Element<T>(val));
      }else{
        spot.set_left(new Element<T>(val));
      }
    }
    upSize();
  }

  // traverse tree
  private Element<T> search(T val, Element<T> Ele){
    Element<T> curr, r , l;
    curr = Ele;
    int temp = curr.compareTo(val);
    System.out.println("\ncompare: " + temp + " ori: " + val);

    r = curr.get_right();
    System.out.println("r: " + r);
    if(temp == 1 && r != null){
        System.out.println("moved right");
        search(val, r);
    }

    l = curr.get_left();
    System.out.println("l: " + l);
    if(temp == -1 && l != null){
        System.out.println("moved left");
        search(val, l);
    }

    return curr;
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
