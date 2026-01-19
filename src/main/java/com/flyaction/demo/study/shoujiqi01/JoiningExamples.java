package com.flyaction.demo.study.shoujiqi01;

import java.util.*;
import java.util.stream.*;


/**
 * 连接示例 连接字符串	灵活配置分隔符、前缀、后缀
 */
public class JoiningExamples {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        
        // 简单连接
        String simpleJoin = fruits.stream()
            .collect(Collectors.joining());
        System.out.println("简单连接: " + simpleJoin);
        // 输出: AppleBananaCherryDate
        
        // 使用分隔符连接
        String withDelimiter = fruits.stream()
            .collect(Collectors.joining(", "));
        System.out.println("带分隔符连接: " + withDelimiter);
        // 输出: Apple, Banana, Cherry, Date
        
        // 使用分隔符、前缀和后缀
        String withPrefixSuffix = fruits.stream()
            .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("带前缀后缀连接: " + withPrefixSuffix);
        // 输出: [Apple, Banana, Cherry, Date]
        
        // 结合其他操作
        String filteredJoin = fruits.stream()
            .filter(fruit -> fruit.length() > 5)
            .map(String::toUpperCase)
            .collect(Collectors.joining(" | ", "Fruits: ", " (end)"));
        System.out.println("过滤转换后连接: " + filteredJoin);
        // 输出: Fruits: BANANA | CHERRY (end)
        
        // 处理对象列表
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 5000),
            new Employee("Bob", "IT", 6000),
            new Employee("Charlie", "HR", 5200)
        );
        
        String employeeNames = employees.stream()
            .map(Employee::getName)
            .collect(Collectors.joining(", ", "Employees: ", ""));
        System.out.println("员工姓名连接: " + employeeNames);
        // 输出: Employees: Alice, Bob, Charlie
        
        // 复杂连接示例
        String complexJoin = employees.stream()
            .map(emp -> emp.getName() + "(" + emp.getDepartment() + ")")
            .collect(Collectors.joining("; ", "[", "]"));
        System.out.println("复杂格式连接: " + complexJoin);
        // 输出: [Alice(HR); Bob(IT); Charlie(HR)]
    }

    static class Employee {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
    }
}