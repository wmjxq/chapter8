package edu.xcdq.tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author weimengjie
 * @date 2021-05-10 09:52
 */
public class Demo04 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        for (int i =0;i<20000;i++){
            map.put(i,"haha"+i);
        }
        // 迭代器 减少资源占用
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String>next = iterator.next();
            System.out.println(next);
        }
    }
}
