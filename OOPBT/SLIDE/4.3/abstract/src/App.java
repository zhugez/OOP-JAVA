/* Abstract tao ra cac lop co so de tai su dung ma khong tao ra doi tuong thuc cua lop */
// public class App {
//     public static void main(String[] args) throws Exception {
//         Shape s1 = new Circle(6, 6, 5);
//         System.out.println(s1.y);
//         // Shape s = new Shape(10,10); // error do khong the tao doi tuong tu abstract
//     }
// }
/**
 * App
 */
public class App {
    public static void main(String[] args) {
        int id = 20075351;
        String name = "Zhuge";
        Person p1 = new Student(id, name);
        p1.displayInfo();
    }
}