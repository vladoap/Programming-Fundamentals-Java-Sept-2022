package ObjectsAndClasses.MoreExercise.P01CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        List<Employee> resultList = new ArrayList<>();



        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scan.nextLine();
            String[] inputArr = input.split("\\s+");
            String name = inputArr[0];
            double salary = Double.parseDouble(inputArr[1]);
            String position = inputArr[2];
            String depart = inputArr[3];
            String email;
            int age;

            if (input.contains("@")) {
                email = inputArr[4];
            } else {
                email = "n/a";
            }

            if (!input.contains("@") && inputArr.length == 5) {
                age = Integer.parseInt(inputArr[4]);
            } else if (input.contains("@") && inputArr.length == 6) {
                age = Integer.parseInt(inputArr[5]);
            } else {
                age = -1;
            }

            employeeList.add(new Employee(name, salary, position, depart, email, age));
            boolean isExist = false;
            for (Department department : departmentList) {
                if (department.getName().equals(depart)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                departmentList.add(new Department(depart));
            }

        }
        setAverageSalaryPerDeparment(employeeList, departmentList);
        Department highestSalaryDepartment = getHighestAverageSalary(departmentList);

        for (Employee employee : employeeList) {
           if (findEmployee(employee, highestSalaryDepartment) != null) {
               resultList.add(employee);
           }
        }

       resultList.sort(Comparator.comparingDouble(Employee :: getSalary).reversed());

        printEmployees(resultList, highestSalaryDepartment);





    }

    public static void setAverageSalaryPerDeparment(List<Employee> employeeList, List<Department> departmentList) {
        for (Department department : departmentList) {
            double salarySum = 0;

            for (Employee employee : employeeList) {
                if (employee.getDepartment().equals(department.getName())) {
                    salarySum += employee.getSalary();
                }
            }
            department.setAvrgSalary(salarySum);
        }
    }

     public static Department getHighestAverageSalary(List<Department> departmentList) {
        departmentList.sort(Comparator.comparingDouble(Department :: getAvrgSalary).reversed());
        return departmentList.get(0);

     }

     public static Employee findEmployee(Employee employee, Department highestSalaryDepartment ) {

            if (employee.getDepartment().equals(highestSalaryDepartment.getName())) {
                return employee;
            }
            return null;
        }


        public static void printEmployees(List<Employee> resultList, Department highestSalaryDepartment) {
            StringBuilder sb = new StringBuilder("Highest Average Salary: ");
            sb.append(highestSalaryDepartment.getName());
            sb.append(System.lineSeparator());
            for (Employee employee : resultList) {
                sb.append(employee.getName() + " ");
                sb.append(String.format("%.2f", employee.getSalary()) + " ");
                sb.append(employee.getEmail() + " ");
                sb.append(employee.getAge());
                sb.append(System.lineSeparator());
            }

            System.out.println(sb);

        }

     }

