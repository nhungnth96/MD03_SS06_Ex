package employee;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private boolean employeeGender;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int employeeAge, boolean employeeGender, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.rate = rate;
        this.salary = calSalary();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public boolean isEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(boolean employeeGender) {
        this.employeeGender = employeeGender;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        return this.salary = salary;
    }

    public void display() {
        System.out.println("Id: " + employeeId + " | Name: " + employeeName + " | Age: " + employeeAge + " | Gender: " + (employeeGender ? "Male" : "Female") + "| Salary: " + salary);
    }

    public double calSalary() {
        return salary = rate * 1300000;
    }
}

