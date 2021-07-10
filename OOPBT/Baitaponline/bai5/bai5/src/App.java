import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {// Menu nhung dich vu co the lam voi chuong trinh
            System.out.println("Welcome to Luxury Hotel!!!");
            System.out.println("This is an application to manage customers.");
            System.out.println("Please enter 1: To insert person for rent.");
            System.out.println("Please enter 2: To remove person by passport.");
            System.out.println("Please enter 3: To calculator price by passport.");
            System.out.println("Please enter 4: To show infor.");
            System.out.println("Please enter 5: To exit.");
            String line = scanner.nextLine();
            switch (line) {
                case "1": { // Nhap thong tin & add nguoi thue phong
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Input a to rent room type A.");
                    System.out.println("Input to rent room type B.");
                    System.out.println("Input c to rent room type C.");
                    String choice = scanner.nextLine();
                    Room room;
                    if (choice.equals("a")) {
                        room = new A();
                    } else if (choice.equals("b")) {
                        room = new B();
                    } else if (choice.equals("c")) {
                        room = new C();
                    } else {
                        System.out.println("Input invalid! :((");
                        continue;
                    }
                    System.out.print("Enter number day for rent: ");
                    int numberRent = Integer.parseInt(scanner.nextLine());
                    Person person = new Person(name, age, passport, room, numberRent);
                    hotel.add(person);
                    break;
                }
                case "2": {// Xoa thong tin nguoi thue phong bang Passport
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    System.out.println("Delete successful!");
                    break;
                }
                case "3": {// Tinh tien nguoi thue phong thong qua Passport
                    System.out.print("Enter passport: ");
                    String passport = scanner.nextLine();
                    System.out.println("Price: " + hotel.calculator(passport));
                    break;
                }
                case "4": {// Show thong tin tat ca nhung nguoi thue phong
                    System.out.println("The result:");
                    hotel.show();
                    break;
                }
                case "5": {
                    scanner.close();

                    return;
                }
                default:
                    System.out.println("Input invalid");
                    continue;
            }
        }

    }
}
