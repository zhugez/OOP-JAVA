public class App {
    public static void main(String[] args) throws Exception {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
