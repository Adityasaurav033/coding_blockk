package coding_blocks_lec37;

import java.util.*;


public class HasMap_Demo2 {
    static void main() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ananya",78);
        map.put("Aditya",88);
        map.put("Shiva",38);
        map.put("Puneet",98);
        map.put("yash",28);
        for(String k : map.keySet()){
            System.out.println(k+"" + map.get(k));
        }

//        Set<String> key = map.keySet();
//        System.out.println(key);
//        for(String k : key){
//            System.out.println(k + " " + map.get(k));
//        }
    }
}
