
//import ca the gioi ne
import java.util.*;

public class App {
    // Lam cai bien const cho gon code
    private static final String FAILED = "Oh noo !Failed! :((\n";
    private static final String SUCCESS = "Congratulations! Removing Sucessful! ^^\n";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManageCard manageCard = new ManageCard();
        while (true) {
            System.out.println("Application Manager Library Card!");
            System.out.println("Enter 1: To insert card.");
            System.out.println("Enter 2: To remove Card. ");
            System.out.println("Enter 3: To show information card by id.");
            System.out.println("Enter 4: To show all card .");
            System.out.println("Enter 5: To exit.");
            String line = input.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = Integer.parseInt(input.nextLine());
                    System.out.print("Enter class: ");
                    String sclass = input.nextLine();
                    System.out.print("Enter ID: ");
                    String id = input.nextLine();
                    System.out.print("Enter borrow date: ");
                    int borrowDates = Integer.parseInt(input.nextLine());
                    System.out.print("Enter payment date: ");
                    int paymentDates = Integer.parseInt(input.nextLine());
                    System.out.print("Enter book ID: ");
                    int bookid = Integer.parseInt(input.nextLine());
                    Student student = new Student(name, age, sclass);
                    Card card = new Card(student, id, borrowDates, paymentDates, bookid);
                    manageCard.add(card);
                    break;
                }
                case "2": {
                    System.out.print("Enter id to remove: ");
                    String id = input.nextLine();
                    System.out.print(manageCard.delete(id) ? SUCCESS : FAILED);
                }
                    break;
                case "3": {
                    System.out.print("Enter ID: ");
                    String id = input.nextLine();
                    Card card = manageCard.searchByID(id);
                    if (card == null) {
                        System.out.println("Not found");
                    } else {
                        System.out.println(card.toString());
                    }
                    break;
                }
                case "4": {
                    System.out.print("The result:\n ");
                    manageCard.showAllcards();
                    break;
                }
                case "5": {
                    input.close();
                    return;
                }
                default:
                    System.out.println("Invalid code!");
                    continue;
            }
        }
    }
}
