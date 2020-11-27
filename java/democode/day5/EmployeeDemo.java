package com.accenture.democode.day5;

import com.accenture.democode.day5.inheritance.Manager;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee acnEmployee = new Employee("jeremy.a.argosino");
        Employee acnEmployee2 = new Employee("jere.me");

        acnEmployee.work();
        acnEmployee2.work();

        System.out.println(Employee.employeeMessage("user.1",
                11));

        Manager manager = new Manager("manager.1", 6, "AWS");
        manager.work();
    }
}
