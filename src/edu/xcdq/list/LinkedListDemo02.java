package edu.xcdq.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author weimengjie
 * @date 2021-05-06 18:00
 */

public class LinkedListDemo02 {

    public static void main(String[] args) {
            LinkedList<Object> list01 = new LinkedList<>();  //链接的方式实现
            ArrayListDemo01 listDemo01 = new ArrayListDemo01();

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

            // 将数据111添加到 添加到 list 的末尾
            list01.addLast(111);
            // 将数据 999 添加到 list的最前面
            list01.addFirst(999);
            System.out.println(list01);
    }
}
