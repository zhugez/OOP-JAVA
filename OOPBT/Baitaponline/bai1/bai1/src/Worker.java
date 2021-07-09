// Tuong tu voi class Staff
public class Worker extends Officer {
   private int level; // Bien luu thuoc tinh rieng : Bac(1->10)

   public Worker(String name, int age, String gender, String address, int level) {
      super(name, age, gender, address);
      this.level = level;
   }

   public int getLevel() {
      return level; // Lay thong tin level ^^
   }

   public void setLevel(int level) {
      this.level = level; // Nhap vao level :))
   }

   @Override
   public String toString() {
      return "Worker{" + "level=" + level + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\''
            + ", address='" + address + '\'' + '}';
   }
}
