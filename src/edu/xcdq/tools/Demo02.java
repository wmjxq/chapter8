package edu.xcdq.tools;

import edu.xcdq.list.ArrayListDemo01;
import edu.xcdq.set.HashSetDemo;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author weimengjie
 * @date 2021-05-10 08:16
 */
public class Demo02 {
    public static void main(String[] args) {
        String str[] = {"中文","计算机","ABC","123","qq@qq.com","ABC"};
        // 1 将数组转换为集合 Arrays.asList(str)
        HashSet<String> setDemo = new HashSet<>(Arrays.asList(str));
        System.out.println(setDemo);
        // 2 将集合转为数组1   toArray()
        Object[]arr = setDemo.toArray();
        for (Object a:arr){
            System.out.println(a);
        }
    }

}
