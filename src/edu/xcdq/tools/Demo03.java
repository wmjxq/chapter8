package edu.xcdq.tools;

import java.util.*;

/**
 * @author weimengjie
 * @date 2021-05-10 08:44
 */
public class Demo03 {
    public static void main(String[] args) {
        HashMap<String,String>map = new HashMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        // 1   keySet()
        Set<String> keys = map.keySet();
        System.out.println(keys);
        // 2 把set转换为其他集合
        ArrayList<String>arrayList = new ArrayList<>(keys);
        System.out.println(arrayList);
        // 3   取出map的值 value()
        Collection<String> v = map.values();
        System.out.println(v);
        // 4  把值转换为其他集合
        LinkedList<String> llistv = new LinkedList<>();
        System.out.println(llistv);
    }
}
