package student;

import config.InputScanner;

public class Main {
    private static Student[] list = new Student[100];

    private static int size;

    public static void main(String[] args) {

        boolean loop = true;
        while (loop) {
            System.out.println("======Menu======");
            System.out.println("1.Hiển thị danh sách tất cả học sinh");
            System.out.println("2.Thêm mới học sinh");
            System.out.println("3.Sửa thông tin học sinh");
            System.out.println("4.Xóa học sinh");
            System.out.println("5.Thoát");
            System.out.println("Nhập vào lựa chọn của bạn:");
            int choice = InputScanner.scanner().nextInt();
            switch (choice) {
                case 1: // read
                    displayList();
                    break;
                case 2: // create
                    createStudent();
                    break;
                case 3: // update
                    updateStudent();
                    break;
                case 4: // delete
                    deleteStudent();
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("Thank you!!!");
                    loop = false;
                default:
                    System.err.println("Vui lòng nhập số từ 1-5");
            }
        }
    }

    // Read
    public static void displayList() {
        if (size == 0) {
            System.out.println("Danh sách học sinh trống!");
        }
        for (Student s : list) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    // Create
    public static void createStudent() {
        Student newStudent = new Student();
        int id = getNewId();
        newStudent.setId(id);
        System.out.println("Mã học sinh: " + id);
        System.out.println("Tên học sinh: ");
        newStudent.setName(InputScanner.scanner().nextLine());
        System.out.println("Tuổi: ");
        newStudent.setAge(InputScanner.scanner().nextInt());
        System.out.println("Giới tính: ");
        newStudent.setGender(InputScanner.scanner().nextBoolean());
        System.out.println("Địa chỉ: ");
        newStudent.setAddress(InputScanner.scanner().nextLine());
        System.out.println("Số điện thoại: ");
        newStudent.setTel(InputScanner.scanner().nextLine());
        if (create(newStudent)) {
            System.out.println("Thêm mới học sinh thành công");
        }

    }

    public static boolean create(Student student) {
        if (size > 100) {
            System.err.println("Danh sách đầy! Không thể thêm mới");
            return false;

        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = student;
                size++;
                break;
            }
        }
        return true;
    }

    public static int getNewId() {
        int maxId = 0;
        for (Student e : list) {
            if (e == null) {
                continue;
            }
            if (maxId < e.getId()) {
                maxId = e.getId();

            }
        }
        return maxId + 1;
    }

    // Update
    public static void updateStudent() {
        System.out.println("Nhập mã học sinh muốn chỉnh sửa: ");
        int id = InputScanner.scanner().nextInt();
        Student editStudent = findbyId(id);
        if (editStudent != null) {
            System.out.println(editStudent);
            System.out.println("Tên học sinh: ");
            editStudent.setName(InputScanner.scanner().nextLine());
            System.out.println("Tuổi: ");
            editStudent.setAge(InputScanner.scanner().nextInt());
            System.out.println("Giới tính: ");
            editStudent.setGender(InputScanner.scanner().nextBoolean());
            System.out.println("Địa chỉ: ");
            editStudent.setAddress(InputScanner.scanner().nextLine());
            System.out.println("Số điện thoại: ");
            editStudent.setTel(InputScanner.scanner().nextLine());
            update(editStudent);
            System.out.println("Đã chỉnh sửa: " + editStudent);
        } else {
            System.err.println("Không tìm thấy mã học sinh này");

        }
    }

    public static Student findbyId(int id) {
        for (Student s : list) {
            if (s == null) {
                continue;
            }
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public static void update(Student student) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == student.getId()) {
                list[i] = student;
                break;
            }
        }
    }

    // Delete
    public static void deleteStudent() {
        System.out.println("Nhập mã học sinh muốn xóa: ");
        int id = InputScanner.scanner().nextInt();
        Student deleteStudent = findbyId(id);
        if (deleteStudent != null) {
            System.out.println(deleteStudent);
            System.out.println("Bạn chắc chắn muốn xóa học sinh này?");
            System.out.println("1.Có");
            System.out.println("2.Không");
            int choice = InputScanner.scanner().nextInt();
            switch (choice) {
                case 1:
                    delete(id);
                    System.out.println("Xóa học sinh thành công");
                    break;
                case 2:
                    break;
                default:
                    System.err.println("Hãy nhập 1 số từ 1-2");
            }
        } else {
            System.err.println("Không tìm thấy mã học sinh này");
        }
    }

    public static void delete(int id) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                continue;
            }
            if (list[i].getId() == id) {
                list[i] = null;
                size--;
                break;
            }
        }
    }

}
