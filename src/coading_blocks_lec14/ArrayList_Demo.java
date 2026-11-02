package coading_blocks_lec14;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		//add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		//get
		System.out.println(ll.get(0));
		System.out.println(ll.get(3));
		
		//remove
		System.out.println(ll.remove(1));
		System.out.println(ll);
		
		//update
		ll.set(2, -11);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i) + " ");
		}
	}

}
