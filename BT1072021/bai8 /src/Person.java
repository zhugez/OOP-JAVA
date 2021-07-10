/**
 * Person
 */
public class Person {
   // cac thuoc tinh co ban cua mot Person
   protected String name;
   protected int age;
   protected String gender;
   protected String address;

   public Person(String name, int age, String gender, String address) { // Constructor ne :>
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.address = address;
   }

   // getter va setter ne ^^
   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public String getGender() {
      return gender;
   }

   public String getAddress() {
      return address;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public void setAddress(String address) {
      this.address = address;
   }
}