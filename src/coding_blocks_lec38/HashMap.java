package coding_blocks_lec38;
import coding_blocks_lec26.P;

import java.util.*;
public class HashMap<K,V> {

    private class Node{
      K key ;
      V value;
      Node next;

      public Node(K key, V value){
          this.key = key;
          this.value = value;
      }
  }

    private Node[] buckets;
    private int size;

    public HashMap(){
      this(4);
    }
  public HashMap(int n){
      buckets = new HashMap.Node[n];
  }

  public void put(K key , V value){
      int idx = HashFun(key);
      Node temp = buckets[idx];
      while(temp != null){
          if(temp.key.equals(key)){
              temp.value = value;
              return;
          }
          temp = temp.next;
      }
      size++;
      Node n = new Node(key,value);
      temp = buckets[idx];
      n.next = temp;
      buckets[idx] = n;
      double lf = (1.0 * size) / buckets.length;//lf = load factor
      double thf = 2.0; // threshold
      if(lf > thf){
        rehashing();
      }
  }

    private void rehashing() {
        Node[] new_arr = new HashMap.Node[2*buckets.length];
        Node[] old_arr = buckets;
        buckets = new_arr;
        size = 0;
        for(Node t : old_arr){
            while(t != null) {
                put(t.key, t.value);
                t = t.next;
            }
        }
    }

    public boolean containsKey(K key){
      int idx = HashFun(key);
      Node temp = buckets[idx];
      while(temp != null){
          if(temp.key.equals(key)){

              return true;
          }
          temp = temp.next;
      }
      return true;
    }

    public V get(K key){
        int idx = HashFun(key);
        Node temp = buckets[idx];
        while(temp != null){
            if(temp.key.equals(key)){

                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
    public V remove(K key) {
        int idx = HashFun(key);
        Node curr = buckets[idx];
        Node prev = null;
        while (curr != null) {
            if (curr.key.equals(key)) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if(curr == null){
            return null;
        }
        else if(prev == null){
            buckets[idx] = curr.next;
        }else{
            prev .next = curr.next;
        }
        curr.next = null;
        size--;
        return curr.value;
    }


  public int HashFun(K key){
        int idx = key.hashCode();
        idx = idx % buckets.length;
        if(idx < 0){
            idx += buckets.length;
        }
        return idx;
  }
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder("{");
    for(Node t : buckets){
        while(t != null) {
           sb.append(t.key + "=" + t.value + ", " );
           t = t.next;
        }
    }
    sb.append("}");
    return sb.toString();
}
}


