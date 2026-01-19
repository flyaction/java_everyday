package com.flyaction.demo.study.shoujiqi01;

import java.util.*;
import java.util.stream.*;


/**
 * toList  收集到列表  保留顺序，允许重复
 */
public class ToListExamples {
    public static void main(String[] args) {
        // 示例数据
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");
        
        // toList() - 收集到列表
        List<String> nameList = names.stream()
            .filter(name -> name.length() > 3)
            .collect(Collectors.toList());
        System.out.println("toList 示例: " + nameList);
        // 输出: [Alice, Charlie, David, Alice] (保留重复元素)
        
        // 处理数值类型
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("数值平方列表: " + squares);
        // 输出: [1, 4, 9, 16, 25]
    }
}