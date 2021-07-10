public class Student extends Person implements ShowInfo {
   // Cac thuoc tinh cua Student
   private int MSSV;

   private float DiemMon1;
   private float DiemMon2;

   // Constructor ne
   public Student(String name, int age, String gender, String address, int MSSV, float DiemMon1, float DiemMon2) {
      super(name, age, gender, address); // Ke thua cac thuoc tinh tu ham cha
      this.MSSV = MSSV;
      this.DiemMon1 = DiemMon1;
      this.DiemMon2 = DiemMon2;
   }

   // Getter va setter
   public int getMSSV() {
      return MSSV;
   }

   public float getDiemMon1() {
      return DiemMon1;
   }

   public float getDiemMon2() {
      return DiemMon2;
   }

   public void setMSSV(int MSSV) {
      this.MSSV = MSSV;
   }

   public void setDiemmon1(float diemMon1) {
      this.DiemMon1 = diemMon1;
   }

   public void setDiemmon2(float diemMon2) {
      this.DiemMon2 = diemMon2;
   }

   // Methode tính điểm trung bình cho SV CT (DiemMon1*2+DiemMon2)/3
   public float DiemTB(float diemMon1, float diemMon2) {
      return (DiemMon1 * 2 + DiemMon2) / 3;
   }

   @Override
   public String showInfo() {// Method hiển thị thông tin tương ứng với Student.
      return "Student: {" + "Name: '" + name + '\'' + ", Age:" + age + ", Gender:" + gender + ", Address: '" + address
            + ", MSSV:" + MSSV + ", Diem Mon 1:" + DiemMon1 + ", Diem Mon 2:" + DiemMon2 + ", Diem TB  :"
            + this.DiemTB(DiemMon1, DiemMon2) + '\'' + '}';
   }
}
