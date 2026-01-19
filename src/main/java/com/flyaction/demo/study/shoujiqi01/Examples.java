package com.flyaction.demo.study.shoujiqi01;

import java.util.*;
import java.util.stream.*;

public class Examples {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 5000),
            new Employee("Bob", "IT", 6000),
            new Employee("Charlie", "HR", 5200),
            new Employee("David", "IT", 6500),
            new Employee("Eve", "Finance", 7000),
            new Employee("Frank", "Finance", 5500),
            new Employee("Grace", "IT", 6200)
        );
        
        // 综合应用：分析员工数据
        Map<String, String> departmentSummary = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.collectingAndThen(
                    Collectors.toList(),
                    list -> {
                        long count = list.size();
                        double avgSalary = list.stream()
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .orElse(0.0);
                        String names = list.stream()
                            .map(Employee::getName)
                            .sorted()
                            .collect(Collectors.joining(", "));
                        return String.format("人数: %d, 平均薪资: %.2f, 员工: [%s]", 
                            count, avgSalary, names);
                    }
                )
            ));
        
        System.out.println("部门综合分析:");
        departmentSummary.forEach((dept, summary) -> 
            System.out.println(dept + " -> " + summary)
        );
        
        // 输出示例:
        // HR -> 人数: 2, 平均薪资: 5100.00, 员工: [Alice, Charlie]
        // Finance -> 人数: 2, 平均薪资: 6250.00, 员工: [Eve, Frank]
        // IT -> 人数: 3, 平均薪资: 6233.33, 员工: [Bob, David, Grace]
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