public class Teacher extends Person implements ShowInfo {
   // Cac thuoc tinh cua Teacher
   private int MSGV;
   private double HSL;

   /// Constructor ne
   public Teacher(String name, int age, String gender, String address, int MSGV, double HSL) {
      super(name, age, gender, address);
      this.MSGV = MSGV;
      this.HSL = HSL;
   }

   // Getter va setter ne :>
   public int getMSGV() {
      return MSGV;
   }

   public double getHSL() {
      return HSL;
   }

   public void setMSGV(int MSGV) {
      this.MSGV = MSGV;
   }

   public void setHSL(double HSL) {
      this.HSL = HSL;
   }

   // Method tính mức lương cho GV: HSL*1200000
   public double CalcHSL(double HSL) {
      return HSL * 1200000;
   }

   @Override
   public String showInfo() {// Method hiển thị thông tin tương ứng với Teacher.
      return "Teacher: {" + "Name: '" + name + '\'' + ", Age:" + age + ", Gender:" + gender + ", Address: '" + address
            + ", MSGV:" + MSGV + ", HSL:" + HSL + ", Muc Luong:" + CalcHSL(HSL) + '\'' + '}';
   }
}
