package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author weimengjie
 * @date 2021-05-10 08:44
 */
public class Demo01 {
    public static void main(String[] args) {
        String str[] = { "中文", "计算机", "ABC", "123", "qq@qq.com" };
        List<String> list = Arrays.asList(str); // 1 Arrays.asList() 将数组转换成列表
        System.out.println(list);

        // 2 将数组转换成数组列表（链式列表）  new ArrayList<>(Arrays.asList(str))
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(str));
        LinkedList<String> llist = new LinkedList<>(Arrays.asList(str));
        alist.remove("ABC");
        llist.add("1321123");
        System.out.println(alist);
        System.out.println(llist);

        // 3 将列表转换成数组  列表.toArray();
        Object[] str2 = alist.toArray();
        for ( Object o : str2 ) {
            System.out.print(o +" ");
        }
        System.out.println();
        Object[] str3 = llist.toArray();
        for ( Object o : str3 ) {
            System.out.print(o + " ");
        }


    }
}

