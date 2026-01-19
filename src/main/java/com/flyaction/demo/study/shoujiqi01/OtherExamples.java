package com.flyaction.demo.study.shoujiqi01;

import java.util.*;
import java.util.stream.*;
import java.util.IntSummaryStatistics;

public class OtherExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 统计信息
        IntSummaryStatistics stats = numbers.stream()
            .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("统计信息: " + stats);
        System.out.println("平均值: " + stats.getAverage());
        System.out.println("总数: " + stats.getSum());
        System.out.println("最大值: " + stats.getMax());
        System.out.println("最小值: " + stats.getMin());
        System.out.println("数量: " + stats.getCount());
        
        // 分区（分为 true 和 false 两组）
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("奇偶数分区: " + partitioned);
        // 输出: {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
        
        // 归约操作
        Optional<Integer> sum = numbers.stream()
            .collect(Collectors.reducing((a, b) -> a + b));
        System.out.println("总和: " + sum.orElse(0));
        
        // 映射后再收集
        List<String> numberStrings = numbers.stream()
            .collect(Collectors.mapping(
                n -> "Number: " + n,
                Collectors.toList()
            ));
        System.out.println("映射后收集: " + numberStrings);
    }
}