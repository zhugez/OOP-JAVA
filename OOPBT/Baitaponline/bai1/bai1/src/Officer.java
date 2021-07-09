public class Officer {
   protected String name;
   protected int age;
   protected String gender;
   protected String address; // Khai bao bien ne ^^

   public Officer(String name, int age, String gender, String address) {
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.address = address;
   } // Khoi tao constructor ne ^^

   // Cac method de lay thong tin ne ^^
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

   // Cac method de them thong tin vao ne ^^
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
