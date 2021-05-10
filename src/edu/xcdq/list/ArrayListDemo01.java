package edu.xcdq.list;

import java.util.ArrayList;

/**
 * @author weimengjie
 * @date 2021-05-06 17:11
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        String[] array01 = new String[10];
        array01[0] = "zhangsan";
        array01[1] = "lisi";
        array01[2] = "wangwu";

        ArrayList<Object> list01 = new ArrayList<>(); //数组列表
        // 1 增加
        list01.add("zhangsan");
        list01.add("lisi");
        list01.add("wangwu");
        System.out.println(list01);
        // 2 删除
        list01.remove(1);
        System.out.println(list01);
        // 3 修改
        String v = (String) list01.set(1,"xiaowu");
        System.out.println(v);

        System.out.println(list01);
        // 4 查询
        for (Object l :list01){
            System.out.println(l+"\t");
        }
        // 5 求长度
        System.out.println(list01.size());
        // 6 清空
        /*list01.clear();
        System.out.println(list01.size());
        System.out.println(list01.isEmpty());*/

        // 7 AddAll
        ArrayList<Object>list02 = new ArrayList<>();
        list02.add(111);
        list02.add(222);
        list02.addAll(1,list02);
        System.out.println(list01);
    }
}
