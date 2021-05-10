package edu.xcdq.set;

import java.util.TreeSet;

/**
 * @author weimengjie
 * @date 2021-05-08 09:32
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("111");
        set.add("222");
        set.add("地理");
        set.add("历史");
        set.add("asdd");
        set.add("ASDD");
        System.out.println(set);
        //set.clear();
        System.out.println(set.pollFirst());
        System.out.println(set);

    }
}
