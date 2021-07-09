public class C extends Room {
    public C() {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "Room C: {" + "category='" + category + '\'' + ", price=" + price + '}';
    }
}
