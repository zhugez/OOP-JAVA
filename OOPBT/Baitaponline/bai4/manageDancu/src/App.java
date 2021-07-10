
//import ca the gioi :((
import java.util.*;

public class App {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập n hộ dân:");
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter address:");
            String address = input.nextLine();
            System.out.println("Enter number person");
            int number = Integer.parseInt(input.nextLine());
            List<Person> persons = new ArrayList<>();// Tao 1 arrayList person
            for (int j = 0; j < number; j++) {
                // Nhap tung nguoi trong gia dinh
                System.out.print("Enter name: ");
                String name = input.nextLine();
                System.out.print("Enter age: ");
                int age = Integer.parseInt(input.nextLine());
                System.out.print("Enter job: ");
                String job = input.nextLine();
                System.out.println("Enter passport: ");
                String passport = input.nextLine();
                // Dung phuong thuc add de them doi tuong Person vao Arraylist ta da tao o tren
                persons.add(new Person(name, age, job, passport));
            }
            town.addFamily(new Family(persons, address)); // add ho gia dinh
        }
        System.out.println("Thông tin của các hộ trong khu phố: ");
        town.showAll();
        input.close();
    }
}
