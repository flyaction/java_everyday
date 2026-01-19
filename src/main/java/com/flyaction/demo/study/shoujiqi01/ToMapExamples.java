package com.flyaction.demo.study.shoujiqi01;

import java.util.*;
import java.util.stream.*;

/**
 * toMap() 示例 	收集到映射	需要键值提取器，可处理键冲突
 */
public class ToMapExamples {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 5000),
            new Employee("Bob", "IT", 6000),
            new Employee("Charlie", "HR", 5200),
            new Employee("David", "IT", 6500)
        );
        
        // 简单的 toMap - 姓名作为键，员工对象作为值
        Map<String, Employee> employeeMap = employees.stream()
            .collect(Collectors.toMap(
                Employee::getName,  // 键提取器
                employee -> employee  // 值提取器
            ));
        System.out.println("员工映射: " + 
            employeeMap.keySet().stream()
                .map(key -> key + "=" + employeeMap.get(key).getDepartment())
                .collect(Collectors.joining(", ")));
        // 输出类似: Alice=HR, Bob=IT, Charlie=HR, David=IT
        
        // 处理键冲突的情况
        List<Employee> employeesWithDuplicates = Arrays.asList(
            new Employee("Alice", "HR", 5000),
            new Employee("Bob", "IT", 6000),
            new Employee("Alice", "Finance", 5500)  // 重复的键
        );
        
        Map<String, Employee> mergedMap = employeesWithDuplicates.stream()
            .collect(Collectors.toMap(
                Employee::getName,
                employee -> employee,
                (existing, replacement) -> {
                    // 处理键冲突：保留工资更高的员工
                    return existing.getSalary() >= replacement.getSalary() 
                        ? existing : replacement;
                }
            ));
        System.out.println("处理冲突后的映射: " + 
            mergedMap.entrySet().stream()
                .map(e -> e.getKey() + "=" + e.getValue().getDepartment())
                .collect(Collectors.joining(", ")));
        // 输出: Alice=Finance, Bob=IT
        
        // 指定特定的 Map 实现
        Map<String, Double> salaryMap = employees.stream()
            .collect(Collectors.toMap(
                Employee::getName,
                Employee::getSalary,
                (v1, v2) -> v1,  // 如果键重复，保留第一个值
                TreeMap::new  // 使用 TreeMap 保持排序
            ));
        System.out.println("排序的薪资映射: " + salaryMap);
        // 输出: {Alice=5000.0, Bob=6000.0, Charlie=5200.0, David=6500.0}
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