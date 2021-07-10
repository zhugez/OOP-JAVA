import java.util.Scanner;// Scanner  sử dụng để đọc dữ liệu đầu vào từ các nguồn khác nhau. Xem chi tiet tai: https://cafedev.vn/tu-hoc-java-lop-scanner-trong-java/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true) {
            System.out.println("\nApplication Manager Officer");
            System.out.println("Press 1: To insert officer.");
            System.out.println("Press 2: To search officer by name.");
            System.out.println("Press 3: To show information officers.");
            System.out.println("Press 4: To exit.");
            String line = scanner.nextLine();// Bat input vao ne r luu vao bien line
            switch (line) {// Dieu kien ne
                case "1": {
                    System.out.println("Enter a: to insert Enginner");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter gender: ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter major: ");
                            String major = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, major);
                            managerOfficer.addOfficer(engineer);
                            // System.out.println(engineer.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age:");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter gender: ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            int level = Integer.parseInt(scanner.nextLine());
                            Officer worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            // System.out.println(worker.toString());
                            break;
                        }
                        case "c": {
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.print("Enter gender: ");
                            String gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            String task = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            // System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    System.out.print("The result: ");
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    System.out.print("List Officer:\n");
                    managerOfficer.showListInforOfficer();
                    break;
                }
                case "4": {
                    scanner.close();
                    return;
                }
                default:
                    System.out.println("Input Invalid");
                    continue;
            }
        }
    }
}
