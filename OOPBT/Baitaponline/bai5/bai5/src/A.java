public class A extends Room {

    public A() {
        super("A", 500);
    }

    @Override
    public String toString() {
        return "Room A: {" + "category='" + category + '\'' + ", price=" + price + '}';
    }
}
