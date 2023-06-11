package employee;

import config.InputScanner;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee(1, "Nhung1", 27, false, 1, employee.setSalary(employee.calSalary()));
        Employee employee2 = new Employee(2, "Nhung2", 26, true, 2, employee.setSalary(employee.calSalary()));
        Employee employee3 = new Employee(3, "Nhung3", 25, false, 3, employee.setSalary(employee.calSalary()));
        Employee employee4 = new Employee(4, "Nhung4", 24, true, 4, employee.setSalary(employee.calSalary()));
        Employee employee5 = new Employee(5, "Nhung5", 23, false, 5, employee.setSalary(employee.calSalary()));
        employee1.display();
        employee2.display();
        employee3.display();
        employee4.display();
        employee5.display();
        System.out.println("Nhap mnv");
        employee.setEmployeeId(InputScanner.scanner().nextInt());
        System.out.println("Nhap ten");
        employee.setEmployeeName(InputScanner.scanner().nextLine());
        System.out.println("Nhap tuoi");
        employee.setEmployeeAge(InputScanner.scanner().nextInt());
        System.out.println("Nhap gioi tinh");
        employee.setEmployeeGender(InputScanner.scanner().nextBoolean());
        System.out.println("he so luong");
        employee.setRate(InputScanner.scanner().nextDouble());
        employee.setSalary(employee.calSalary());
        employee.display();
    }
}
