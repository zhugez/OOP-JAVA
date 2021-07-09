public class App {
    public static void main(String[] args) throws Exception {
        PassByRef passByRef = new PassByRef();
        MyClass aObj = new MyClass();

        aObj.setA(2);
        System.out.println("Before: " + aObj.getA());

        passByRef.doSomething(aObj);
        System.out.println("After: " + aObj.getA());
    }
}
