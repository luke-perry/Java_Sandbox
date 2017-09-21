import java.math.BigDecimal;

public class Element<T extends Number> implements Comparable<T> {
  Element<T> left, right; // references to children
  T payload; // data stored within node

  public Element(){}

  public Element(T val){
    set_value(val);
  }
  // Setter/Getter for payload
  public void set_value(T val){
    payload = val;
  }
  public T get_value(){
    return payload;
  }

  // Setters for child references
  public void set_left(Element<T> val){
    left = val;
  }
  public void set_right(Element<T> val){
    right = val;
  }

  // Getters for child references
  public Element<T> get_left(){
    return left;
  }
  public Element<T> get_right(){
    return right;
  }

  // Compare method for value. So, implemented like this: element.compareTo(value of type T);
  @Override
  public int compareTo(T val){
     // Ex. if this is 7. 7.compareTo(8) = -1 7.compareTo(6) = 1  7.compareTo(7) = 0
     return new BigDecimal(payload.toString()).compareTo(new BigDecimal(val.toString()));
  }
}
