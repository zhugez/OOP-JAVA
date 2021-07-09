// Tuong tu voi class Staff
public class Engineer extends Officer {
   private String Major;// Bien luu thuoc tinh rieng : Nganh dao tao

   public Engineer(String name, int age, String gender, String address, String Major) {
      super(name, age, gender, address);
      this.Major = Major;
   }

   public String getMajor() {
      return Major; // Lay thong tin nganh dao tao
   }

   public void setMajor(String major) {
      this.Major = major; // Nhap vao nganh dao tao
   }

   @Override
   public String toString() {
      return "Engineer{" + "Major='" +    Major + '\'' + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender
            + '\'' + ", address='" + address + '\'' + '}';
   }
}
