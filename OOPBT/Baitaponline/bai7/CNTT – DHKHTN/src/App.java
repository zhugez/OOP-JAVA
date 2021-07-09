
//import ca the gioi ne ^^
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManageTeacher manageTeacher = new ManageTeacher();
        while (true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Chương trình quản lý thanh toán tiền lương cho các cán bộ giáo viên!!!");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Nhập 1 để thêm cán bộ mới.");
            System.out.println("Nhập 2 để xóa cán bộ .");
            System.out.println("Nhập 3 để tính tiền lương.");
            System.out.println("Nhập 4 để thoát khỏi chương trình.");
            String line = input.nextLine();
            switch (line) {
                case "1": {/// Nhập info cán bộ mới.
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter hometown: ");
                    String hometown = input.nextLine();
                    System.out.print("Enter id: ");
                    String id = input.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = input.nextDouble();
                    System.out.print("Enter bonus: ");
                    double bonus = input.nextDouble();
                    System.out.print("Enter penaty: ");
                    double penaty = input.nextDouble();
                    System.out.print("Enter realsalary: ");
                    double realsalary = input.nextDouble();
                    Teacher teacher = new Teacher(salary, bonus, penaty, realsalary, name, age, hometown, id);
                    manageTeacher.add(teacher);
                    System.out.println("Thêm thành công 1 cán bộ gv mới!!! ^^");
                    input.nextLine();
                    break;
                }
                case "2": {// Xoa can bo gv thong qua id
                    System.out.print("Enter id to remove: ");
                    String id = input.nextLine();
                    System.out.print("The result: ");
                    System.out.print(manageTeacher.deleteById(id) ? "Success! ^^\n" : "Failed! :((\n");
                    break;
                }
                case "3": { // Tinh muc luong thong qua id
                    System.out.print("Enter id to calc: ");
                    String id = input.nextLine();
                    System.out.printf("Lương thực lĩnh của %s là: %.5f\n", id, manageTeacher.getSalary(id));
                    break;

                }
                case "4": {
                    input.close(); // nho close scanner lai de k bi leak resource
                    return;
                }
                default:
                    System.out.printf("Input Invalid"); // Input failed
                    continue;
            }
        }

    }

}
