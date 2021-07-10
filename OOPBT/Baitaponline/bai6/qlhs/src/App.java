import java.util.*;
//import ca the gioi ^^

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        School school = new School();
        while (true) {
            System.out.println("---------------------------------------------------");
            System.out.println("Chương trình quản lý hồ sơ học sinh!!!");
            System.out.println("---------------------------------------------------");
            System.out.println("Nhập 1 để thêm học sinh mới.");
            System.out.println("Nhập 2 để hiển thị các học sinh 20 tuổi.");
            System.out.println("Nhập 3 để biết số lượng các học sinh có tuổi là 23 và quê ở DN.");
            System.out.println("Nhập 4 để thoát khỏi chương trình.");
            String line = input.nextLine();

            switch (line) {
                case "1": {// Nhập info học sinh mới
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(input.nextLine());
                    System.out.print("Enter hometown: ");
                    String hometown = input.nextLine();
                    System.out.print("Enter class: ");
                    int classStudent = Integer.parseInt(input.nextLine());
                    Student student = new Student(name, age, hometown, classStudent);
                    school.add(student);
                    System.out.println("Thêm thành công 1 học sinh mới!!! ^^");
                    break;
                }
                case "2": {
                    System.out.println("Các học sinh 20 tuổi: ");
                    // Dung forEach de in ra danh sach hoc sinh da duoc loc bang Stream.
                    school.getStudent20YearOld().forEach(Student -> System.out.println(Student.toString()));
                    break;
                }
                case "3": {// Dem Số lượng học sinh có tuổi là 23 và quê ở DN.
                    System.out.println("Số lượng học sinh có tuổi là 23 và quê ở DN: ");
                    System.out.println(school.countStudent23YearOldInDN());
                    break;
                }
                case "4": {
                    input.close();
                    return;
                }
                default:
                    System.out.printf("Input Invalid"); // Input failed
                    continue;
            }
        }
    }
}
// Luu y: Printf: Xuất ra màng hình kết quả đồng thời có thể định
// dạng được kết quả đó nhờ vào các đối số thích hợp.(Giong C)
// Print: Xuất kết quả ra màn hình nhưng con trỏ chuột không xuống dòng.
