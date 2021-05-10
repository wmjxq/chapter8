package edu.xcdq.set;

import java.util.HashSet;

/**
 * @author weimengjie
 * @date 2021-05-08 09:31
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); //  <> 钻石语法
        set.add("111");
        set.add("222");
        set.add("333");
        set.add("小明");
        set.add("小华");
        set.add("aaa");
        set.add("bbb");
        set.add("xxx");
        System.out.println(set);
        set.remove("xxx"); // 根据内容移除
        System.out.println(set);
        int size = set.size();
        boolean empty = set.isEmpty();
        System.out.println(size);
        System.out.println(empty);
        set.clear();  // 清除
        System.out.println(set);
    }


}
