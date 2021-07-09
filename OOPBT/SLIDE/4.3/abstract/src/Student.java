public class Student extends Person {
   public Student(int id, String name) {
      super(id, name);
   }

   public void displayInfo() {
      System.out.println("Student id: " + super.id);
      System.out.println("Name: " + super.name);
   }
}
