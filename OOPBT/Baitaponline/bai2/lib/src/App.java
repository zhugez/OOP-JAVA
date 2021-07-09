import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manageDocs manageDocs = new manageDocs();
        while (true) {
            System.out.println("Application Manager Docs");
            System.out.println("Enter 1: To insert Docs.");
            System.out.println("Enter 2: To search Docs by category. ");
            System.out.println("Enter 3: To show information Docs.");
            System.out.println("Enter 4: To remove Docs by code.");
            System.out.println("Enter 5: To exit.");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Newspaper");
                    System.out.println("Enter c: to insert Magazin");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter Code: ");
                            String code = scanner.nextLine();
                            System.out.print("Enter name of publisher: ");
                            String namepub = scanner.nextLine();
                            System.out.print("Enter circulation: ");
                            int circ = scanner.nextInt();
                            System.out.print("Enter author: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("Enter page number: ");
                            int nop = scanner.nextInt();
                            Docs books = new Books(code, namepub, circ, author, nop);
                            manageDocs.addDocs(books);
                            // System.out.println(books.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                            System.out.print("Enter Code: ");
                            String code = scanner.nextLine();
                            System.out.print("Enter name of publisher: ");
                            String namepub = scanner.nextLine();
                            System.out.print("Enter circulation: ");
                            int circ = scanner.nextInt();
                            System.out.print("Enter Day issue: ");
                            int dayp = scanner.nextInt();
                            Docs newspaper = new Newspapers(code, namepub, circ, dayp);
                            manageDocs.addDocs(newspaper);
                            // System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter Code: ");
                            String code = scanner.nextLine();
                            System.out.print("Enter name of publisher: ");
                            String namepub = scanner.nextLine();
                            System.out.print("Enter circulation: ");
                            int circ = scanner.nextInt();
                            System.out.print("Enter issue number : ");
                            int nopb = scanner.nextInt();
                            System.out.print("Enter issue month : ");
                            int monthp = scanner.nextInt();
                            Docs Magazins = new Magazins(code, namepub, circ, nopb, monthp);
                            manageDocs.addDocs(Magazins);
                            // System.out.println(Magazins.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search Magazins");
                    String choise = scanner.nextLine();
                    System.out.print("The result: ");

                    switch (choise) {
                        case "a": {
                            manageDocs.searchByBook();
                            break;
                        }
                        case "b": {
                            manageDocs.searchByNewspaper();
                            break;
                        }
                        case "c":
                            manageDocs.searchByMagazins();
                            break;
                        default:
                            System.out.println("Invalid code");
                            break;
                    }
                    break;
                }
                case "3": {
                    System.out.print("The result: ");
                    manageDocs.showInfo();
                    break;
                }
                case "4": {
                    System.out.print("Enter code to remove: ");
                    String code = scanner.nextLine();
                    System.out.print("The result: ");
                    System.out.print(manageDocs.deleteDocs(code) ? "Success! ^^\n" : "Failed! :((\n");
                }
                    break;
                case "5": {
                    scanner.close();

                    return;
                }
                default:
                    System.out.println("Invalid code!");
                    continue;
            }

        }
    }

}
