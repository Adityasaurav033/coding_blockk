package coding_blocks_lec37;

import java.util.*;

public class HashMap_Demo {
    static void main() {
        HashMap<String,Integer> map = new HashMap<>();
        //add
//        map.put("Ananya",78);
//        map.put("Aditya",88);
//        map.put("Shiva",38);
//        map.put("Puneet",98);
//        map.put("yash",28);
//        map.put(null,89);
//        System.out.println(map);
        //containsKey
//        System.out.println(map.containsKey("Rajesh"));
//        System.out.println(map.containsKey("Ananya"));
//        //get
//        System.out.println("Rajesh");
//        System.out.println("Ananya");
//        //remove
//        System.out.println(map.remove("Rajesh"));
//        System.out.println(map.remove("Aditya"));
//        System.out.println(map);

        TreeMap<String,Integer> map1 = new TreeMap<>();
        map1.put("Ananya",78);
        map1.put("Aditya",88);
        map1.put("Shiva",38);
        map1.put("Puneet",98);
        map1.put("yash",28);
//        map1.put(null,89);
        System.out.println(map1);


        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
        //add
        map2.put("Ananya",78);
        map2.put("Aditya",88);
        map2.put("Shiva",38);
        map2.put("Puneet",98);
        map2.put("yash",28);
        map2.put(null,89);
        System.out.println(map2);

    }

}

//jab order ka lena dena na ho
//jab order ke lena dena ho
//jab hume jis order mai data diya usey mai chahiye