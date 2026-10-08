package test;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {

        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        1,
                        "Ahmed Ali",
                        Gender.MALE,
                        LocalDate.of(2024, 1, 10),
                        5000,
                        0.10,
                        20000
                );

        MonthlyEmployee monthlyEmployee =
                new MonthlyEmployee(
                        2,
                        "Mariam Ahmed",
                        Gender.FEMALE,
                        LocalDate.of(2023, 5, 15),
                        8000,
                        21,
                        0.05,
                        true
                );

        HourlyEmployee hourlyEmployee =
                new HourlyEmployee(
                        3,
                        "Omar Mohamed",
                        Gender.MALE,
                        LocalDate.of(2025, 2, 1),
                        100,
                        170,
                        150
                );

        Department department =
                new Department(
                        1,
                        "IT Department",
                        monthlyEmployee,
                        new ArrayList<>()
                );

        department.addEmployee(commissionEmployee);
        department.addEmployee(monthlyEmployee);
        department.addEmployee(hourlyEmployee);

        System.out.println("========== EMPLOYEES ==========");

        department.printAllEmployees();

        System.out.println();

        System.out.println("========== SALARIES ==========");

        System.out.println(
                commissionEmployee.getName()
                        + " Salary = "
                        + commissionEmployee.calculateSalary()
        );

        System.out.println(
                monthlyEmployee.getName()
                        + " Salary = "
                        + monthlyEmployee.calculateSalary()
        );

        System.out.println(
                hourlyEmployee.getName()
                        + " Salary = "
                        + hourlyEmployee.calculateSalary()
        );

        System.out.println();

        System.out.println("========== COMMISSION ==========");

        System.out.println(
                "Commission = "
                        + commissionEmployee.calculateCommission()
        );

        System.out.println();

        System.out.println("========== ADDITIONAL VACATION ==========");

        System.out.println(
                monthlyEmployee.getName()
                        + " Additional Vacation = "
                        + monthlyEmployee.calculateAdditionalVacation()
        );

        System.out.println();

        System.out.println("========== FIND EMPLOYEE ==========");

        Employee foundEmployee = department.findEmployee(2);

        if (foundEmployee != null) {
            System.out.println(
                    "Employee found: "
                            + foundEmployee.getName()
            );
        } else {
            System.out.println("Employee not found");
        }

        System.out.println();

        System.out.println("========== TOTAL PAYROLL ==========");

        System.out.println(
                "Total Payroll = "
                        + department.calculateTotalPayroll()
        );
    }
}