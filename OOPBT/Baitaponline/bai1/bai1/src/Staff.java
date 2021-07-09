public class Staff extends Officer {
   private String Task; // Bien luu thuoc tinh rieng : Cong viec

   public Staff(String name, int age, String gender, String address, String Task) {
      super(name, age, gender, address);
      this.Task = Task;
   }

   public String getTask() {
      return Task; // Lay thong tin cong viec
   }

   public void setTask(String Task) {
      this.Task = Task; // Nhap vao cong viec
   }

   @Override
   public String toString() {
      return "Staff{" + "task='" + Task + '\'' + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender
            + '\'' + ", address='" + address + '\'' + '}';
   }
}
