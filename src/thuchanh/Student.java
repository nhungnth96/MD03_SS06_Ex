package thuchanh;

public class Student {
    int studentId;
    String studentName;
    boolean sex;
    String className;
    int age;
    String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.age = age;
        this.className = className;
        this.address = address;
    }

    public void display() {
        System.out.println(" MHS: " + studentId + "\n" +
                " Name: " + studentName + "\n" +
                " Sex: " + (sex ? "Male" : "Female") + "\n" +
                " Class: " + className + "\n" +
                " Age: " + age + "\n" +
                " Address: " + address);


    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
