public class B extends Room {
    public B() {
        super("B", 300);
    }

    @Override
    public String toString() {
        return "Room B: {" + "category='" + category + '\'' + ", price=" + price + '}';
    }
}
