package com.flyaction.demo.study.shoujiqi01;

import java.util.*;
import java.util.stream.*;

/**
 *  分组 分组收集	强大的分组功能，支持多级分组
 */
public class GroupingByExamples {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 5000),
            new Employee("Bob", "IT", 6000),
            new Employee("Charlie", "HR", 5200),
            new Employee("David", "IT", 6500),
            new Employee("Eve", "Finance", 7000),
            new Employee("Frank", "Finance", 5500)
        );
        
        // 简单分组 - 按部门分组
        Map<String, List<Employee>> employeesByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));
        
        System.out.println("按部门分组:");
        employeesByDept.forEach((dept, empList) -> 
            System.out.println(dept + ": " + 
                empList.stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(", ")))
        );
        // 输出:
        // HR: Alice, Charlie
        // Finance: Eve, Frank
        // IT: Bob, David
        
        // 分组后对值进行进一步处理
        Map<String, Long> deptCount = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.counting()  // 统计每个部门的人数
            ));
        System.out.println("各部门人数: " + deptCount);
        // 输出: {HR=2, Finance=2, IT=2}
        
        // 分组后计算平均薪资
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
            ));
        System.out.println("各部门平均薪资: " + avgSalaryByDept);
        // 输出类似: {HR=5100.0, Finance=6250.0, IT=6250.0}
        
        // 多级分组 - 先按部门，再按薪资级别
        Map<String, Map<String, List<Employee>>> multiLevelGrouping = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.groupingBy(emp -> 
                    emp.getSalary() >= 6000 ? "高薪" : "普通"
                )
            ));
        
        System.out.println("\n多级分组结果:");
        multiLevelGrouping.forEach((dept, salaryGroup) -> {
            System.out.println("部门: " + dept);
            salaryGroup.forEach((level, empList) ->
                System.out.println("  " + level + ": " +
                    empList.stream()
                        .map(Employee::getName)
                        .collect(Collectors.joining(", ")))
            );
        });
        // 输出:
        // 部门: HR
        //   普通: Alice, Charlie
        // 部门: Finance
        //   高薪: Eve
        //   普通: Frank
        // 部门: IT
        //   高薪: Bob, David
        
        // 使用特定 Map 实现的分组
        Map<String, Set<String>> namesByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                TreeMap::new,  // 使用 TreeMap 保持部门名称排序
                Collectors.mapping(
                    Employee::getName,
                    Collectors.toSet()  // 收集为 Set 去重
                )
            ));
        System.out.println("\n排序的部门-姓名映射: " + namesByDept);
        // 输出类似: {Finance=[Eve, Frank], HR=[Alice, Charlie], IT=[Bob, David]}
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