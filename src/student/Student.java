package student;

public class Student {

    private int id;
    private String name;
    private int age;
    private boolean gender;
    private String address;
    private String tel;

    public Student() {
    }

    public Student(int id, String name, int age, boolean gender, String address, String tel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Mã học sinh: " + id + " |Tên học sinh: " + name + " | Tuổi: " + age
                + " | Giới tính: " + (gender ? "Nam" : "Nữ") +
                " | Địa chỉ: " + address + " | SĐT: " + tel;
    }

}
