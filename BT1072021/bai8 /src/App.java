
//import ca the gioi ne
import java.util.*;

public class App {
    // mớ string cho gọn code
    private static final String done = "Sucessful at ";
    private static final String failed = "Oh noooo!:( ";
    private static final String tryString = "Please try again! ";

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int age, MSSV, MSGV;
        float DiemMon1, DiemMon2;
        double HSL;
        manageSchool manageSchool = new manageSchool();
        while (true) {
            System.out.println("Application Manage School");
            System.out.println("Press 1: To add student.");
            System.out.println("Press 2: To add teacher.");
            System.out.println("Press 3: To show information student.");
            System.out.println("Press 4: To show information teacher.");
            System.out.println("Press 5: To exit.");
            String line = input.nextLine();// Bat input vao ne r luu vao bien line
            switch (line) {// Dieu kien ne
                case "1": { // Input info student
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    while (true) {
                        try {
                            System.out.print("Enter age:");
                            age = Integer.parseInt(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(tryString);
                        }
                    }
                    System.out.print("Enter gender: ");
                    String gender = input.nextLine();
                    System.out.print("Enter address: ");
                    String address = input.nextLine();
                    while (true) {
                        try {
                            System.out.print("Enter MSSV: ");
                            MSSV = Integer.parseInt(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(tryString);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Enter Diem Mon 1: ");
                            DiemMon1 = Float.parseFloat(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(tryString);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Enter Diem Mon 2: ");
                            DiemMon2 = Float.parseFloat(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(tryString);
                        }
                    }
                    manageSchool.addStudent(new Student(name, age, gender, address, MSSV, DiemMon1, DiemMon2));
                    System.out.println(done + "adding new student!");
                    break;
                }
                case "2": {
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    while (true) {
                        try {
                            System.out.print("Enter age:");
                            age = Integer.parseInt(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(tryString);
                        }
                    }
                    System.out.print("Enter gender: ");
                    String gender = input.nextLine();
                    System.out.print("Enter address: ");
                    String address = input.nextLine();
                    while (true) {
                        try {
                            System.out.print("Enter MSGV: ");
                            MSGV = Integer.parseInt(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(tryString);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Enter HSL: ");
                            HSL = Double.parseDouble(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(tryString);
                        }
                    }
                    manageSchool.addTeacher(new Teacher(name, age, gender, address, MSGV, HSL));
                    System.out.println(done + "adding new teacher!");
                    break;
                }
                case "3": {
                    System.out.println("List of students: ");
                    if (manageSchool.getListStudents().isEmpty())
                        System.out.println(failed + "Not found any student!" + "\n" + tryString);
                    manageSchool.showInfoStudent();
                    break;
                }
                case "4": {
                    System.out.println("List of teachers: ");
                    if (manageSchool.getListTeachers().isEmpty())
                        System.out.println(failed + "Not found any teacher!" + "\n" + tryString);
                    manageSchool.showInfoTeacher();
                    break;
                }
                case "5": {
                    input.close();
                    return;
                }
                default:
                    System.out.println("Input Invalid");
                    continue;
            }
        }
    }
}