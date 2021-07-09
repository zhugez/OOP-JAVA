public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Zhuge's World!");

        Circle c1 = new Circle(10.3F);
        Circle c2 = new Circle(5.7F);

        System.out.println("C1 radius = " + c1.radius);
        System.out.println("C1 Pi = " + c1.PI);

        System.out.println("C2 radius = " + c2.radius);
        System.out.println("C2 Pi = " + c2.PI);

        System.out.println("\nPI = " + Circle.PI);

        c1.radius = 16.2F;
        c1.PI = 7.8F;

        System.out.println("C1 radius = " + c1.radius);
        System.out.println("C1 Pi = " + c1.PI);

        System.out.println("C2 radius = " + c2.radius);
        System.out.println("C2 Pi = " + c2.PI);
    }
}
