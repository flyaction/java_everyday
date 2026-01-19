package com.flyaction.demo.study.shoujiqi01;

import java.util.*;
import java.util.stream.*;


/**
 * toSet() 示例  收集到集合	自动去重，不保证顺序
 */
public class ToSetExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");
        
        // toSet() - 自动去重
        Set<String> nameSet = names.stream()
            .filter(name -> name.length() > 3)
            .collect(Collectors.toSet());
        System.out.println("toSet 示例: " + nameSet);
        // 输出: [Alice, Charlie, David] (自动去重，顺序可能不同)
        
        // 自定义对象示例
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 5000),
            new Employee("Bob", "IT", 6000),
            new Employee("Alice", "IT", 5500),
            new Employee("Charlie", "HR", 5200)
        );
        
        // 根据姓名去重收集
        Set<String> uniqueNames = employees.stream()
            .map(Employee::getName)
            .collect(Collectors.toSet());
        System.out.println("员工姓名集合: " + uniqueNames);
        // 输出: [Alice, Bob, Charlie]
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