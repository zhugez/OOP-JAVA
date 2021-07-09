import java.util.*;//import thu vien util ne ^^

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // khoi tao 1 cai scanner ne ^^
        manageCandidates manageCandidates = new manageCandidates(); // khoi tao 1 obj quan ly candidate
        while (true) {// Cho vong lap de dam bao chuong trinh luon chay cho den khi ta muon thoat
            /*
             * Con day la mot cai menu cute de thong bao cac thao tac cong viec co the lam
             * voi chuong trinh nay nah :>
             */
            System.out.println("-------------------------------------------");
            System.out.println("Application Manager Candidate.");
            System.out.println("-------------------------------------------");
            System.out.println("Enter 1: To insert candidate.");
            System.out.println("Enter 2: To show information of candidate. ");
            System.out.println("Enter 3: To search candidate by SBD.");
            System.out.println("Enter 4: To exit.");
            System.out.println("-------------------------------------------");
            System.out.println("Input your choice: ");

            String line = scanner.nextLine();

            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            manageCandidates.add(createCadidate(scanner, "a"));
                            break;

                        }
                        case "b": {
                            manageCandidates.add(createCadidate(scanner, "b"));
                            break;
                        }
                        case "c": {
                            manageCandidates.add(createCadidate(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.printf("Our results for your request: \n");

                    manageCandidates.showInfor();
                    break;
                }
                case "3": { // Tim kiem candidate bang SBD ne ^^
                    System.out.print("Enter SBD: ");
                    String SBD = scanner.nextLine();
                    Candidates candidate = manageCandidates.searchBySBD(SBD);
                    System.out.printf("The result: ");

                    if (candidate == null) {
                        System.out.println("Not found! :((");
                    } else {
                        System.out.printf(candidate.toString());
                    }
                    break;
                }
                case "4": {
                    scanner.close();

                    return;
                }
                default:
                    System.out.printf("Input Invalid"); // Input failed
                    continue;
            }

        }
    }

    public static Candidates createCadidate(Scanner scanner, String cate) { // Ham tao 1 candidate moi
        // Dau tien cho nhap info cac thu ne :>
        System.out.print("Enter SBD: ");
        String SBD = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter diachi: ");
        String diachi = scanner.nextLine();
        System.out.print("Enter muc uu tien: ");
        String mucuutien = scanner.nextLine();
        // Xong roi khoi tao cac doi tuong voi cac gia tri ta vua nhap ne
        if (cate.equals("a")) {
            return new A(SBD, name, diachi, mucuutien);
        } else if (cate.equals("b")) {
            return new B(SBD, name, diachi, mucuutien);
        } else {
            return new C(SBD, name, diachi, mucuutien);
        }

    }
}
