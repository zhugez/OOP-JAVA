/**
 * App
 */
// Instance Method
/*
 * public class Rectangle { private float length; private float width;
 * 
 * public Rectangle() { length = 0; width = 0; }
 * 
 * public Rectangle(float l, float w) { length = l; width = w; }
 * 
 * public float area() { return length * width; } }
 */
/**
 * App
 */
public class App {
    public static void main(String[] args) {
        int x = 10;
        PassByValue obj = new PassByValue();
        System.out.println("Before PassMethod: " + x);
        obj.doubleValue(x);
        System.out.println("After PassMethod: " + x);
    }

}