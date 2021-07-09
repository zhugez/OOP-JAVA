import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        number a, b; // hai doi tuong Number a va b
        swap swap = new swap(); // doi tuong swap thuoc lop swap
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap a : ");
        a = new number(input.nextInt()); // khoi tao number a
        System.out.print("Nhap b : ");
        b = new number(input.nextInt()); // Khoi tao number b
        input.close();
        System.out.println("Befor swap: a = " + a.getNum() + " b = " + b.getNum());
        swap.swap(a, b); // su dung ham swap
        System.out.println("After swap: a = " + a.getNum() + " b = " + b.getNum());

    }
}
